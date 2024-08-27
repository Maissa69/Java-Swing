import javax.swing.*;
import java.awt.*;

public class MainGridLayout {

    // Layout Manager = Defines the natural layout for components within a container 

    //GridLayout =      places components in a grid of cells.
   //                   Each components takes all the aviable space within its cell,
  //                    and each cell is the same size.

    public static void main(String[] args) {
        new MainGridLayout();
    }

    MainGridLayout(){
        JFrame frame = new JFrame("Main Grid Layout");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(3,3,10,10));

        
        
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        
    }
    
}
