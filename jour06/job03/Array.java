package jour06.job03;

public class Array {
    public static void main(String[] args) {
        //   int tab[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; 
        int tab[] = new int[10];
        for (int i = 0; i<10; i++) {
            tab[i] = i;
            System.out.print("tab[" + i + "] = " + tab[i] + "\n");
        }
    }
}