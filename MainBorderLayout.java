import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainBorderLayout{

    public static void main(String[] args) {

            //Layout Manager = Defines the naturel layout for components within a container

    // 3 common managers

    // Border Layout = A BorderLayout places components in five areas: NORTH,SOUTH,EAST,WEST,CENTER,
    //                  All extra space is placed in the center area.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        // Utilisez getContentPane() pour obtenir le conteneur de contenu du frame
        frame.setLayout(new BorderLayout(1,1));

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

        panel5.setLayout(new BorderLayout());

        panel1.setPreferredSize(new Dimension(50,50));
        panel2.setPreferredSize(new Dimension(50,50));
        panel3.setPreferredSize(new Dimension(50,50));
        panel4.setPreferredSize(new Dimension(50,50));
        panel5.setPreferredSize(new Dimension(50,50));

        //-----------------------sub panel---------------------------

        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.MAGENTA);
        panel7.setBackground(Color.ORANGE);
        panel8.setBackground(Color.red);
        panel9.setBackground(Color.BLUE);
        panel10.setBackground(Color.YELLOW);

        panel6.setPreferredSize(new Dimension(25,25));
        panel7.setPreferredSize(new Dimension(25,25));
        panel8.setPreferredSize(new Dimension(25,25));
        panel9.setPreferredSize(new Dimension(25,25));
        panel10.setPreferredSize(new Dimension(25,25));

        panel5.add(panel6, BorderLayout.NORTH);
        panel5.add(panel7, BorderLayout.WEST);
        panel5.add(panel8, BorderLayout.EAST);
        panel5.add(panel9, BorderLayout.SOUTH);
        //panel5.add(panel10, BorderLayout.CENTER);

//-----------------------sub panel---------------------------

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.WEST);
        frame.add(panel5, BorderLayout.CENTER);

        // frame.add(panel6, BorderLayout.NORTH);
        // frame.add(panel7, BorderLayout.SOUTH);
        // frame.add(panel8, BorderLayout.EAST);
        // frame.add(panel9, BorderLayout.WEST);
        // frame.add(panel10, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
