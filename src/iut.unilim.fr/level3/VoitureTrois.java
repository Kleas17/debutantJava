package iut.unilim.fr;
import Roue;

class Voiture {
    private final String marque;
    private final String couleur;
    private final listeRoues;
    private boolean demarrer;
    private int vitesse;

    // Constructeur
    public Voiture(String marque, String couleur) {
        this.marque = marque;
        this.couleur = couleur;
        this.vitesse = 0;
        this.listeRoues = new ArrayList<>();
        this.demarrer = false;
    }

    public void ajouterRoue(Roue roue){
        if(this.listeRoue.size() < 4){
            this.listeRoues.add(roue);
        }else{
            System.out.println("Impossible d'ajouter plus de 4 roues à une voiture !")
        }
    }

    public void demarrer(){
        this.demarrer = true;
    }

    // Méthodes
    public void accelerer() {
        if(this.listeRoue.size() == 4){
            if(this.demarrer){
                vitesse += 10;
            }else{
                System.out.println("La voiture doit être démarrée !")
            }
        }else{
            System.out.println("La voiture doit avoir 4 roues !")
        }
    }

    public void freiner() {
        vitesse -= 10;

        if(vitesse < 0){
            vitesse = 0;
        }
    }

    public void afficherInfos() {
        System.out.println("Marque: " + this.marque + ", Couleur: " + this.couleur + ", Vitesse: " + this.vitesse + " km/h, Roues: "+this.listeRoues.size()+", Demarre: "+this.demarrer);
    }
}