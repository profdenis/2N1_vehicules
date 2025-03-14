package vehicules;

// Classe fille pour les camions (motorisés)
public class Camion extends VehiculeMotorise {
    private int capaciteDeCharge;

    public Camion(String nom, int vitesseMax, int puissance, int capaciteDeCharge) {
        super(nom, vitesseMax, puissance);
        this.capaciteDeCharge = capaciteDeCharge;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCapacité de charge: " + capaciteDeCharge + " tonnes";
    }
}
