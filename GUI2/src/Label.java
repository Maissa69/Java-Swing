import javax.swing.*;
import java.awt.*;

public class Label extends JLabel{
    Label(){

        //JLabel = a GUI display area for s string of text, an image, or both 

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(7, 45, 34));

        // create a label
        //JLabel label = new JLabel();

        //JLabel label = new JLabel("Bro, do you even code ?");

        // set text of label
        ImageIcon image = new ImageIcon("images.png");
        this.setIcon(image);
        this.setText("Bro, do you even code ?");
        frame.add(this);







    }


}