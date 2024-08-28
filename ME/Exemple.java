import javax.swing.*;
import java.awt.*;

public class Exemple {
    public static void main(String[] args) {
        JFrame fenetre = new JFrame("Exemple avec BorderLayout");

        // Utilisation de BorderLayout pour le contenu de la fenêtre
        fenetre.setLayout(new BorderLayout());

        // Ajout de boutons dans différentes positions
        JButton boutonNord = new JButton("Nord");
        fenetre.add(boutonNord, BorderLayout.NORTH);

        JButton boutonSud = new JButton("Sud");
        fenetre.add(boutonSud, BorderLayout.SOUTH);

        JButton boutonEst = new JButton("Est");
        fenetre.add(boutonEst, BorderLayout.EAST);

        JButton boutonOuest = new JButton("Ouest");
        fenetre.add(boutonOuest, BorderLayout.WEST);

        JButton boutonCentre = new JButton("Centre");
        fenetre.add(boutonCentre, BorderLayout.CENTER);

        // Définit la taille de la fenêtre
        fenetre.setSize(400, 300);

        // Définit le comportement de fermeture
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Rend la fenêtre visible
        fenetre.setVisible(true);
    }
}
