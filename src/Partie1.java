import vehicules.*;

public class Partie1 {
    public static void main(String[] args) {
        Velo velo = new Velo("VTT", 40, 21);
        Caleche caleche = new Caleche("vehicules.Caleche de luxe", 10, "Cheval", 2);
        PatinsARoulettes patins = new PatinsARoulettes("Patins de vitesse", 30, 4);
        Moto moto = new Moto("Honda CB500F", 180, 47, 500);
        Voiture voiture = new Voiture("Peugeot 308", 220, 130, 5);
        Camion camion = new Camion("Mercedes-Benz Actros", 120, 500, 20);

        System.out.println("Détails du vélo:\n" + velo);
        System.out.println("\nDétails de la calèche:\n" + caleche);
        System.out.println("\nDétails des patins à roulettes:\n" + patins);
        System.out.println("\nDétails de la moto:\n" + moto);
        System.out.println("\nDétails de la voiture:\n" + voiture);
        System.out.println("\nDétails du camion:\n" + camion);
    }
}
