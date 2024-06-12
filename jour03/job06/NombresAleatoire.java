package jour03.job06;

public class NombresAleatoire {
    public static void main (String[] args) {
        int[] tab = new int[10];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]+ " ");
        }
    }
}
