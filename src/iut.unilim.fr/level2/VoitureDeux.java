package iut.unilim.fr;
import Roue;

class Voiture {
    private final String marque;
    private final String couleur;
    private boolean demarrer;
    private int vitesse;

    // Constructeur
    public Voiture(String marque, String couleur) {
        this.marque = marque;
        this.couleur = couleur;
        this.vitesse = 0;
        this.listeRoues = liste;
        this.demarrer = false;
    }

    public void demarrer(){
        this.demarrer = true;
    }

    // Méthodes
    public void accelerer() {
        if(this.demarrer){
            vitesse += 10;
        }else{
            System.out.println("La voiture doit être démarrée !")
        }

    }

    public void freiner() {
        vitesse -= 10;

        if(vitesse < 0){
            vitesse = 0;
        }
    }

    public void afficherInfos() {
        System.out.println("Marque: " + marque + ", Couleur: " + couleur + ", Vitesse: " + vitesse + " km/h", Demarre: "+this.demarrer);
    }
}