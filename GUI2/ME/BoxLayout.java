import javax.swing.*;
import java.awt.*;

public class BoxLayout {

    public static void main(String[] args) {
        // Création de la fenêtre
        JFrame frame = new JFrame("Exemple de BoxLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Création du panneau
        JPanel pan = new JPanel();
        pan.setLayout(new BoxLayout(pan, BoxLayout.Y_AXIS)); // Définition du BoxLayout verticalement

        // Ajout de quelques composants au panneau
        JButton button1 = new JButton("Bouton 1");
        JButton button2 = new JButton("Bouton 2");
        JButton button3 = new JButton("Bouton 3");

        // Ajout des boutons au panneau
        pan.add(button1);
        pan.add(button2);
        pan.add(button3);

        // Ajout du panneau à la fenêtre
        frame.add(pan, BorderLayout.CENTER);

        // Définition de la taille de la fenêtre
        frame.setSize(300, 200);

        // Rendre la fenêtre visible
        frame.setVisible(true);
    }
}
