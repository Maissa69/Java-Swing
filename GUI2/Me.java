import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Déclaration de la classe "Me" qui étend JFrame pour créer une fenêtre
public class Me extends JFrame {

    // Déclaration des champs de texte pour le prénom, le nom et l'âge
    private JTextField firstNameField, lastNameField, ageField;

    // Constructeur de la classe
    public Me() {
        // Configuration de la fenêtre
        setTitle("User Information");  // Définit le titre de la fenêtre
        setSize(300, 200);  // Définit la taille de la fenêtre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Indique que la fenêtre se ferme lorsque l'utilisateur clique sur la croix

        // Création d'un nouveau panel avec une disposition en grille 4x2
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        // Création des composants d'interface utilisateur
        JLabel firstNameLabel = new JLabel("First Name:");  // Étiquette pour le champ du prénom
        firstNameField = new JTextField();  // Champ de texte pour le prénom
        JLabel lastNameLabel = new JLabel("Last Name:");  // Étiquette pour le champ du nom
        lastNameField = new JTextField();  // Champ de texte pour le nom
        JLabel ageLabel = new JLabel("Age:");  // Étiquette pour le champ de l'âge
        ageField = new JTextField();  // Champ de texte pour l'âge

        JButton saveButton = new JButton("Save");  // Bouton "Save"
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveButtonClicked();  // Ajoute un écouteur d'événements pour le clic sur le bouton "Save"
            }
        });

        // Ajout des composants au panel
        panel.add(firstNameLabel);
        panel.add(firstNameField);
        panel.add(lastNameLabel);
        panel.add(lastNameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(saveButton);

        // Ajout du panel à la fenêtre
        add(panel);

        // Rend la fenêtre visible
        setVisible(true);
    }

    // Méthode appelée lorsque le bouton "Save" est cliqué
    private void saveButtonClicked() {
        // Récupération des données des champs de texte
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String age = ageField.getText();

        // Vérification si tous les champs sont remplis
        if (firstName.isEmpty() || lastName.isEmpty() || age.isEmpty()) {
            // Affiche un message d'erreur si l'un des champs est vide
            JOptionPane.showMessageDialog(this, "Please enter all information.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Vous pouvez ajouter ici la logique de traitement des données sauvegardées.
            // Affiche un message avec les informations saisies
            JOptionPane.showMessageDialog(this, "User information saved:\n" +
                    "First Name: " + firstName + "\n" +
                    "Last Name: " + lastName + "\n" +
                    "Age: " + age);
        }
    }

    // Méthode principale pour exécuter l'application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Me();  // Crée une instance de la classe "Me" (l'application)
            }
        });
    }
}
