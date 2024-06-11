package jour02.job09;

public class ReceiveFirstLastNum {
    public static void main (String[] args){
        String num = "1234";
        int premierChiffre = 0;
        int dernierChiffre = 0;

        for (int i = 0; i < num.length(); i++) {
            if (i == 0) {
                premierChiffre = Character.getNumericValue(num.charAt(i));
            } else if (i == num.length() - 1) {
                dernierChiffre = Character.getNumericValue(num.charAt(i));
            }
        }
        System.out.println("Premier chiffre: " + premierChiffre + "\nDernier chiffre: " + dernierChiffre);
    }
}
