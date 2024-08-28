package GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Label extends JLabel{
    Label(){

        //JLabel = a GUI display area for s string of text, an image, or both 

        JFrame frame = new JFrame();
        farme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setSize(300, 300);
        frame.setVisible(true);

        // create a label
        JLabel label = new JLabel(); 

        //JLabel label = new JLabel("Bro, do you even code ?");

        // set text of label
        label.setText("Bro, do you even code ?"); 

        frame.add(label);



    }
    
    
}
