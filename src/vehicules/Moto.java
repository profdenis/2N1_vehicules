package vehicules;

// Classe fille pour les motos (motorisées)
public class Moto extends VehiculeMotorise {
    private int cylindree;

    public Moto(String nom, int vitesseMax, int puissance, int cylindree) {
        super(nom, vitesseMax, puissance);
        this.cylindree = cylindree;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCylindrée: " + cylindree + " cm³";
    }
}
