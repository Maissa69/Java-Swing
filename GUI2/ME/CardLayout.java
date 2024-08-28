import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayout {
    JPanel cards; // Le conteneur où les cartes seront empilées.
    final static String BUTTONPANEL = "Card avec bouton";
    final static String TEXTPANEL = "Card avec texte";

    public void addComponentToPane(Container pane) {
        // Initialisation du CardLayout.
        cards = new JPanel(new CardLayout());

        // Création des différentes cartes.
        JPanel card1 = new JPanel();
        card1.add(new JButton("Bouton"));

        JPanel card2 = new JPanel();
        card2.add(new JLabel("Carte avec texte"));

        // Ajout des cartes au conteneur de cartes.
        cards.add(card1, BUTTONPANEL);
        cards.add(card2, TEXTPANEL);

        pane.add(cards, BorderLayout.CENTER);
    }

    private static void createAndShowGUI() {
        // Création de la fenêtre.
        JFrame frame = new JFrame("CardLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Création et ajout du contenu à la fenêtre.
        CardLayoutExample demo = new CardLayoutExample();
        demo.addComponentToPane(frame.getContentPane());

        // Affichage de la fenêtre.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Programmation des tâches dans l'Event Dispatch Thread pour la sécurité et la stabilité.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

