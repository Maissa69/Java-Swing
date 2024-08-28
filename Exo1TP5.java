import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Exo1TP5 extends JFrame {

    private static final JButton JButton = null;
    /**
     * @param args
     */

     JButton oui, non, annuler; 
     JLabel label;

     Exo1TP5(){
         
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
        label = new JLabel();
        label.setText("Voulez-vous continuer ?");
        label.setBounds(150, 200, 300, 60);

        oui = new JButton();
        //oui.setBounds(50,50,50,50);
        oui.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(afficheConfirm(0));
            }
            
        });
        //button.addActionListener(e -> System.out.println("poo"));
        oui.setText("Oui");
        oui.setFocusable(false);
        //oui.setHorizontalTextPosition(JButton.CENTER);
        //oui.setVerticalTextPosition(JButton.CENTER);
        //oui.setFont(new Font("Comic Sans", Font.BOLD,25));
        //oui.setIconTextGap(-15);
        //oui.setForeground(Color.pink);
        //oui.setBackground(Color.black);
        oui.setBorder(BorderFactory.createEtchedBorder());

        non = new JButton();
       // non.setBounds(50,50,50,50);
        non.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(afficheConfirm(1));
            }
            
        });
        //button.addActionListener(e -> System.out.println("poo"));
        non.setText("Non");
        non.setFocusable(false);
        // non.setHorizontalTextPosition(JButton.CENTER);
        // non.setVerticalTextPosition(JButton.CENTER);
        // non.setFont(new Font("Comic Sans", Font.BOLD,25));
        //non.setIconTextGap(-15);
        //non.setForeground(Color.pink);
        //non.setBackground(Color.black);
        non.setBorder(BorderFactory.createEtchedBorder());

        annuler = new JButton();
        annuler.setText("Anuuler");
        // annuler.setHorizontalTextPosition(JButton.CENTER);
        // annuler.setVerticalTextPosition(JButton.CENTER);
        // annuler.setFont(new Font("Comic Sans", Font.BOLD,25));
        // annuler.setBounds(50,50,50,50);
        // annuler.setIconTextGap(-15);
        annuler.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(afficheConfirm(2));
            }
            
        });
        add(label);
        add(oui);
        add(non);
        add(annuler);
        afficheConfirm(-1);


     }

     public int afficheConfirm(int i){

        if (i == 0) {
            return 0;
            
        }else if (i == 1){
            return 1;
        }else if(i == 2){
            return 2;
        }else 
            System.out.println("-1");
            return -1;

     }


    public static void main(String[] args) {
        
        new Exo1TP5();
        
    }

}