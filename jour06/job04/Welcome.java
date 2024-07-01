package jour06.job04;

public class Welcome {
    public static void main(String[] args) {
        try(java.util.Scanner scanner = new java.util.Scanner(System.in)){
            System.out.print("Enter your name: ");
            System.out.println("Welcome " + scanner.nextLine() + " !");
        }
    }
    
}
