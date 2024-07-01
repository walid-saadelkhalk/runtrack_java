package jour06.job02;

public class EcrirePrenom {
    public static void main( String[] args ) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)){
            System.out.println("Entrez votre prénom : ");
            System.out.println("Bonjour " + sc.nextLine());}
    }
}
