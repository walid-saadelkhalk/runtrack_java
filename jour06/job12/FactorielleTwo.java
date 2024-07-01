package jour06.job12;

public class FactorielleTwo {
    public static void main (String[] args){
        try(java.util.Scanner sc = new java.util.Scanner(System.in)){

        System.out.print("Entrez un nombre: ");

        int n = sc.nextInt();
        int result = 1;
        for (int i = 1; i <=n; i++){
            result *= i;
        }
        System.out.println(result);
        }
    }
}
