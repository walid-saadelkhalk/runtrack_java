package jour06.job14;

public class Times {
    public static void main (String[] args){
        try(java.util.Scanner sc = new java.util.Scanner(System.in)){
        System.out.print("Entrez un nombre: ");
        int n = sc.nextInt();
            for (int i = 0 ; i < 10; i++){
                if (n >= 0 && n < 10){
                    System.out.println(n + " x " + i + " = " + n * i);
                } else {
                    System.out.println("Le nombre doit être compris entre 0 et 10");
                    break;
                }
            }
        }
    }
}