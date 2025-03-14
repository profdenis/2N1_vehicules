package vehicules;

// Classe parente Vehicule
public class Vehicule {
    protected String nom;
    protected int vitesseMax;

    public Vehicule(String nom, int vitesseMax) {
        this.nom = nom;
        this.vitesseMax = vitesseMax;
    }

    @Override
    public String toString() {
        return "Nom du véhicule: " + nom + "\nVitesse maximale: " + vitesseMax + " km/h";
    }
}

