package jour02.job08;

public class CompteChiffre {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        String numberString = Integer.toString(number);
        int length = numberString.length();
        System.out.println("Number of digits in " + number + " is " + length);

        input.close();
    }
}
