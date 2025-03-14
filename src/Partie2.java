import vehicules.*;

public class Partie2 {
    public static void main(String[] args) {
        Velo velo = new Velo("VTT", 40, "Bleu", 15, 21);
        Caleche caleche = new Caleche("Caleche de luxe", 10, "Brun", 500, "Cheval", 2);
        PatinsARoulettes patins = new PatinsARoulettes("Patins de vitesse", 30, "Rouge", 2, 4);
        Moto moto = new Moto("Honda CB500F", 180, "Noir", 200, 47, "Essence", 2, 500);
        Voiture voiture = new Voiture("Peugeot 308", 220, "Gris", 1200, 130, "Essence", 5, 5);
        Camion camion = new Camion("Mercedes-Benz Actros", 120, "Blanc", 5000, 500, "Diesel", 2, 20);

        System.out.println("Détails du vélo:\n" + velo);
        System.out.println("\nDétails de la calèche:\n" + caleche);
        System.out.println("\nDétails des patins à roulettes:\n" + patins);
        System.out.println("\nDétails de la moto:\n" + moto);
        moto.demarrer();
        moto.accelerer(20);
        moto.freiner(10);
        System.out.println("\nDétails de la voiture:\n" + voiture);
        voiture.demarrer();
        voiture.accelerer(30);
        voiture.freiner(15);
        System.out.println("\nDétails du camion:\n" + camion);
        camion.demarrer();
        camion.accelerer(10);
        camion.freiner(5);
    }

}
