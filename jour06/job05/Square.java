package jour06.job05;

public class Square {
    public static void main(String[] args) {
        java.util.Scanner number = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = number.nextInt();
        System.out.println("Square of " + n + " is " + Math.pow(n, 2));
        number.close();
    }
}
