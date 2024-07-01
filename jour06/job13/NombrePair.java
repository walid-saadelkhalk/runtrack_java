package jour06.job13;

public class NombrePair {
    public static void main (String[] args){
        try(java.util.Scanner sc = new java.util.Scanner(System.in)){
        System.out.print("Entrez un nombre: ");
        int n = sc.nextInt();

        int tab [] = new int[n];

            for (int i = 0; i < n; i++){
                tab[i] = i;
                if (tab[i] % 2 == 0){
                    System.out.print(i + " ");
                }
            }
        }
    } 
}
