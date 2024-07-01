package jour06.job11;

public class Factorielle {
    public static void main (String[] args){
        int n = 8;
        int result = 1;
        for ( int i = 1;  i <=n; i++){
            result *= i;
        }
        System.out.println(result);
    }
}
