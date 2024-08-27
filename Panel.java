import java.awt.*;
import javax.swing.*;

public class Panel {
    public static void main(String[] args) {
         //JPanel = a GUIcomponent that functions as a container to hold other components
        ImageIcon icon = new ImageIcon("images.jpg");
        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        //label.setVerticalAlignment(JLabel.BOTTOM);
        //label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(100, 100, 100, 100);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);
        
        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.yellow);
        yellowPanel.setBounds(0,250,250,250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(250,250,250,250);
        //greenPanel.setLayout(new BorderLayout());
        greenPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 550);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(label);
        greenPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(yellowPanel);
        frame.add(greenPanel);
    }
    
}
