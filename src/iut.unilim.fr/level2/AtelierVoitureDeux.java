package iut.unilim.fr;

public class AtelierVoiture {
    public static void main(String[] args) {
        Voiture maVoiture = new Voiture("Toyota", "Rouge");

        for (int i = 0; i < 5; i++) {
            maVoiture.accelerer();
            maVoiture.afficherInfos();
        }
    }
}
