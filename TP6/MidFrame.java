import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyVetoException;
import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class MidFrame extends JFrame {
    private JDesktopPane desktopPane = new JDesktopPane();

    public MidFrame() {
        super("JDesktopPane / JInternalFrame sample");
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        desktopPane.setBackground(Color.gray);
        JPanel contentPane = (JPanel) this.getContentPane();
        contentPane.add(desktopPane, BorderLayout.CENTER);

        this.createMenuBar();

        JInternalFrame firstWindow = new JInternalFrame("Premiere fenetre");
        firstWindow.setSize(300, 200);
        firstWindow.setVisible(true);
        firstWindow.setResizable(true);
        desktopPane.add(firstWindow);

        JInternalFrame secondWindow = new JInternalFrame("Seconde fenetre");
        secondWindow.setSize(300, 200);
        secondWindow.setVisible(true);
        secondWindow.setResizable(true);
        secondWindow.setClosable(true);
        secondWindow.setIconifiable(true);
        secondWindow.setLocation(20, 20);
        secondWindow.setMaximizable(true);

        desktopPane.add(secondWindow);

        try {
            secondWindow.moveToFront();
            secondWindow.setSelected(true);
        } catch (PropertyVetoException exception) {
            exception.printStackTrace();
        }

        contentPane.add(new JTree(), BorderLayout.WEST);
        contentPane.add(new JLabel("La barre de status"), BorderLayout.SOUTH);
    }

    private void createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu mnuFile = new JMenu("File");
        JMenuItem mnuNewFile = new JMenuItem("New File");
        mnuFile.add(mnuNewFile);
        JMenuItem mnuOpenFile = new JMenuItem("Open File...");
        mnuFile.add(mnuOpenFile);
        JMenuItem mnuSaveFile = new JMenuItem("Save File");
        mnuFile.add(mnuSaveFile);
        JMenuItem mnuSaveFileAs = new JMenuItem("Save File As...");
        mnuFile.add(mnuSaveFileAs);
        menuBar.add(mnuFile);

        JMenu mnuEdit = new JMenu("Edit");
        JMenuItem mnuUndo = new JMenuItem("Undo");
        mnuEdit.add(mnuUndo);
        JMenuItem mnuRedo = new JMenuItem("Redo");
        mnuEdit.add(mnuRedo);
        mnuEdit.addSeparator();
        JMenuItem mnuCopy = new JMenuItem("Copy");
        mnuEdit.add(mnuCopy);
        JMenuItem mnuCut = new JMenuItem("Cut");
        mnuEdit.add(mnuCut);
        JMenuItem mnuPaste = new JMenuItem("Paste");
        mnuEdit.add(mnuPaste);
        menuBar.add(mnuEdit);

        JMenu mnuWindow = new JMenu("Window");
        JMenuItem mnuCascade = new JMenuItem("Cascade");
        JMenuItem mnuTileHorizontally = new JMenuItem("Tile horizontally");
        JMenuItem mnuTileVertically = new JMenuItem("Tile vertically");
        JMenuItem mnuIconifyAll = new JMenuItem("Iconify all");

        mnuWindow.add(mnuCascade);
        mnuWindow.add(mnuTileHorizontally);
        mnuWindow.add(mnuTileVertically);
        mnuWindow.add(mnuIconifyAll);

        menuBar.add(mnuWindow);

        JMenu mnuHelp = new JMenu("Help");
        menuBar.add(mnuHelp);

        this.setJMenuBar(menuBar);
    }

    private void mnuCascadeListener(ActionEvent event) {
        JInternalFrame[] internalFrames = desktopPane.getAllFrames();
        for (int i = 0; i < internalFrames.length; i++) {
            internalFrames[i].setBounds(i * 20, i * 20, 300, 200);
        }
    }

    private void mnuTileHorizontallyListener(ActionEvent event) {
        JInternalFrame[] internalFrames = desktopPane.getAllFrames();
        int frameWidth = desktopPane.getWidth() / internalFrames.length;
        for (int i = 0; i < internalFrames.length; i++) {
            internalFrames[i].setBounds(i * frameWidth, 0, frameWidth, desktopPane.getHeight());
        }
    }

    private void mnuTileVerticallyListener(ActionEvent event) {
        JInternalFrame[] internalFrames = desktopPane.getAllFrames();
        int frameHeight = desktopPane.getHeight() / internalFrames.length;
        for (int i = 0; i < internalFrames.length; i++) {
            internalFrames[i].setBounds(0, i * frameHeight, desktopPane.getWidth(), frameHeight);
        }
    }

    private void mnuIconifyAll(ActionEvent event) {
        JInternalFrame[] internalFrames = desktopPane.getAllFrames();
        for (int i = 0; i < internalFrames.length; i++) {
            try {
                internalFrames[i].setIcon(true);
            } catch (PropertyVetoException exception) {
                exception.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            MidFrame frame = new MidFrame();
            frame.setVisible(true);
        });
    }
}