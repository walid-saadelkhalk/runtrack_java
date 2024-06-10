package jour01.job14;

public class Somme {
    private int num1;
    private int num2;

    public Somme(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void afficherSomme() {
        System.out.println("La somme de " + num1 + " et " + num2 + " est " + (num1 + num2) + ".");
    }

    public static void main(String[] args) {
        Somme somme = new Somme(5, 3);
        somme.afficherSomme();
    }
}