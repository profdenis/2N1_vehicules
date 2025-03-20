package vehicules;

// Classe parente Vehicule
public class Vehicule {
    protected String type; // ajouté pour faciliter la désérialisation du JSON vers une liste de véhicules
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
        this.type = getClass().getSimpleName();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(int vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    public int getVitesseCourante() {
        return vitesseCourante;
    }

    public void setVitesseCourante(int vitesseCourante) {
        this.vitesseCourante = vitesseCourante;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
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
        return "Type: " + type + "\nNom du véhicule: " + nom + "\nVitesse maximale: " + vitesseMax + " km/h\nVitesse courante: " + vitesseCourante + " km/h\nCouleur: " + couleur + "\nPoids: " + poids + " kg";
    }
}




