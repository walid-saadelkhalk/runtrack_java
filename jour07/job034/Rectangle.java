package jour07.job034;

public class Rectangle extends Figure{
    double longueur = 15.0d;
    double largeur = 10.0d;

    Rectangle(){
    }

    double surface (){
        return longueur * largeur;
    }

    void afficher(){
        System.out.println("\nRectangle:");
        super.afficher();
        System.out.println("Longueur: " + longueur + " cm");
        System.out.println("Largeur: " + largeur + " cm");
        System.out.println("Surface: " + surface() + " cm²");
    }
}
