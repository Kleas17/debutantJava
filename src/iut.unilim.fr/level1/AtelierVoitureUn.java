package iut.unilim.fr;

public class AtelierVoiture {
    public static void main(String[] args) {
        Voiture maVoiture = new Voiture("Toyota", "Rouge");
        maVoiture.accelerer();
        maVoiture.afficherInfos();
        maVoiture.freiner();
        maVoiture.afficherInfos();
    }
}