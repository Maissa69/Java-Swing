import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Tp3 extends JFrame implements MouseListener {

    //L'INTERACTION AVEC L'INTERFACE
    /*
    *On dispose de 3 Objets
    *
    */
    Tp3(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(7, 45, 34));
        JPanel pan = new JPanel();
        pan.setBackground(Color.GRAY);



    }



    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clic en ( "+e.getX()+", "+ e.getY()+ " )");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
