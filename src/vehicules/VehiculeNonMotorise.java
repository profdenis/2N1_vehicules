package vehicules;

// Classe fille pour les véhicules non-motorisés
class VehiculeNonMotorise extends Vehicule {
    private String typePropulsion;

    public VehiculeNonMotorise(String nom, int vitesseMax, String couleur, int poids, String typePropulsion) {
        super(nom, vitesseMax, couleur, poids);
        this.typePropulsion = typePropulsion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType de propulsion: " + typePropulsion;
    }
}
