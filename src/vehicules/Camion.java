package vehicules;

// Classe fille pour les camions (motorisés)
public class Camion extends VehiculeMotorise {
    private int capaciteDeCharge;

    public Camion(String nom, int vitesseMax, String couleur, int poids, int puissance, String typeCarburant, int nombreDePassagers, int capaciteDeCharge) {
        super(nom, vitesseMax, couleur, poids, puissance, typeCarburant, nombreDePassagers);
        this.capaciteDeCharge = capaciteDeCharge;
    }

    @Override
    public void demarrer() {
        System.out.println("Le camion est démarré.");
    }

    @Override
    public String toString() {
        return super.toString() + "\nCapacité de charge: " + capaciteDeCharge + " tonnes";
    }
}