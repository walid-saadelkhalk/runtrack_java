package jour06.job09;

public class AddCube {
    public static void main(String[] args) {
        try(java.util.Scanner sc = new java.util.Scanner(System.in)) {
            System.out.print("Entrez un nombre: ");
            int n = sc.nextInt();
            int sum = 0;

            for (int i = 0; i <= n; i++) {
                sum += i * i * i;
            }
            System.out.println("La somme des cubes de 1 à " + n + " est : " + sum);
        }
    }
}
