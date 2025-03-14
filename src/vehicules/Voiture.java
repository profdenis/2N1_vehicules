package vehicules;

// Classe fille pour les voitures (motorisées)
public class Voiture extends VehiculeMotorise {
    private int nombreDePortes;

    public Voiture(String nom, int vitesseMax, int puissance, int nombreDePortes) {
        super(nom, vitesseMax, puissance);
        this.nombreDePortes = nombreDePortes;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNombre de portes: " + nombreDePortes;
    }
}
