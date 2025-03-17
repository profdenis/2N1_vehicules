package vehicules;

// Classe fille pour les motos (motorisées)
public class Moto extends VehiculeMotorise {
    private int cylindree;

    public Moto(String nom, int vitesseMax, String couleur, int poids, int puissance, String typeCarburant, int nombreDePassagers, int cylindree) {
        super(nom, vitesseMax, couleur, poids, puissance, typeCarburant, nombreDePassagers);
        this.cylindree = cylindree;
    }

    public int getCylindree() {
        return cylindree;
    }

    public void setCylindree(int cylindree) {
        this.cylindree = cylindree;
    }

    @Override
    public void demarrer() {
        System.out.println("La moto est démarrée.");
    }

    @Override
    public String toString() {
        return super.toString() + "\nCylindrée: " + cylindree + " cm³";
    }
}



