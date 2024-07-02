package jour07.job03;

public class FiguresGeometriques {
    public static void main(String[] args){

        // Test de la classe Rectangle
        System.out.println("Test de rectangle:");
        RectangleColore rectangle = new RectangleColore();
        System.out.println("Longueur: " + rectangle.getLongueur() + "cm");
        System.out.println("Largeur: " + rectangle.getLargeur() + "cm");
        System.out.println("Surface: " + rectangle.surface() + "cm²");
        System.out.println("numero de couleur: " + rectangle.getCouleur());
        rectangle.setLongueur(20.0d);
        rectangle.setLargeur(15.0d);
        rectangle.setCouleur(1);
        System.out.println("Longueur: " + rectangle.getLongueur() + "cm");
        System.out.println("Largeur: " + rectangle.getLargeur() + "cm");
        System.out.println("Surface: " + rectangle.surface() + "cm²");
        System.out.println("numero de couleur: " + rectangle.getCouleur());

        // Test de la classe Cerle
        System.out.println("\nTest de cercle:");
        Cerle cercle = new Cerle();
        cercle.afficher();
        cercle.setRayon(10.0d);
        cercle.setCentre(5.0d, 5.0d);
        cercle.afficher();
    }
}
