import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Exo3 extends JFrame{

    JTextArea text = new JTextArea();
    String cop ;

    Exo3(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(550, 550);
        this.setVisible(true);
        //this.setLayout(null);

        text.setFont(new Font("Arial", Font.PLAIN, 14));
        text.setLineWrap(true);
        text.setWrapStyleWord(true);

        JScrollPane scroll = new JScrollPane(text);
        this.getContentPane().add(scroll, BorderLayout.CENTER);
        String current = text.getText() ;
        text.setText(current);


        JMenuBar menu = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");

        open.addActionListener(e -> System.out.println("Open selected"));
        save.addActionListener(e -> System.out.println("Save selected"));
        exit.addActionListener(e -> System.exit(0));

        JMenu edition = new JMenu("Edition");
        JMenuItem select = new JMenuItem("Select");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");

        select.addActionListener(e -> selected());

        file.add(exit);
        file.add(save);
        file.addSeparator();
        file.add(open);

        edition.add(select);
        edition.addSeparator();
        edition.add(copy);
        edition.addSeparator();
        edition.add(paste);

        menu.add(file);
        menu.add(edition);

        this.setJMenuBar(menu);

    }

    private void selected(){
            String current = text.getText() ;
            text.selectAll();
        }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Exo3();  // Crée une instance de la classe "Me" (l'application)
            }
        });
    }

}