import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MaFenetre extends JFrame {
    private JComboBox<String> choix;
    private JButton relancerButton;

    public MaFenetre() {
        // Initialisation de la fenêtre
        setTitle("Exemple de relance de page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        // Initialisation des composants
        String[] options = {"Choix 1", "Choix 2", "Choix 3"};
        choix = new JComboBox<>(options);
        relancerButton = new JButton("Relancer la page");

        // Ajout des composants à la fenêtre
        JPanel panel = new JPanel();
        panel.add(new JLabel("Sélectionnez une option :"));
        panel.add(choix);
        panel.add(relancerButton);
        add(panel);

        // Ajout d'un gestionnaire d'événements au bouton
        relancerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Vérifier si le choix est incorrect
                String selectedOption = (String) choix.getSelectedItem();
                if ("Choix 1".equals(selectedOption)) {
                    // Si le choix est incorrect, relancer la page ici
                    JOptionPane.showMessageDialog(MaFenetre.this, "Choix incorrect. Relancez la page!");
                    // Vous pouvez ajouter du code pour réinitialiser la page ici
                } else {
                    // Le choix est correct, faire d'autres actions ici si nécessaire
                    JOptionPane.showMessageDialog(MaFenetre.this, "Choix correct!");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MaFenetre().setVisible(true);
            }
        });
    }
}
