package jour05.job08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

public class Panel {
    public static void main(String[] args) {
        // Charger l'image de fond
        ImageIcon backgroundImage = new ImageIcon("jour05/job04/ring.jpg");

        // Créer le cadre (JFrame)
        JFrame frame = new JFrame("Fenêtre avec Panneaux et Onglets");

        // Créer un panneau personnalisé avec l'image de fond
        BackgroundPanel backgroundPanel = new BackgroundPanel(backgroundImage.getImage());

        // Utiliser BorderLayout pour le panneau principal
        backgroundPanel.setLayout(new BorderLayout());

        // Créer le JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Panneau 1 : Formulaire
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));
        
        // Créer une étiquette "Nom :"
        JLabel nameLabel = new JLabel("Nom :");
        nameLabel.setFont(new Font("Arial", Font.BOLD, 14));

        // Créer un champ de texte pour entrer le nom
        JTextField nameField = new JTextField(20);
        nameField.setMaximumSize(new Dimension(Integer.MAX_VALUE, nameField.getPreferredSize().height));

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

        // Ajouter les composants au panneau de formulaire
        formPanel.add(nameLabel);
        formPanel.add(nameField);
        formPanel.add(Box.createVerticalStrut(10));
        formPanel.add(sendButton);

        // Panneau 2 : Listes déroulantes
        JPanel comboBoxPanel = new JPanel();
        comboBoxPanel.setLayout(new BoxLayout(comboBoxPanel, BoxLayout.Y_AXIS));

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

        // Ajouter les composants au panneau de listes déroulantes
        comboBoxPanel.add(choiceList);
        comboBoxPanel.add(Box.createVerticalStrut(10));
        comboBoxPanel.add(colorList);
        comboBoxPanel.add(Box.createVerticalStrut(10));
        comboBoxPanel.add(okButton);

        // Panneau 3 : Tableau de données
        JPanel tablePanel = new JPanel();
        tablePanel.setLayout(new BoxLayout(tablePanel, BoxLayout.Y_AXIS));

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

        // Ajouter les composants au panneau de tableau
        tablePanel.add(scrollPane);
        tablePanel.add(Box.createVerticalStrut(10));
        tablePanel.add(exportButton);

        // Ajouter les panneaux au JTabbedPane
        tabbedPane.addTab("Formulaire", formPanel);
        tabbedPane.addTab("Listes Déroulantes", comboBoxPanel);
        tabbedPane.addTab("Tableau", tablePanel);

        // Ajouter le JTabbedPane au panneau principal
        backgroundPanel.add(tabbedPane, BorderLayout.CENTER);

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
