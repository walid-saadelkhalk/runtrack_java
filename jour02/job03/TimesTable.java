package jour02.job03;

public class TimesTable {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
        input.close();
    }
}
