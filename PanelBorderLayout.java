import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelBorderLayout {

    public static void main(String[] args) {

            //Layout Manager = Defines the naturel layout for components within a container

    // 3 common managers

    // Border Layout = A BorderLayout places components in five areas: NORTH,SOUTH,EAST,WEST,CENTER,
    //                  All extra space is placed in the center area.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        // Utilisez getContentPane() pour obtenir le conteneur de contenu du frame
        frame.getContentPane().setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.GRAY);
        panel2.setBackground(Color.PINK);
        panel3.setBackground(Color.CYAN);
        panel4.setBackground(Color.GREEN);
        panel5.setBackground(Color.BLACK);

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.WEST);
        frame.add(panel5, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
