package jour02.job05;

public class LegalAge {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if (age < 16) {
            System.out.println("Tu n'es pas en age de travailler.");
        } else if (age >= 16 && age < 55) {
            System.out.println("Tu es en age de travailler.");
        } else if (age >= 55 && age < 67) {
            System.out.println("Tu vas avoir du mal à trouver du travail.");
        } else {
            System.out.println("Tu es en age de retraite.");
        }
        input.close();
    }
}
