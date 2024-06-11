package jour02.job11;

public class BuildTriangle {
    public static void main (String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print( "*");
            }
            System.out.println();
        }

        input.close();
        }
    }

