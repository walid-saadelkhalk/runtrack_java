package jour08.job04;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Commerciale commerciale = new Commerciale();
        Scanner scanner = new Scanner(System.in);
        int choix = -1;

        do {
            System.out.println("=== Gestion commerciale ===");
            System.out.println("1) Ajouter un article");
            System.out.println("2) Supprimer un article");
            System.out.println("3) Ajouter un client");
            System.out.println("4) Supprimer un client");
            System.out.println("5) Passer une commande");
            System.out.println("6) Annuler une commande");
            System.out.println("0) Quitter");
            System.out.print("Entrer un choix: ");
            try {
                choix = scanner.nextInt();
                scanner.nextLine();

                switch (choix) {
                    case 1:
                        System.out.print("Entrer la référence de l'article: ");
                        String ref = scanner.nextLine();
                        System.out.print("Entrer la désignation de l'article: ");
                        String designation = scanner.nextLine();
                        System.out.print("Entrer le prix unitaire: ");
                        double prix = scanner.nextDouble();
                        System.out.print("Entrer la quantité en stock: ");
                        int quantite = scanner.nextInt();
                        scanner.nextLine(); 
                        Article article = new Article(ref, designation, prix, quantite);
                        commerciale.ajouterArticle(article);
                        System.out.println("Article ajouté avec succès !");
                        break;
                    case 2:
                        System.out.print("Entrer la référence de l'article à supprimer: ");
                        ref = scanner.nextLine();
                        Article articleASupprimer = null;
                        for (Article a : commerciale.getArticles()) {
                            if (a.getReference().equals(ref)) {
                                articleASupprimer = a;
                                break;
                            }
                        }
                        if (articleASupprimer != null) {
                            commerciale.supprimerArticle(articleASupprimer);
                            System.out.println("Article supprimé avec succès !");
                        } else {
                            System.out.println("Article non trouvé !");
                        }
                        break;
                    case 3:
                        System.out.print("Entrer l'identité du client: ");
                        int identite = scanner.nextInt();
                        scanner.nextLine(); 
                        System.out.print("Entrer le nom social du client: ");
                        String nomSocial = scanner.nextLine();
                        System.out.print("Entrer l'adresse du client: ");
                        String adresse = scanner.nextLine();
                        System.out.print("Entrer le chiffre d'affaire du client: ");
                        double chiffreAffaire = scanner.nextDouble();
                        scanner.nextLine();
                        Client client = new Client(identite, nomSocial, adresse, chiffreAffaire);
                        commerciale.ajouterClient(client);
                        System.out.println("Client ajouté avec succès !");
                        break;
                    case 4:
                        System.out.print("Entrer l'identité du client à supprimer: ");
                        identite = scanner.nextInt();
                        scanner.nextLine(); 
                        Client clientASupprimer = null;
                        for (Client c : commerciale.getClients()) {
                            if (c.getIdentite() == identite) {
                                clientASupprimer = c;
                                break;
                            }
                        }
                        if (clientASupprimer != null) {
                            commerciale.supprimerClient(clientASupprimer);
                            System.out.println("Client supprimé avec succès !");
                        } else {
                            System.out.println("Client non trouvé !");
                        }
                        break;
                    case 5:
                        System.out.print("Entrer le numéro de la commande: ");
                        int numeroCommande = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Entrer l'identité du client pour la commande: ");
                        identite = scanner.nextInt();
                        scanner.nextLine(); 
                        client = null;
                        for (Client c : commerciale.getClients()) {
                            if (c.getIdentite() == identite) {
                                client = c;
                                break;
                            }
                        }
                        if (client != null) {
                            Commande commande = new Commande(numeroCommande, new Date(), client);
                            commerciale.passerCommande(commande);
                            System.out.println("Commande passée avec succès !");
                        } else {
                            System.out.println("Client non trouvé !");
                        }
                        break;
                    case 6:
                        System.out.print("Entrer le numéro de la commande à annuler: ");
                        numeroCommande = scanner.nextInt();
                        scanner.nextLine(); 
                        Commande commandeASupprimer = null;
                        for (Commande c : commerciale.getCommandes()) {
                            if (c.getNumeroCommande() == numeroCommande) {
                                commandeASupprimer = c;
                                break;
                            }
                        }
                        if (commandeASupprimer != null) {
                            commerciale.annulerCommande(commandeASupprimer);
                            System.out.println("Commande annulée avec succès !");
                        } else {
                            System.out.println("Commande non trouvée !");
                        }
                        break;
                    case 0:
                        System.out.println("Au revoir !");
                        break;
                    default:
                        System.out.println("Choix invalide. Veuillez réessayer.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrée invalide. Veuillez entrer un nombre.");
                scanner.nextLine(); 
            }
        } while (choix != 0);

        scanner.close();
    }
}




