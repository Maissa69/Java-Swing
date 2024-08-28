import javax.imageio.IIOException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        frame.getContentPane().setBackground(new Color(7, 45, 34));

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        //new MyFrame();
        //MarqueVoitures tp = new MarqueVoitures();

        JPanel pan = new JPanel();
        pan.setLayout(new GridLayout(3,1));
        pan.setBackground(Color.GRAY);

        JLabel marque = new JLabel("marque");
        String[] marques ={"toyota","Renault","Pugeau"};
        JComboBox<String> markbox = new JComboBox<>(marques);
        //markbox.addItem("Toyota");
        //markbox.addItem("Renault");
        //markbox.addItem("Pugeau");
        pan.add(marque);
        pan.add(markbox);

        String[][] markop = {
                {"corolla","Comry","RAV4"},
                {"clio","Kadjar","Megane"},
                {"207","2008","3008"}
        };

        JLabel serie = new JLabel("serie");
        JComboBox<String> seriebox = new JComboBox<>(markop[0]);
        pan.add(serie);
        pan.add(seriebox);

        markbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = markbox.getSelectedIndex();
                seriebox.removeAllItems();
                for(String item : markop[index]){
                    seriebox.addItem(item);
                }
            }
        });
       JLabel date= new JLabel("date");



        DefaultListModel<String> yearlistm = new DefaultListModel<>();
        for(int year = 1980; year<2024; year++){
           yearlistm.addElement(String.valueOf(year));
        }

        JList<String> yearlist = new JList<>(yearlistm);
        JScrollPane scroll = new JScrollPane(yearlist);

        JPanel pan2 = new JPanel();
        pan2.setLayout(new BorderLayout(2,1));

        scroll.setPreferredSize(new Dimension(100,20));
        pan.add(date);
        pan.add(scroll);

        JButton save = new JButton("save");
        JButton clear = new JButton("clear");


        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedMark = (String)markbox.getSelectedItem();
                String selectedserie = (String)seriebox.getSelectedItem();
                BufferedWriter writer= null;
                try {
                    writer = new BufferedWriter(new FileWriter(new File("./car.txt"),true));
                    String selectedCar = markbox.getItemAt(markbox.getSelectedIndex())+"\t" + seriebox.getItemAt(seriebox.getSelectedIndex())+"\t" ;
                   //writer.write(selectedMark);
                    // writer.write(selectedserie);
                   writer.write(selectedCar);
                    writer.newLine();
                    System.out.println("item saved to fichier.txt");
                    writer.flush();
                    writer.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });

        pan2.add(clear);
        pan2.add(save);


        //pan.addMouseListener(tp);
        panel.add(pan,BorderLayout.NORTH);
        panel.add(pan2,BorderLayout.SOUTH);

        //frame.add(panel,BorderLayout.CENTER);
        frame.getContentPane().add(panel);





        /*
        //JFrame = a GUI Window to add components to

        //creat a frame
        JFrame frame = new JFrame();

        //sets the X-dimention, and Y-dimention of frame
        frame.setSize(420, 420);

        //sets title of frame
        frame.setTitle("JFrame title goes here");

        //Bay default is HIDE_ON_CLOSE
        //frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        //do not close
       //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

       //exit out of application
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // make frame visible
        frame.setVisible(true);

        //prevent frame from being resized
        frame.setResizable(true);

        //create image icone
        ImageIcon image = new ImageIcon("GUI/Akatsuke.jpeg");

        //change icone of frame
        frame.setIconImage(image.getImage());

        //change color of background
        //frame.getContentPane().setBackground(Color.BLACK);
        frame.getContentPane().setBackground(new Color(0x023446));
         */

    }


}
