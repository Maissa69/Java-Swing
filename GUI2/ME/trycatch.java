import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class trycatch{
    public static void main(String[] args) {
        JFrame fenetre = new JFrame("Calcul de la somme");
        JPanel panel = new JPanel();
        JLabel label1 = new JLabel("Premier nombre : ");
        JTextField textField1 = new JTextField(10);
        JLabel label2 = new JLabel("Deuxième nombre : ");
        JTextField textField2 = new JTextField(10);
        JButton button = new JButton("Calculer la somme");
        JLabel resultatLabel = new JLabel("Résultat : ");

        panel.setLayout(new GridLayout(3, 2));
        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(resultatLabel);
        panel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int premierNombre = Integer.parseInt(textField1.getText());
                    int deuxiemeNombre = Integer.parseInt(textField2.getText());
                    int somme = premierNombre + deuxiemeNombre;
                    resultatLabel.setText("Résultat : " + somme);
                } catch (NumberFormatException ex) {
                    resultatLabel.setText("Erreur : Entrée non valide");
                }
            }
        });

        fenetre.add(panel);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(300, 150);
        fenetre.setVisible(true);
    }
}
