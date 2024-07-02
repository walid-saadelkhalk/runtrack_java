package jour07.job34;

public class Cercle extends Figure{
    Cercle(){
    }

    double rayon = 5.0d;

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
    
    void afficher(){
        System.out.println("\nCercle:");
        System.out.println("Centre du cercle: (" + x + ", " + y + ")");
        System.out.println("Rayon: " + rayon + " cm");
        System.out.println("Surface: " + surface() + " cm²");

        if (estInterieur() == true){
            System.out.println("Le point est à l'interieur du cercle");
        } else {
            System.out.println("Le point est à l'exterieur du cercle");
        }
    }
}
