package jour05.job05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SendText {
    public static void main(String[] args) {
        // Charger l'image de fond
        ImageIcon backgroundImage = new ImageIcon("jour05/job04/ring.jpg");

        // Créer le cadre (JFrame)
        JFrame frame = new JFrame("Fenêtre Simple");

        // Créer un panneau personnalisé avec l'image de fond
        BackgroundPanel backgroundPanel = new BackgroundPanel(backgroundImage.getImage());

        // Utiliser BorderLayout pour le panneau principal
        backgroundPanel.setLayout(new BorderLayout());

        // Créer un panneau avec FlowLayout pour les nouveaux composants
        JPanel panel = new JPanel();
        panel.setOpaque(false); // Rendre le panneau transparent
        panel.setLayout(new FlowLayout());

        // Créer une étiquette "Nom :"
        JLabel nameLabel = new JLabel("Nom :");
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 14));

        // Créer un champ de texte pour entrer le nom
        JTextField nameField = new JTextField(20);
        nameField.setBackground(Color.WHITE);
        nameField.setForeground(Color.BLACK);
        nameField.setFont(new Font("Arial", Font.PLAIN, 14));

        // Créer un bouton "Envoyer"
        JButton sendButton = new JButton("Envoyer");
        sendButton.setBackground(Color.BLUE);
        sendButton.setForeground(Color.WHITE);
        sendButton.setFont(new Font("Arial", Font.BOLD, 14));

        // Ajouter un ActionListener au bouton "Envoyer"
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                System.out.println("Nom entré : " + name);
            }
        });

        // Ajouter les composants au panneau
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(sendButton);

        // Ajouter le panneau au centre de la fenêtre
        backgroundPanel.add(panel, BorderLayout.CENTER);

        // Créer un bouton "Quitter"
        JButton quitButton = new JButton("Quitter");
        quitButton.setBackground(Color.RED);
        quitButton.setForeground(Color.WHITE);
        quitButton.setFont(new Font("Arial", Font.BOLD, 14));
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Ajouter le bouton "Quitter" en bas de la fenêtre (position BorderLayout.SOUTH)
        backgroundPanel.add(quitButton, BorderLayout.SOUTH);

        // Ajouter le panneau personnalisé au cadre
        frame.setContentPane(backgroundPanel);

        // Définir la taille de la fenêtre
        frame.setSize(1200, 720);

        // Définir l'action de fermeture de la fenêtre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Rendre la fenêtre visible
        frame.setVisible(true);
    }
}

// Classe pour le panneau personnalisé avec l'image de fond
class BackgroundPanel extends JPanel {
    private Image backgroundImage;

    public BackgroundPanel(Image backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), this);
    }
}
