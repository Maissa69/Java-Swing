import javax.swing.*;
public class ex {
    public static void main(String[] args) {

        JFrame fenetre = new JFrame("Ma fenêtre");
        // Exemple d'ajout de composants à la fenêtre
        JLabel etiquette = new JLabel("Bonjour, Monde !");
        fenetre.add(etiquette);
        fenetre.setSize(400, 300); // Définit la taille de la fenêtre
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Définit le comportement de fermeture
        fenetre.setVisible(true); // Rend la fenêtre visible


        
    }
    
}
