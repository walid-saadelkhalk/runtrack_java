package jour01.job10;


public class UserName {
    public static void main(String[] args) {
        java.util.Scanner entree = new java.util.Scanner(System.in);
        try{
            System.out.print("Entrez votre nom : ");
            String lastName = entree.next();
            System.out.print("Entrez votre prénom : ");
            String firstName = entree.next();

            System.out.println("Bonjour " + firstName + " " + lastName + " !");

        } finally {
            entree.close();
        }   
    }
}

