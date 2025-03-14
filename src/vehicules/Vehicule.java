package vehicules;

// Classe parente Vehicule
class Vehicule {
    protected String nom;
    protected int vitesseMax;
    protected int vitesseCourante;
    protected String couleur;
    protected int poids;

    public Vehicule(String nom, int vitesseMax, String couleur, int poids) {
        this.nom = nom;
        this.vitesseMax = vitesseMax;
        this.vitesseCourante = 0; // Initialisation à 0
        this.couleur = couleur;
        this.poids = poids;
    }

    public void accelerer(double delta) {
        double nouvelleVitesse = vitesseCourante + delta;
        vitesseCourante = Math.min((int) nouvelleVitesse, vitesseMax);
        System.out.println("Vitesse courante après accélération: " + vitesseCourante + " km/h");
    }

    public void freiner(double delta) {
        double nouvelleVitesse = vitesseCourante - delta;
        vitesseCourante = Math.max((int) nouvelleVitesse, 0);
        System.out.println("Vitesse courante après freinage: " + vitesseCourante + " km/h");
    }

    public double calculerPrix() {
        // Calcul simplifié pour l'exemple
        return poids * 10.0;
    }

    @Override
    public String toString() {
        return "Nom du véhicule: " + nom + "\nVitesse maximale: " + vitesseMax + " km/h\nVitesse courante: " + vitesseCourante + " km/h\nCouleur: " + couleur + "\nPoids: " + poids + " kg";
    }
}




