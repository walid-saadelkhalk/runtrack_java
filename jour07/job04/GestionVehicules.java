package jour07.job04;

public class GestionVehicules {
    protected String marque = "Inconnu";
    protected String dateAchat = "Inconnu";
    protected int prixAchat = 0;
    protected int prixCourant = 0;

    public GestionVehicules(String marque, String dateAchat, int prixAchat) {
        this.marque = marque;
        this.dateAchat = dateAchat;
        this.prixAchat = prixAchat;
    }

    public void calculePrix(int anneeActuelle){
        int dateAchatInt = Integer.parseInt(dateAchat);
        
        for (int i = 0; i < anneeActuelle - (dateAchatInt - 1); i++) {
            prixCourant = prixAchat - (prixAchat * 1 / 100);
            if (prixCourant < 0)
                prixCourant = 0;
            prixAchat = prixCourant;
        }
        System.out.println("année actuelle: " + anneeActuelle);
        System.out.println("prix d'achat actuel: " + prixCourant + " $");
    }

    public void afficher() {
        System.out.println("Marque: " + marque);
        System.out.println("Date d'achat: " + dateAchat);
        System.out.println("Prix d'achat d'initial: " + prixAchat + " $");
        
    }

    public static void main(String[] args) {
        GestionVehicules vehicule = new GestionVehicules("Renault", "2020", 1000);
        vehicule.afficher();
        vehicule.calculePrix(2024);

        System.out.println();
        Voiture voiture = new Voiture("Peugeot", "2020", 15000, 5, 20000, 100, 52224);
        voiture.afficher();

        System.out.println();
        Avion avion = new Avion("Airbus A400M", "2020", 1500000, "hélices", 300);
        avion.afficher();
    }
}
