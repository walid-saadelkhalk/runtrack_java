package jour07.job04;

public class Avion extends GestionVehicules{
    protected String Moteur = "HELICES";
    protected int nbHeures = 0;

    String getMoteur() {
        return Moteur;
    }
    void setMoteur(String Moteur) {
        this.Moteur = Moteur;
    }

    int getNbHeures() {
        return nbHeures;
    }
    void setNbHeures(int nbHeures) {
        this.nbHeures = nbHeures;
    }

    public Avion(String marque, String dateAchat, int prixAchat, String Moteur, int nbHeures) {
        super(marque, dateAchat, prixAchat);
        this.Moteur = Moteur;
        this.nbHeures = nbHeures;
    }

    public int pourcentageDeVol() {
        int pourcentageVol = 0;
    
        if (Moteur.equals("hélices")) {
            if (nbHeures < 100) {
                pourcentageVol = 0;
            } else if (nbHeures >= 100 && nbHeures < 1000) {
                pourcentageVol = (nbHeures /100) * 10;
            } else if (nbHeures >= 1000) {
                System.out.println("L'avion a dépassé les 1000 heures de vol, il n'est plus utilisable.");
                return pourcentageVol;
            }
        } else {
            if (nbHeures < 1000) {
                pourcentageVol = 0;
            } else if (nbHeures >= 1000 && nbHeures < 10000) {
                pourcentageVol = (nbHeures /1000) * 10;
                System.out.println("Pourcentage de vol icici: " + pourcentageVol + " $");
            } else if (nbHeures >= 10000) {
                System.out.println("L'avion a dépassé les 10000 heures de vol, il n'est plus utilisable.");
                return pourcentageVol; 
            }
        }
    
        return pourcentageVol;
    }
    

    public void calculePrix(){
        int prixAvion = prixAchat;
        int pourcentageVol = pourcentageDeVol();

        int prixAvionActuel = prixAvion - (prixAvion * pourcentageVol / 100);
        if (prixAvionActuel < 0)
            prixAvionActuel = 0;
        System.out.println("Pourcentage de vol: " + pourcentageVol );
        System.out.println("Prix actuel de l'avion: " + prixAvionActuel + " $");
    }

    public void afficher() {
        super.afficher();
        System.out.println("Moteur: " + Moteur);
        System.out.println("Nombre d'heures: " + nbHeures + " h");
        calculePrix();
    }

}
