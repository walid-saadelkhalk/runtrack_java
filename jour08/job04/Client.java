package jour08.job04;

public class Client extends Personne {
    private double chiffreAffaire;

    public Client(int identite, String nomSocial, String adresse, double chiffreAffaire) {
        super(identite, nomSocial, adresse);
        this.chiffreAffaire = chiffreAffaire;
    }

    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    @Override
    public void affiche() {
        System.out.println("Identité: " + identite);
        System.out.println("Nom Social: " + nomSocial);
        System.out.println("Adresse: " + adresse);
        System.out.println("Chiffre d'affaire: " + chiffreAffaire);
    }
}

