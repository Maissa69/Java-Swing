import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;
public class Label{
    public static void main(String[] args) {
        Border border = BorderFactory.createLineBorder(Color.pink,3);
        //label = a GUI display area for a string of text, an imag, or both 
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.BLACK);
        //frame.setLayout(null);
        //frame.pack();
        ////////////////////////////
        JLabel label = new JLabel("Hello");
        label.setText("Bro, do you even code ?");
        label.setBounds(150, 200, 300, 60);
        ImageIcon img = new ImageIcon("images.jpg");
        label.setBorder(border);
        label.setIcon(img);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP);// set text TOP, CENTER, BOTTON of imageicon
        label.setForeground(new Color(0xFFC0CB)); // set font color of text
        label.setFont(new Font("MV Boli",Font.PLAIN,20));//set font of text 
        label.setIconTextGap(-25); //set gap of text to image
        label.setBackground(Color.BLACK);//set background color
        label.setOpaque(true);
        label.setVerticalAlignment(JLabel.CENTER);//set verticale position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);//set Horisental position of icon+text withe label
        //label.setBounds(100,100,250,250);//set x,y position within frame as well as simensions


        frame.add(label);
    }
}