package jour05.job07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

public class ArrayData {
    public static void main(String[] args) {
        // Charger l'image de fond
        ImageIcon backgroundImage = new ImageIcon("jour05/job04/ring.jpg");

        // Créer le cadre (JFrame)
        JFrame frame = new JFrame("Fenêtre Simple");

        // Créer un panneau personnalisé avec l'image de fond
        BackgroundPanel backgroundPanel = new BackgroundPanel(backgroundImage.getImage());

        // Utiliser BorderLayout pour le panneau principal
        backgroundPanel.setLayout(new BorderLayout());

        // Créer un panneau principal pour les composants
        JPanel mainPanel = new JPanel();
        mainPanel.setOpaque(false); // Rendre le panneau transparent
        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Ajouter des marges autour des composants

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

        // Créer une liste déroulante pour les choix
        String[] choices = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> choiceList = new JComboBox<>(choices);

        // Créer une liste déroulante pour les couleurs
        String[] colors = {"Rouge", "Vert", "Bleu"};
        JComboBox<String> colorList = new JComboBox<>(colors);

        // Créer un bouton "OK"
        JButton okButton = new JButton("OK");
        okButton.setBackground(Color.GREEN);
        okButton.setForeground(Color.WHITE);
        okButton.setFont(new Font("Arial", Font.BOLD, 14));

        // Ajouter un ActionListener au bouton "OK"
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedChoice = (String) choiceList.getSelectedItem();
                String selectedColor = (String) colorList.getSelectedItem();
                System.out.println("Choix sélectionné : " + selectedChoice);
                System.out.println("Couleur sélectionnée : " + selectedColor);
            }
        });

        // Ajouter les composants au panneau principal en utilisant GridBagLayout

        // Ligne 1 : Étiquette "Nom :" et champ de texte
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_END;
        mainPanel.add(nameLabel, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        mainPanel.add(nameField, gbc);

        // Ligne 1 : Bouton "Envoyer"
        gbc.gridx = 2;
        gbc.anchor = GridBagConstraints.LINE_START;
        mainPanel.add(sendButton, gbc);

        // Ligne 2 : Liste déroulante pour les choix
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 3; // Occuper 3 colonnes
        gbc.anchor = GridBagConstraints.CENTER;
        mainPanel.add(choiceList, gbc);

        // Ligne 3 : Liste déroulante pour les couleurs
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 3; // Occuper 3 colonnes
        gbc.anchor = GridBagConstraints.CENTER;
        mainPanel.add(colorList, gbc);

        // Ligne 4 : Bouton "OK"
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 3; // Occuper 3 colonnes
        gbc.anchor = GridBagConstraints.CENTER;
        mainPanel.add(okButton, gbc);

        // Créer un modèle de tableau pour les données
        String[] columnNames = {"Colonne 1", "Colonne 2", "Colonne 3"};
        Object[][] data = {
                {"Donnée 1", "Donnée 2", "Donnée 3"},
                {"Donnée 4", "Donnée 5", "Donnée 6"},
                {"Donnée 7", "Donnée 8", "Donnée 9"}
        };
        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        // Ajouter le tableau au panneau principal
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 3; // Occuper 3 colonnes
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        mainPanel.add(scrollPane, gbc);

        // Créer un bouton "Exporter"
        JButton exportButton = new JButton("Exporter");
        exportButton.setBackground(Color.ORANGE);
        exportButton.setForeground(Color.WHITE);
        exportButton.setFont(new Font("Arial", Font.BOLD, 14));

        // Ajouter un ActionListener au bouton "Exporter"
        exportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exportTableToCSV(table, "table_data.csv");
            }
        });

        // Ajouter le bouton "Exporter" au panneau principal
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 3; // Occuper 3 colonnes
        gbc.anchor = GridBagConstraints.CENTER;
        mainPanel.add(exportButton, gbc);

        // Ajouter le panneau principal au centre de la fenêtre
        backgroundPanel.add(mainPanel, BorderLayout.CENTER);

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

    // Méthode pour exporter les données du tableau vers un fichier CSV
    private static void exportTableToCSV(JTable table, String path) {
        try (FileWriter csv = new FileWriter(path)) {
            for (int i = 0; i < table.getColumnCount(); i++) {
                csv.write(table.getColumnName(i) + ",");
            }
            csv.write("\n");
            for (int i = 0; i < table.getRowCount(); i++) {
                for (int j = 0; j < table.getColumnCount(); j++) {
                    csv.write(table.getValueAt(i, j).toString() + ",");
                }
                csv.write("\n");
            }
            System.out.println("Données exportées vers " + path);
        } catch (IOException e) {
            e.printStackTrace();
        }
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
