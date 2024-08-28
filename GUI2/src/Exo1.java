import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Exo1 extends JFrame implements MouseListener {



    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clic en ( "+e.getX()+", "+ e.getY()+ " )");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("appui");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Relachement");
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
