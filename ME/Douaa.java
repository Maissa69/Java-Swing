import javax.swing.*;
import java.awt.*;

public class Douaa {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemple");
        JPanel panel = new JPanel();
        frame.setLocationRelativeTo(null);
//        panel.setLayout(new GridLayout(1,2));
        JTextField textField = new JTextField(10);

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        panel.add(textField);
        panel.add(button1);
        panel.add(button2);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);

    }
}