package jour05.job03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInputButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Fenêtre Simple");

        frame.setLayout(new BorderLayout());

        // Créer un panneau avec FlowLayout pour les nouveaux composants
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Créer une étiquette "Nom :"
        JLabel nameLabel = new JLabel("Nom :");

        // Créer un champ de texte pour entrer le nom
        JTextField nameField = new JTextField(20);

        // Créer un bouton "Envoyer"
        JButton sendButton = new JButton("Envoyer");

        // Ajouter les composants au panneau
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(sendButton);

        // Ajouter le panneau au centre de la fenêtre
        frame.add(panel, BorderLayout.CENTER);

        // Créer un bouton "Quitter"
        JButton quitButton = new JButton("Quitter");
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); 
            }
        });

        // Ajouter le bouton "Quitter" en bas de la fenêtre (position BorderLayout.SOUTH)
        frame.add(quitButton, BorderLayout.SOUTH);

        // Définir la taille de la fenêtre
        frame.setSize(1200, 720);

        // Définir l'action de fermeture de la fenêtre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Rendre la fenêtre visible
        frame.setVisible(true);
    }
}
