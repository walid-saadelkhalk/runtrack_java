package jour02.job06;

public class CalculPair {

    void Somme() {
        int somme = 0;
        for (int i = 0; i <= 100; i+=2) {
            somme += i;
            }
        System.out.println("la somme des nombres pairs de 0 à 100 est: " + somme + " " );
    }


    public static void main(String[] args) {
        for (int i = 0; i <= 100; i ++) {
            System.out.print(i + " ");
            
            }
            System.out.println(" ");
            CalculPair calcul = new CalculPair(); 
            calcul.Somme(); 
    }
    
}
