package jour06.job15;

public class Inverse {
    public static void main(String[] args) {
        try(java.util.Scanner sc = new java.util.Scanner(System.in)) {
            System.out.print("Entrez un nombre : ");
            int n = sc.nextInt();

            String iText = n + "";
            String iTextInverse = "";

            for (int i = iText.length() - 1; i >= 0; i--) {
                iTextInverse = iTextInverse + iText.charAt(i);
            }
            System.out.println("Le nombre inversé est : " + iTextInverse);
        }
    }
}
