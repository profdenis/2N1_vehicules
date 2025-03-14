package vehicules;

// Classe fille pour les véhicules non-motorisés
public class VehiculeNonMotorise extends Vehicule {
    private String typePropulsion;

    public VehiculeNonMotorise(String nom, int vitesseMax, String typePropulsion) {
        super(nom, vitesseMax);
        this.typePropulsion = typePropulsion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType de propulsion: " + typePropulsion;
    }
}
