package jour06.job10;

public class Majority {
    public static void main ( String[] args){
        try(java.util.Scanner sc = new java.util.Scanner(System.in)){
            System.out.println("Entrez votre âge :");
        int age = sc.nextInt();

            if (age < 18){
                System.out.println("Vous êtes mineur.");
            } else {
                System.out.println("Vous êtes majeur.");
            }
        }
    }
}
