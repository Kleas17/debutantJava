package iut.unilim.fr;

public class AtelierVoiture {
    public static void main(String[] args) {
        Voiture maVoiture = new Voiture("Toyota", "Rouge");
        maVoiture.accelerer();
        maVoiture.afficherInfos();
        maVoiture.freiner();
        maVoiture.afficherInfos();

        maVoiture.addRoue(new Roue(3.0));
        maVoiture.addRoue(new Roue(3.0));
        maVoiture.addRoue(new Roue(3.0));
        maVoiture.addRoue(new Roue(3.0));

        for (int i = 0; i < 4; i++) {
            maVoiture.avancer();
            maVoiture.afficherInfos();
        }
    }
}