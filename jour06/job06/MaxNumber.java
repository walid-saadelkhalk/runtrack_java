package jour06.job06;

public class MaxNumber {
    public static void main (String[] args){
        try(java.util.Scanner number = new java.util.Scanner(System.in)){
            System.out.print("Enter three numbers: ");
        

        int i = number.nextInt();
        int j = number.nextInt();
        int k = number.nextInt();
        
        if (i > j && i > k)
            System.out.println("The greatest number is " + i);
        else if (j > i && j > k)
            System.out.println("The greatest number is " + j);
        else
            System.out.println("The greatest number is " + k);
        }
    }
}
