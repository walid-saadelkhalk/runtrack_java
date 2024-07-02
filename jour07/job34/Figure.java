package jour07.job34;

public class Figure {
    protected double x = 15.0d;
    protected double y = 10.0d;

    Figure(){
    }

    void afficher(){
        System.out.println("centre: " + x + ", " + y);
    }

    void setCentre(double x, double y){
        this.x = x;
        this.y = y;
    }

    public static void main (String[] args){
        Figure figure = new Figure();
        figure.afficher();
        
        Cercle cercle = new Cercle();
        cercle.afficher();

        RectangleColore rectangle = new RectangleColore();
        rectangle.afficher();
    }
}
