package jour06.job01;

public class AfficherSaisie {
    public static void main (String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            System.out.println("Entrez un mot : ");
            System.out.println(sc.nextLine());
        }
    }
}
