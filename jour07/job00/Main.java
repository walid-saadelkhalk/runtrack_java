package jour07.job00;


public class Main {

    // private attributs
    private String adresse = "1 rue de la Republique 13001 Marseille";
    private String telephone = "01 23 45 67 89";

    // protected attributs
    protected String birthDate = "01/01/1970";
    protected String birthCity = "Marseille";


    // public attributs
    public String name = "Doe";
    public String firstName = "John";

    // getters & setters
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public static void main (String[] args) {
        Main main = new Main();
        System.out.println("adresse: " + main.getAdresse());

        System.out.println("telephone: " + main.getTelephone());

        System.out.println("date de naissance: " + main.birthDate);

        System.out.println("lieu de naissance: " + main.birthCity);

        System.out.println("nom: " + main.name);

        System.out.println("prenom: " +main.firstName);
    }

}
