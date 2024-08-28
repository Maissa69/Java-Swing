import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DarkModeButton extends JFrame {

    private JButton toggleDarkModeButton;
    private boolean isDarkMode = false;

    public DarkModeButton() {
        setTitle("Dark Mode Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Création du bouton
        toggleDarkModeButton = new JButton("Toggle Dark Mode");
        toggleDarkModeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toggleDarkMode();
            }
        });

        // Ajout du bouton à la fenêtre
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(toggleDarkModeButton);

        // Rend la fenêtre visible
        setVisible(true);
    }

    private void toggleDarkMode() {
        isDarkMode = !isDarkMode;

        // Appliquer le mode sombre
        if (isDarkMode) {
            // Changer la couleur du fond, du texte, etc. pour le mode sombre
            getContentPane().setBackground(Color.BLACK);
            toggleDarkModeButton.setForeground(Color.WHITE);
            toggleDarkModeButton.setBackground(Color.DARK_GRAY);
        } else {
            // Rétablir les couleurs par défaut pour le mode clair
            getContentPane().setBackground(Color.WHITE);
            toggleDarkModeButton.setForeground(Color.BLACK);
            toggleDarkModeButton.setBackground(null); // Utilise la couleur de fond par défaut
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DarkModeButton());
    }
}

    

