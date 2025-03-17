package vehicules;


// Classe fille pour les voitures (motorisées)
public class Voiture extends VehiculeMotorise {
    private int nombreDePortes;

    public Voiture(String nom, int vitesseMax, String couleur, int poids, int puissance, String typeCarburant, int nombreDePassagers, int nombreDePortes) {
        super(nom, vitesseMax, couleur, poids, puissance, typeCarburant, nombreDePassagers);
        this.nombreDePortes = nombreDePortes;
    }

    public int getNombreDePortes() {
        return nombreDePortes;
    }

    public void setNombreDePortes(int nombreDePortes) {
        this.nombreDePortes = nombreDePortes;
    }

    @Override
    public void demarrer() {
        System.out.println("La voiture est démarrée.");
    }

    @Override
    public String toString() {
        return super.toString() + "\nNombre de portes: " + nombreDePortes;
    }
}
