import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    //create to constructor for this class
    /*
     * dans ce cas puisque j'ai utiliser l'heritage depuis la classe JFrame
     * je n'ai plus besion de l'instancier par:
     * JFrame frame = new JFrame();
     * dans ce cas j'utilise a ca place this
     *
     */
    MyFrame(){

        //JFrame = a GUI Window to add components to

        //creat a farme
        //JFrame frame = new JFrame();

        //sets the X-dimention, and Y-dimention of this
        this.setSize(420, 420);

        //sets title of this
        this.setTitle("Jthis title goes here");

        //Bay default is HIDE_ON_CLOSE
        //frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        //do not close
        //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        //exit out of application
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // make this visible
        this.setVisible(true);

        //prevent this from being resized
        this.setResizable(true);

        //create image icone
        ImageIcon image = new ImageIcon("GUI/Akatsuke.jpeg");

        //change icone of frame
        this.setIconImage(image.getImage());

        //change color of background
        //this.getContentPane().setBackground(Color.BLACK);
        this.getContentPane().setBackground(new Color(0x023446));

        Label label = new Label();
        this.add(label);

    }

}
