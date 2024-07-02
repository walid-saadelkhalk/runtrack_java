package jour07.job03;

public class Rectangle {
    protected double longueur = 15.0d;
    protected double largeur = 10.0d;
    
    Rectangle(){
    }

    double getLongueur(){
        return longueur;
    }
    void setLongueur(double longueur){
        this.longueur = longueur;
    }

    double getLargeur(){
        return largeur;
    }
    void setLargeur(double largeur){
        this.largeur = largeur;
    }

    double surface (){
        return longueur * largeur;
    }
}
