package jour01.job12;

public class ChangeString {
    public static void main(String[] args) {
        java.util.Scanner entree = new java.util.Scanner(System.in);
        try {
            System.out.print("Chaine de caractères 1 : ");
            String chaine1 = entree.nextLine();

            System.out.print("Chaine de caractères 2 : ");
            String chaine2 = entree.nextLine();


            chaine1 = chaine1 + chaine2;
            chaine2 = chaine1.substring(0, chaine1.length() - chaine2.length());
            chaine1 = chaine1.substring(chaine2.length());

            System.out.println("Chaine 1 : " + chaine1);
            System.out.println("Chaine 2 : " + chaine2);
        } finally {
            entree.close();
        }
    }
}
