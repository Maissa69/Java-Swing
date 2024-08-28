import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MainJComboBox extends JFrame implements ActionListener{
    
    JComboBox combo;

    MainJComboBox(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        String[] animals = {"dog", "cat", "bird"};
        combo = new JComboBox(animals);
        combo.addActionListener(this);
        combo.addItem("Jacko");
        add(combo);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==combo){
            //System.out.println(combo.getSelectedItem());
            //System.out.println(combo.getSelectedIndex());
        }
    }

    public static void main(String[] args) {
        new MainJComboBox();
    }
}
