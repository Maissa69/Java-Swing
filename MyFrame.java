import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

//public class MyFrame extends JFrame {
public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    MyFrame(){

        ImageIcon icon = new ImageIcon("images.jpg");
        ImageIcon icon2 = new ImageIcon("Capture d'écran 2023-11-24 230047.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(250,250,250,300);
        //label.setVisible(true);

        button = new JButton();
        button.setBounds(200,100,300,200);
        button.addActionListener(this);
        //button.addActionListener(e -> System.out.println("poo"));
        button.setText("I'm a Button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.CENTER);
        button.setFont(new Font("Comic Sans", Font.BOLD,25));
        button.setIconTextGap(-15);
        button.setForeground(Color.pink);
        button.setBackground(Color.black);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false);// pour bloquer l'accer au boutton 


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        setSize(500,500);
        setVisible(true);
        add(button);
        add(label);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            System.out.println("poo");
            label.setVisible(true);
        }
    }
    
}
