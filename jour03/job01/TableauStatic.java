package jour03.job01;

public class TableauStatic {
    public static void main(String[] args) {
        int[] tableau = {10, 1, 2, 4, 69};
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("tableau[" + i + "] = " + tableau[i]);
            }
        System.out.println("A l'index 1 on retrouve la valeur " + tableau[1]);
    }
}