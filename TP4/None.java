public class None extends JFrame {
    import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Vector;

// Déclaration de la classe "Me" qui étend JFrame pour créer une fenêtre

    // Déclaration des champs de texte pour le prénom, le nom et l'âge
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField ageField;

    // Déclaration du modèle de tableau
    private DefaultTableModel tableModel;
    private JTable table;

    // Constructeur de la classe
  public None() {
        // Configuration de la fenêtre
        setTitle("User Information");  // Définit le titre de la fenêtre
        setSize(300, 200);  // Définit la taille de la fenêtre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Indique que la fenêtre se ferme lorsque l'utilisateur clique sur la croix

        // Création du modèle de tableau
        String[] columnNames = {"Nom", "Prenom", "Age"};
        tableModel = new DefaultTableModel(columnNames, 0); // 0 pour indiquer qu'il n'y a pas de lignes initiales

        // Création de la JTable avec le modèle
        table = new JTable(tableModel);

        // Ajout de la JTable à un JScrollPane pour permettre le défilement
        JScrollPane scroll = new JScrollPane(table);
        getContentPane().add(scroll, BorderLayout.CENTER);

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
        saveButton.addActionListener(e -> saveButtonClicked());

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

    private void addTab() {
        // Récupération des données des champs de texte
        firstName = firstNameField.getText();
        lastName = lastNameField.getText();
        age = ageField.getText();

        // Crée un tableau d'Object contenant les données à ajouter
        Object[] rowData = {lastName, firstName, age};

        // Ajoute la ligne au modèle de tableau
        tableModel.addRow(rowData);

        // Efface les champs de texte après l'ajout
        firstNameField.setText("");
        lastNameField.setText("");
        ageField.setText("");
    }

    // Méthode appelée lorsque le bouton "Save" est cliqué
    private void saveButtonClicked() {
        // Vérification si tous les champs sont remplis
        if (firstNameField.getText().isEmpty() || lastNameField.getText().isEmpty() || ageField.getText().isEmpty()) {
            // Affiche un message d'erreur si l'un des champs est vide
            JOptionPane.showMessageDialog(this, "Please enter all information.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Ajoute la ligne au modèle de tableau
            addTab();
        }
    }

    // Méthode principale pour exécuter l'application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new None());
    }
}
