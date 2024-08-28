import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.sql.Date;
import java.time.Year;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class InfoTableau extends JFrame implements ActionListener{

    JButton addButton;
    DefaultTableModel tableModel ;
    JTable table ;
    JTextField firstName, lastName, email, phone ;
    JComboBox <Integer> combo;
    int date = 0 ; 
    int age;
    String fName, lName, mail, ph ;
    int[] d = new int[100];

    InfoTableau(){

        getContentPane().setLayout(new BorderLayout());

         // Configuration de la fenêtre
        setTitle("User Information");  // Définit le titre de la fenêtre
        setSize(300, 200);  // Définit la taille de la fenêtre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Indique que la fenêtre se ferme lorsque l'utilisateur clique sur la croix

        String[] columnNames = {"First Name","Last Name","email", "phone", "Date of Birth", "Age"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);

        JScrollPane scroll = new JScrollPane(table);
        add(scroll, BorderLayout.EAST);

        JPanel panel = new JPanel();
        //panel.setLayout(new GridLayout(2,1));
        add(panel, BorderLayout.SOUTH);

        addButton = new JButton("Add");
        addButton.addActionListener(this);

        panel.add(addButton);

        setVisible(true);

    }

    public void addTab(){

        fName = firstName.getText();
        lName = lastName.getText();
        mail = email.getText();
        ph = phone.getText(); 
        calculAge();
        Object[] data = {fName, lName, mail, ph, date, age};
        tableModel.addRow(data);
    }

    public void calculAge(){

        Year anneeActuelle = Year.now();
        int annee = anneeActuelle.getValue();
        age = annee - date;
    }

    public void champ(){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10, 2));
        firstName = new JTextField();
        lastName = new JTextField();
        email = new JTextField(); 
        phone = new JTextField();

        
        for(int i = 0; i <d.length; i++){
            d[i] = 1924 + i;
        }
        // Création d'un modèle de combobox
        DefaultComboBoxModel<Integer> comboBoxModel = new DefaultComboBoxModel<>(); 
        // Ajout des éléments du tableau au modèle de combobox
        for (int i : d) {
            comboBoxModel.addElement(i);
        }
        // Création d'un JComboBox avec le modèle
        combo = new JComboBox<>(comboBoxModel);
        combo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==combo){
                    date = (int) combo.getSelectedItem();  
                }
            }});

        panel.add(new JLabel("First Name"));
        panel.add(firstName);
        panel.add(new JLabel("Last Name"));
        panel.add(lastName);
        panel.add(new JLabel("Email"));
        panel.add(email);
        panel.add(new JLabel("Phone"));
        panel.add(phone);
        panel.add(new JLabel("Date of Birth"));
        panel.add(combo);

        int result = JOptionPane.showConfirmDialog(null, panel, "Enter all information",
        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (firstName.getText().isEmpty() || lastName.getText().isEmpty() || email.getText().isEmpty() || phone.getText().isEmpty() || (int) combo.getSelectedItem() == 0) {
            // Affiche un message d'erreur si l'un des champs est vide
            JOptionPane.showMessageDialog(null, "Please enter all information.",
                    "Error", JOptionPane.ERROR_MESSAGE);

        }else if (result == JOptionPane.OK_OPTION) {

            addTab();
            
        }
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==addButton){
            champ();  
        }
    }

    public static void main(String[] args) {
        new InfoTableau();
    }
}