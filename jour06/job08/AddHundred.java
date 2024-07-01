package jour06.job08;

public class AddHundred {
    public static void main (String[] args){
        int[] tab = new int[100];
        int result = 0;
        for (int i = 0; i < 100; i++){
            tab[i] = i + 1;

            result = (i * (i + 1) / 2);
        }
        System.out.println(result);
    }
}
