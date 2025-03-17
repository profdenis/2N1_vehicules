package vehicules;


// Classe fille pour les calèches (non-motorisées)
public class Caleche extends VehiculeNonMotorise {
    private String typeAnimal;
    private int nombreDeChevaux;

    public Caleche(String nom, int vitesseMax, String couleur, int poids, String typeAnimal, int nombreDeChevaux) {
        super(nom, vitesseMax, couleur, poids, "Traction animale");
        this.typeAnimal = typeAnimal;
        this.nombreDeChevaux = nombreDeChevaux;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public void setTypeAnimal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    public int getNombreDeChevaux() {
        return nombreDeChevaux;
    }

    public void setNombreDeChevaux(int nombreDeChevaux) {
        this.nombreDeChevaux = nombreDeChevaux;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType d'animal: " + typeAnimal + "\nNombre de chevaux: " + nombreDeChevaux;
    }
}
