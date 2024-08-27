import javax.swing.*;
import java.awt.*;
public class MainFlowLayout {

//Layout Manager = Defines the natural layout for components within a container
//FlowLayout =     place components in a row sized at their preferred size.
//                 If the horizontal space in the container is too small,
//                 the FlowLayout class uses the next available row. 

    public static void main(String[] args) {
        new MainFlowLayout();
    }

    MainFlowLayout(){
        JFrame frame = new JFrame("Main Flow Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setLayout(new FlowLayout(FlowLayout.LEADING,30,10));
        // frame.setLayout(new FlowLayout(FlowLayout.TRAILING));
        // frame.setLayout(new FlowLayout(FlowLayout.CENTER,30,10));
        frame.setSize(500,500);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250,250));
        panel.setBackground(Color.LIGHT_GRAY);


        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);

        frame.add(panel);
    }
    
}
