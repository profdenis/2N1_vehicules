package vehicules;

// Classe fille pour les véhicules motorisés
public class VehiculeMotorise extends Vehicule {
    private int puissance;

    public VehiculeMotorise(String nom, int vitesseMax, int puissance) {
        super(nom, vitesseMax);
        this.puissance = puissance;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPuissance: " + puissance + " chevaux";
    }
}
