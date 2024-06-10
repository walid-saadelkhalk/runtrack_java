package jour01.job06;

public class ExerciceVariable {
    public static void main(String[] args) {
        byte num1 = 5;
        byte num2 = 3;
        System.out.println("La valeur de num1 est " + num1 + ", et la valeur de num2 est " + num2);

        byte temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("La valeur de num1 est " + num1 + ", et la valeur de num2 est " + num2);
    }
}
