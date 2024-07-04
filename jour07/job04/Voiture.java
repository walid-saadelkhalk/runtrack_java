package jour07.job04;

public class Voiture extends GestionVehicules{
    protected int nbPortes = 0;
    protected int cylindree = 0;
    protected int puissance = 0;
    protected int kilometrage = 0;

    int getNbPortes() {
        return nbPortes;
    }
    void setNbPortes(int nbPortes) {
        this.nbPortes = nbPortes;
    }

    int getCylindree() {
        return cylindree;
    }
    void setCylindree(int cylindree) {
        this.cylindree = cylindree;
    }

    int getPuissance() {
        return puissance;
    }
    void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    int getKilometrage() {
        return kilometrage;
    }
    void setKilometrage(int kilometrage) {
        this.kilometrage = kilometrage;
    }

    public Voiture(String marque, String dateAchat, int prixAchat, int nbPortes, int cylindree, int puissance, int kilometrage) {
        super(marque, dateAchat, prixAchat);
        this.nbPortes = nbPortes;
        this.cylindree = cylindree;
        this.puissance = puissance;
        this.kilometrage = kilometrage;
    }

    public int arrondiKilometrage() {
        int kilometrageArrondi = kilometrage / 10000;
        int pourcentKilometrage = 5;
        String str = Integer.toString(kilometrage);
        char[] charArray = str.toCharArray();

        if (kilometrage > 10000 && kilometrage < 100000)
            if (charArray[1] >= '5')
                kilometrageArrondi += 1;
            else
                kilometrageArrondi += 0;
        else if (kilometrage > 100000 && kilometrage < 200000)
            if (charArray[2] >= '5')
                kilometrageArrondi += 1;
            else
                kilometrageArrondi += 0;
        else if (kilometrage > 200000)
            System.out.println("Kilométrage trop élevé, voiture à changer.");
        else 
            pourcentKilometrage = 1;
        return kilometrageArrondi * pourcentKilometrage;
    }

    public int prixMarqueVoiture(){
        int prixAchatMarque = prixAchat;
        if (marque.equals("Renault") || marque.equals("Fiat")){
            prixAchatMarque = prixAchatMarque - (prixAchatMarque * 10 / 100);
        }else if (marque.equals("Ferrari") || marque.equals("Porsche")){
            prixAchatMarque = prixAchatMarque + (prixAchatMarque * 20 / 100);
        }
        return prixAchatMarque;
    }
    
    public void calculePrix(int anneeActuelle){
        int dateAchatInt = Integer.parseInt(dateAchat);
        prixMarqueVoiture();
        int prixCourantKilo = prixMarqueVoiture() - (prixMarqueVoiture() * arrondiKilometrage() / 100);
        for (int i = 0; i < anneeActuelle - (dateAchatInt - 1); i++) {
            prixCourant = prixCourantKilo - (prixCourantKilo * 2 / 100 );
            if (prixCourant < 0)
                prixCourant = 0;
                prixCourantKilo = prixCourant;
            }
        if (prixCourant < 0)
            prixCourant = 0;
            System.out.println("annee actuelle: " + anneeActuelle);
            System.out.println("prix courant: " + prixCourant + " $");
    }

    public int prixActuel(){
        return prixCourant;
    }

    public void afficher() {
        System.out.println();
        super.afficher();
        System.out.println("Nombre de portes: " + nbPortes);
        System.out.println("Cylindrée: " + cylindree + " cm3");
        System.out.println("Puissance: " + puissance + " ch");
        System.out.println("Kilométrage: " + kilometrage + " km");
        calculePrix(2021);
        System.out.println("Prix actuel: " + prixActuel() + " $\n");
    }
}
    

