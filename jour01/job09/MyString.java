package jour01.job09;

public class MyString {
    public static void main(String[] args) {
        //First way to declare a string
        String myString = "Hello World !";
        
        //Second way to declare a string
        String myString2;
        myString2 = "Hello World !";

        //Third way to declare a string
        String myString3 = new String("Hello World !");

        //Fourth way to declare a string
        char [] helloArray = { 'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', ' ', '!' };
        String helloString = new String(helloArray);

        
        System.out.println(myString);
        System.out.println(myString2);
        System.out.println(myString3);
        System.out.println(helloString);
    }
}
