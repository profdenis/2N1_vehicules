package vehicules;

// Classe fille pour les véhicules motorisés
class VehiculeMotorise extends Vehicule {
    private int puissance;
    private String typeCarburant;
    private int nombreDePassagers;

    public VehiculeMotorise(String nom, int vitesseMax, String couleur, int poids, int puissance, String typeCarburant, int nombreDePassagers) {
        super(nom, vitesseMax, couleur, poids);
        this.puissance = puissance;
        this.typeCarburant = typeCarburant;
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
