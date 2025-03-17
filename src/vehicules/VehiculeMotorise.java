package vehicules;

// Classe fille pour les véhicules motorisés
public class VehiculeMotorise extends Vehicule {
    private int puissance;
    private String typeCarburant;
    private int nombreDePassagers;

    public VehiculeMotorise(String nom, int vitesseMax, String couleur, int poids, int puissance, String typeCarburant, int nombreDePassagers) {
        super(nom, vitesseMax, couleur, poids);
        this.puissance = puissance;
        this.typeCarburant = typeCarburant;
        this.nombreDePassagers = nombreDePassagers;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public String getTypeCarburant() {
        return typeCarburant;
    }

    public void setTypeCarburant(String typeCarburant) {
        this.typeCarburant = typeCarburant;
    }

    public int getNombreDePassagers() {
        return nombreDePassagers;
    }

    public void setNombreDePassagers(int nombreDePassagers) {
        this.nombreDePassagers = nombreDePassagers;
    }

    public void demarrer() {
        System.out.println("Le moteur est démarré.");
    }

    @Override
    public String toString() {
        return super.toString() + "\nPuissance: " + puissance + " chevaux\nType de carburant: " + typeCarburant + "\nNombre de passagers: " + nombreDePassagers;
    }
}
