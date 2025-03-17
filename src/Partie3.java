import vehicules.*;

import java.io.IOException;

public class Partie3 {
    public static void main(String[] args) {
        GestionnaireVehicules gestionnaire = new GestionnaireVehicules();

        Velo velo = new Velo("VTT", 40, "Bleu", 15, 21);
        Caleche caleche = new Caleche("Caleche de luxe", 10, "Brun", 500, "Cheval", 2);
        PatinsARoulettes patins = new PatinsARoulettes("Patins de vitesse", 30, "Rouge", 2, 4);
        Moto moto = new Moto("Honda CB500F", 180, "Noir", 200, 47, "Essence", 2, 500);
        Voiture voiture = new Voiture("Peugeot 308", 220, "Gris", 1200, 130, "Essence", 5, 5);
        Camion camion = new Camion("Mercedes-Benz Actros", 120, "Blanc", 5000, 500, "Diesel", 2, 20);

        gestionnaire.ajouterVehicule(velo);
        gestionnaire.ajouterVehicule(caleche);
        gestionnaire.ajouterVehicule(patins);
        gestionnaire.ajouterVehicule(moto);
        gestionnaire.ajouterVehicule(voiture);
        gestionnaire.ajouterVehicule(camion);

        System.out.println(gestionnaire);

        try {
            gestionnaire.sauvegarder("vehicules.json");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        gestionnaire.clear(); // Nettoyer la liste pour tester le chargement

        try {
            gestionnaire.charger("vehicules.json");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(gestionnaire);
    }
}

