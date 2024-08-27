import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class MyFrame2 extends JFrame implements java.awt.event.ActionListener {

    JButton button;
    JCheckBox checkBox;
    MyFrame2(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 100);

        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);
        checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("consolas",Font.PLAIN,35));

        add(checkBox);
        add(button);

        setLayout(new FlowLayout());
        pack();
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            System.out.println(checkBox.isSelected());
        }
        

    }
    
    
}
