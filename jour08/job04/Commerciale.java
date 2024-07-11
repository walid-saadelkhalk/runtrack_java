package jour08.job04;

import java.util.Vector;
import java.util.Date;

public class Commerciale {
    private Vector<Article> articles;
    private Vector<Client> clients;
    private Vector<Commande> commandes;
    private Vector<Ligne> lignes;

    public Commerciale() {
        articles = new Vector<>();
        clients = new Vector<>();
        commandes = new Vector<>();
        lignes = new Vector<>();
    }

    public void passerCommande(Commande c) {
        commandes.add(c);
    }

    public void annulerCommande(Commande c) {
        commandes.remove(c);
    }

    public void ajouterArticle(Article a) {
        articles.add(a);
    }

    public void supprimerArticle(Article a) {
        articles.remove(a);
    }

    public void ajouterClient(Client c) {
        clients.add(c);
    }

    public void supprimerClient(Client c) {
        clients.remove(c);
    }

    public void ajouterLigne(Ligne l) {
        lignes.add(l);
    }

    public void supprimerLigne(Ligne l) {
        lignes.remove(l);
    }

    public Vector<Article> getArticles() {
        return articles;
    }

    public Vector<Client> getClients() {
        return clients;
    }

    public Vector<Commande> getCommandes() {
        return commandes;
    }

    public Vector<Ligne> getLignes() {
        return lignes;
    }

    public static void main(String[] args) {
        Commerciale commerciale = new Commerciale();

        // Ajouter des articles
        Article article1 = new Article("A001", "Stylo", 1.50, 100);
        Article article2 = new Article("A002", "Cahier", 2.00, 50);
        commerciale.ajouterArticle(article1);
        commerciale.ajouterArticle(article2);

        // Ajouter des clients
        Client client1 = new Client(1, "Client A", "123 Rue A", 5000.0);
        Client client2 = new Client(2, "Client B", "456 Rue B", 3000.0);
        commerciale.ajouterClient(client1);
        commerciale.ajouterClient(client2);

        // Passer des commandes
        Commande commande1 = new Commande(1, new Date(), client1);
        commerciale.passerCommande(commande1);

        // Ajouter des lignes de commande
        Ligne ligne1 = new Ligne(commande1, article1, 10);
        commerciale.ajouterLigne(ligne1);

        // Afficher les articles
        System.out.println("Articles:");
        for (Article a : commerciale.getArticles()) {
            a.affiche();
        }

        // Afficher les clients
        System.out.println("\nClients:");
        for (Client c : commerciale.getClients()) {
            c.affiche();
        }

        // Afficher les commandes
        System.out.println("\nCommandes:");
        for (Commande c : commerciale.getCommandes()) {
            System.out.println("Commande N°: " + c.getNumeroCommande() + ", Date: " + c.getDateCommande() + ", Client: " + c.getClient().getNomSocial());
        }

        // Afficher les lignes de commande
        System.out.println("\nLignes de commande:");
        for (Ligne l : commerciale.getLignes()) {
            System.out.println("Commande N°: " + l.getCommande().getNumeroCommande() + ", Article: " + l.getArticle().getDesignation() + ", Quantité: " + l.getQuantiteCommande());
        }
    }
}

