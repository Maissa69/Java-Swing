import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Bib {
    public static void main(String[] args) {
        JFrame fenetre = new JFrame("Identification");

        fenetre.setLayout((LayoutManager) new FlowLayout());
        JPanel panel = new JPanel();
        
        JTextField Logine = new JTextField("Logine");
        fenetre.add(Logine);

        JTextField Password = new JTextField("Password");
        fenetre.add(Password);

        JButton Entrer = new JButton("Entrer");
        fenetre.add(Entrer);

        // Définit la taille de la fenêtre
        fenetre.setSize(400, 300);

        // Définit le comportement de fermeture
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Rend la fenêtre visible
        fenetre.setVisible(true);

    }
    
}
