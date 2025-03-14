package vehicules;

// Classe fille pour les patins à roulettes (non-motorisés)
public class PatinsARoulettes extends VehiculeNonMotorise {
    private int nombreDeRoues;

    public PatinsARoulettes(String nom, int vitesseMax, String couleur, int poids, int nombreDeRoues) {
        super(nom, vitesseMax, couleur, poids, "Poussée");
        this.nombreDeRoues = nombreDeRoues;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNombre de roues: " + nombreDeRoues;
    }
}

