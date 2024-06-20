package jour05.job06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListChoice {
    public static void main(String[] args) {
        ImageIcon backgroundImage = new ImageIcon("jour05/job04/ring.jpg");

        JFrame frame = new JFrame("Fenêtre Simple");

        BackgroundPanel backgroundPanel = new BackgroundPanel(backgroundImage.getImage());

        backgroundPanel.setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel();
        mainPanel.setOpaque(false); 
        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); 

        // Créer une étiquette "Nom :"
        JLabel nameLabel = new JLabel("Nom :");
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 14));

        JTextField nameField = new JTextField(20);
        nameField.setBackground(Color.WHITE);
        nameField.setForeground(Color.BLACK);
        nameField.setFont(new Font("Arial", Font.PLAIN, 14));

        JButton sendButton = new JButton("Envoyer");
        sendButton.setBackground(Color.BLUE);
        sendButton.setForeground(Color.WHITE);
        sendButton.setFont(new Font("Arial", Font.BOLD, 14));

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                System.out.println("Nom entré : " + name);
            }
        });

        String[] choices = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> choiceList = new JComboBox<>(choices);

        String[] colors = {"Rouge", "Vert", "Bleu"};
        JComboBox<String> colorList = new JComboBox<>(colors);

        JButton okButton = new JButton("OK");
        okButton.setBackground(Color.GREEN);
        okButton.setForeground(Color.WHITE);
        okButton.setFont(new Font("Arial", Font.BOLD, 14));

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedChoice = (String) choiceList.getSelectedItem();
                String selectedColor = (String) colorList.getSelectedItem();
                System.out.println("Choix sélectionné : " + selectedChoice);
                System.out.println("Couleur sélectionnée : " + selectedColor);
            }
        });


        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_END;
        mainPanel.add(nameLabel, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        mainPanel.add(nameField, gbc);

        gbc.gridx = 2;
        gbc.anchor = GridBagConstraints.LINE_START;
        mainPanel.add(sendButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.CENTER;
        mainPanel.add(choiceList, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 3; 
        gbc.anchor = GridBagConstraints.CENTER;
        mainPanel.add(colorList, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 3; 
        gbc.anchor = GridBagConstraints.CENTER;
        mainPanel.add(okButton, gbc);

        backgroundPanel.add(mainPanel, BorderLayout.CENTER);

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

        backgroundPanel.add(quitButton, BorderLayout.SOUTH);
        frame.setContentPane(backgroundPanel);
        frame.setSize(1200, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

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
