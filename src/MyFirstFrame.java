import javax.swing.*;
import java.awt.*;//for background color 

class MyFirstFrame{
	public static void main(String args[]){
		//to create the frame 
		JFrame frame = new JFrame();
		//to make the frame visible 
		
		//to "close the frame" kill "terminate" the processus when click on close button
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(700,500);
		//frame.setLocation(100,50);
		frame.setBounds(150,150,1000,500);
		frame.setTitle("My Frame");
		
		ImageIcon icon = new ImageIcon("image.png");
		frame.setIconImage(icon.getImage());
		
		Container c = frame.getContentPane();
		//color color = new Color(255,0,0);
		c.setBackground(Color.RED);
		
		//frame.setResizable(false); //so the size of the frame does not change
		
		
		frame.setVisible(true);//show after read all the code assignment
	}

}
	 