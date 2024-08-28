import javax.swing.*;
import java.awt.*;

public class Exemple2 {
    public static void main(String[] args) {
        // Création d'une nouvelle JFrame
        JFrame fenetre = new JFrame("Exemple avec FlowLayout");

        // Utilisation de FlowLayout pour le contenu de la fenêtre
        fenetre.setLayout((LayoutManager) new FlowLayout());

        // Création de différents composants à ajouter à la fenêtre
        JButton bouton1 = new JButton("Bouton 1");
        fenetre.add(bouton1);

        JButton bouton2 = new JButton("Bouton 2");
        fenetre.add(bouton2);

        JLabel etiquette = new JLabel("Étiquette");
        fenetre.add(etiquette);

        JTextField champDeTexte = new JTextField(20);
        fenetre.add(champDeTexte);

        // Définit la taille de la fenêtre
        fenetre.setSize(400, 300);

        // Définit le comportement de fermeture
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Rend la fenêtre visible
        fenetre.setVisible(true);
    }
}
