package jour02.job12;

public class TouteCombinaison {
    public static void main(String[] args) {
        String de1 = "123456";
        String de2 = "123456";
        String de3 = "123456";
        int count = 0;

        for (int i = 0; i < de1.length(); i++) {
            for (int j = 0; j < de2.length(); j++) {
                for (int k = 0; k < de3.length(); k++) {
                    System.out.println( "combinaison " + count + ": " + de1.charAt(i) + ", " + de2.charAt(j) + ", " + de3.charAt(k));
                    count++;
                }
            }
            System.out.println("\nIl y a " + count + " combinaisons possibles.");
        }

    }
}
