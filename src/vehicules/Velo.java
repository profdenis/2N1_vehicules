package vehicules;

// Classe fille pour les vélos (non-motorisés)
public class Velo extends VehiculeNonMotorise {
    private int nombreDeVitesses;

    public Velo(String nom, int vitesseMax, int nombreDeVitesses) {
        super(nom, vitesseMax, "Pédalage");
        this.nombreDeVitesses = nombreDeVitesses;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNombre de vitesses: " + nombreDeVitesses;
    }
}
