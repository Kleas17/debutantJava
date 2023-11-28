package iut.unilim.fr;

public class Roue {
    private final double pression;

    public Roue(double pression){
        this.pression = pression;
    }

    public Roue(){
        this.pression = 0.0;
    }

    public double getPression(){
        return this.pression;
    }
}