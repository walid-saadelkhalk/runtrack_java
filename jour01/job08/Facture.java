package jour01.job08;

public class Facture {
    public static void main(String[] args) {
        float prixHT;
        int quantite;
        float tva;
    
        prixHT = 49.99f;
        quantite = 3;
        float tarifHT = prixHT * quantite;

        System.out.println("Le montant total est : " + (tarifHT));
        
        tva = 20f;
        float taxAmount = tarifHT * tva / 100;
        float tarifTTCValue = tarifHT + taxAmount;
        
        System.out.println("Le montant de la taxe est : " + String.format("%.3f", taxAmount));
        System.out.println("Le montant total à payer est : " + String.format("%.3f", tarifTTCValue));
    }
}