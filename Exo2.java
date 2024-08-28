import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exo2 extends JFrame {

    JPanel pan1 , pan2;
    JButton ok , annuler;
    JLabel heur, minutes;
    JTextField min, heures;

    Exo2(){
        
        setTitle("User Information");
        setSize(300, 200);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pan1 = new JPanel();
        pan2 = new JPanel();

        heur = new JLabel("Heures");
        heures = new JTextField();
        minutes = new JLabel("Minutes");
        min = new JTextField();

        ok = new JButton("OK");
        ok.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                getmin_heure();
            }

        });

        pan1.add(heur);
        pan1.add(minutes);
        pan1.add(heures);
        pan1.add(min);

        pan2.add(ok);
        pan2.add(annuler);
        add(pan1);
        add(pan2);
        JOptionPane.showInputDialog(null);
    }

    private void getmin_heure(){
            String h = heures.getText();;
            String m = min.getText();
            
            if (Integer.parseInt(h) > 23 && Integer.parseInt(m) > 60) {
                JOptionPane.showMessageDialog(this, "Please enter valide heurs.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            }else if(h.isEmpty() || m.isEmpty()){
                JOptionPane.showMessageDialog(this, "Please enter all information.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        /**
         * @param args
         */
        public static void main(String[] args) {
            new Exo2();
            
        }
}
