package vehicules;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.*;

public class GestionnaireVehicules {
    private List<Vehicule> vehicules;
    private final Gson gson;

    public GestionnaireVehicules() {
        this.vehicules = new ArrayList<>();

        this.gson = new GsonBuilder()
                .registerTypeAdapter(Vehicule.class, new VehiculeDeserializer())
                .create();
    }

    public List<Vehicule> getVehicules() {
        return new ArrayList<>(vehicules);  // Retourne une copie pour éviter les modifications externes
    }

    public Vehicule getVehicule(int index) {
        return vehicules.get(index);
    }

    public void charger(String nomFichier) throws IOException {
        try (Reader reader = new FileReader(nomFichier)) {
            vehicules = gson.fromJson(reader, new TypeToken<List<Vehicule>>() {
            }.getType());
        }
    }

    public void sauvegarder(String nomFichier) throws IOException {
        try (Writer writer = new FileWriter(nomFichier)) {
            gson.toJson(vehicules, writer);
        }
    }

    public void ajouterVehicule(Vehicule vehicule) {
        vehicules.add(vehicule);
    }

    public void clear() {
        vehicules.clear();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("***** GestionnaireVehicules *****\n");
        sb.append("Nombre de véhicules = ").append(vehicules.size()).append(",\n");
        sb.append("véhicules = \n");

        for (int i = 0; i < vehicules.size(); i++) {
            sb.append("----- ").append(i).append(" -----\n").append(vehicules.get(i)).append("\n\n");
        }
        return sb.toString();
    }
}

