import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MonFrame extends JFrame {
    private String[][] tableauData = new String[10][2];
    private int rowIndex = 0;

    public MonFrame() {
        super("Mon Application");

        // Créer et configurer la fenêtre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout((LayoutManager) new FlowLayout());

        // Ajouter un bouton pour ajouter un nom et prénom
        JButton boutonAjouter = new JButton("Ajouter Nom et Prénom");
        boutonAjouter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ajouterNomPrenom();
            }
        });

        // Ajouter le bouton à la fenêtre
        add(boutonAjouter);

        // Afficher la fenêtre
        setVisible(true);
    }

    private void ajouterNomPrenom() {
        // Créer un panneau pour la boîte de dialogue
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        // Ajouter des champs de texte pour le nom et le prénom
        JTextField champNom = new JTextField();
        JTextField champPrenom = new JTextField();

        panel.add(new JLabel("Nom:"));
        panel.add(champNom);
        panel.add(new JLabel("Prénom:"));
        panel.add(champPrenom);

        // Afficher la boîte de dialogue avec les champs de texte
        int resultat = JOptionPane.showConfirmDialog(null, panel, "Entrez le nom et le prénom",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        // Vérifier si l'utilisateur a cliqué sur OK
        if (resultat == JOptionPane.OK_OPTION) {
            // Récupérer les valeurs des champs de texte
            String nom = champNom.getText();
            String prenom = champPrenom.getText();

            // Ajouter le nom et le prénom au tableau
            tableauData[rowIndex][0] = nom;
            tableauData[rowIndex][1] = prenom;

            // Incrémenter l'index de la ligne
            rowIndex++;

            // Afficher les données dans la console (à des fins de débogage)
            afficherTableau();

            // Vous pouvez également mettre à jour une JTable ici si vous en utilisez une
        }
    }

    private void afficherTableau() {
        System.out.println("Tableau de données :");
        for (int i = 0; i < rowIndex; i++) {
            System.out.println(tableauData[i][0] + " " + tableauData[i][1]);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MonFrame();
            }
        });
    }
}
