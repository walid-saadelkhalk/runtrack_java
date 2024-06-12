package jour03.job03;

public class TableauString {
    
    public static void main(String[] args){
        String[] tab = {"Josette", "John", "Myrtille", "Marc"};
        System.out.println("Valeur tab[1] = " + tab[1]);
        System.out.println("Valeurs tab = " + tab[0] + ", " + tab[1] + ", " + tab[2] + ", " + tab[3]);
        tab[2] = "Mireille";
        System.out.println("Valeurs tab = " + tab[0] + ", " + tab[1] + ", " + tab[2] + ", " + tab[3]);
    }

}
