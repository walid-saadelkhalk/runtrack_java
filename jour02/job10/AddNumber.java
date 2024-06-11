package jour02.job10;

public class AddNumber {
    public static void main(String[] args) {
        String num = "1234";
        int sum = 0;

        for (int i = 0; i < num.length(); i++) {
            sum += Character.getNumericValue(num.charAt(i));
        }
        System.out.println("Sum of the digits: " + sum);
    }
}
