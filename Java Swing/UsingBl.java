import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;


import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class UsingBl {
    public static void main (String []args){
         JFrame fenetre= new JFrame("Border Layout");
        fenetre.setBounds(200,200 , 200, 200);
        JMenu menu1 =new JMenu("File");
       JMenuItem smenu =new JMenuItem("New");
       menu1.add(smenu);
       JMenuBar menuBar =new JMenuBar();
       menuBar.add(menu1);
       fenetre.add(menuBar,BorderLayout.NORTH);
       JTree arbre =new JTree(new DefaultMutableTreeNode("Racine "));
       fenetre.add( arbre, BorderLayout.WEST);
        fenetre.setVisible(true);
        JPanel p1,p2;
        p1=new JPanel();
        p2=new JPanel();     
        p1.setBackground(Color.pink);
        p2.setBackground(Color.gray);
        p2.setPreferredSize(new Dimension(200, 200));
        p1.setBorder(BorderFactory.createTitledBorder("espace principale"));
        p2.setBorder(BorderFactory.createTitledBorder("Barre visualisation"));
        fenetre.add(p1 , BorderLayout.CENTER);
        fenetre.add(p2, BorderLayout.EAST);
        fenetre.setVisible(true);
    }
}
