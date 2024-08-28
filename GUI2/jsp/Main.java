import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("calcul");
        frame.setSize(500,500);
        JPanel panel = new JPanel();
        JTextField textField = new JTextField();
        textField.setColumns(10);
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