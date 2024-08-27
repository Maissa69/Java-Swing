import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * MainGrideBagLayout
 */
public class MainGrideBagLayout extends JFrame implements ActionListener {

    MainGrideBagLayout(){
        // Créez un nouveau conteneur, par exemple, un JPanel
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();

        JTextField textField = new JTextField();

        // Définissez le gestionnaire de mise en page sur GridBagLayout
        panel.setLayout(new GridBagLayout());
        panel.setActionMap(null);
        panel.set

        // Ajoutez des composants au panneau avec les contraintes GridBagLayout
        GridBagConstraints gbc = new GridBagConstraints();
        GridBagConstraints gbc1 = new GridBagConstraints();
        GridBagConstraints gbc2 = new GridBagConstraints();
        GridBagConstraints gbc3 = new GridBagConstraints();

        // Exemple d'ajout d'un bouton au panneau
        JButton bouton = new JButton("Menu");
        //gbc.gridx = 0; // Position en colonne 0
        //gbc.gridy = 0; // Position en ligne 0
        
        JButton bouton1 = new JButton("Parameter");
        //gbc1.gridx = 1; // Position en colonne 0
        //gbc1.gridy = 1; // Position en ligne 0
        
        JButton bouton2 = new JButton("Login");
        //gbc2.gridx = 2; // Position en colonne 0
        //gbc2.gridy = 2; // Position en ligne 0
        
        JButton bouton3 = new JButton("Add");
        //gbc3.gridx = 3; // Position en colonne 0
        //gbc3.gridy = 3; // Position en ligne 0

        panel.add(bouton, gbc);
        panel.add(bouton1, gbc);
        panel.add(bouton2, gbc);
        panel.add(bouton3, gbc);

        // Ajoutez le panneau à la fenêtre
        add(panel);
        //add(panel1);

        // Configuration de la fenêtre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setTitle("Ma Fenetre");
        setLocationRelativeTo(null);
        setVisible(true);
    }

    
    public static void main(String[] args) {
        new MainGrideBagLayout();
    }
}