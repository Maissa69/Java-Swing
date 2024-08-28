import javax.swing.*;
import java.awt.*;
public class Exo3Tp2 {
    public static void main (String []args){

        JFrame  frame = new JFrame("une fenetre ", null);
        frame.setSize(250, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setBounds(100, 100, 500, 400);
        Container container =frame.getContentPane();

        BoxLayout boxLayout= new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(boxLayout);

        JButton button1= new JButton("North ", null);
        JButton button2= new JButton("Ouest ", null);
        JButton button3= new JButton("Sud ", null);
        JButton button4= new JButton("Center ", null);
        JButton button5= new JButton("Est ", null);


       /*SI on veut mettre les buttons a droite
       button1.setAlignmentX(Component.RIGHT_ALIGNMENT);
       button2.setAlignmentX(Component.RIGHT_ALIGNMENT);
       button3.setAlignmentX(Component.RIGHT_ALIGNMENT);
       button4.setAlignmentX(Component.RIGHT_ALIGNMENT);
       button5.setAlignmentX(Component.RIGHT_ALIGNMENT);*/
 

        container.add(button1);
        container.add(button2);
        container.add(button3);
        container.add(button4);
        container.add(button5);
        
       
    }
}
