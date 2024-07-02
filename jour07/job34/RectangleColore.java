package jour07.job34;

public class RectangleColore extends Rectangle{
    protected int couleur = 0;

    RectangleColore(){
    }

    int getCouleur(){
        return couleur;
    }
    void setCouleur(int couleur){
        this.couleur = couleur;
    }
    
    void afficher(){
        super.afficher();
        System.out.println("numero de couleur: " + couleur);
    }
}
