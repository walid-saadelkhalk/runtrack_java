package jour06.job07;



public class Moyenne {
private float somme = 0f;

public float getSomme() {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.println("Veuillez saisir cinq nombres : ");
    this.somme = scanner.nextInt();
    this.somme += scanner.nextInt();
    this.somme += scanner.nextInt();
    this.somme += scanner.nextInt();
    this.somme += scanner.nextInt();
    
    float average = somme / 5;
    scanner.close();
    return average;
    }
    
public static void main(String[] args) {
    Moyenne moyenne = new Moyenne();
    System.out.println("Veuillez saisir un nombre : " + moyenne.getSomme());
}
}
