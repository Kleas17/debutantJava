package iut.unilim.fr;
import Roue;

class Voiture {
    private final String marque;
    private final String couleur;
    private int vitesse;

    // Constructeur
    public Voiture(String marque, String couleur) {
        this.marque = marque;
        this.couleur = couleur;
        this.vitesse = 0;
    }


    // Méthodes
    public void accelerer() {
        vitesse += 10;
    }

    public void freiner() {
        vitesse -= 10;
    }

    public void afficherInfos() {
        System.out.println("Marque: " + marque + ", Couleur: " + couleur + ", Vitesse: " + vitesse + " km/h");
    }
}