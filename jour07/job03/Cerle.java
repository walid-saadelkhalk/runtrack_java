package jour07.job03;

public class Cerle {
    protected double x = 0.0d;
    protected double y = 0.0d;
    protected double rayon = 5.0d;

    Cerle(){
    }

    void afficher(){
        System.out.println("Centre: (" + x + ", " + y + ")");
        System.out.println("Rayon: " + rayon + "cm");
        System.out.println("Surface: " + surface() + "cm²");
        System.out.println("Le point est interieur: " + estInterieur());
    }

    double getX(){
        return x;
    }

    double getY(){
        return y;
    }

    double getRayon(){
        return rayon;
    }
    void setRayon(double rayon){
        this.rayon = rayon;
    }

    void setCentre(double x, double y){
        this.x = x;
        this.y = y;
    }

    double surface (){
        return Math.PI * rayon * rayon;
    }

    boolean estInterieur(){
        double X = 4.0d;
        double Y = 4.0d;


        double B = ( (X - x) * (X - x) ) + ( (Y - y) * (Y - y) );

        if (B <= (rayon * rayon)){
            return true;
        } else {
            return false;
        }
    }
}
