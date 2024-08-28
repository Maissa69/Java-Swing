import javax.swing.*;
import java.awt.*;

class MyFirstLabel{
	public static void main(String args[]){
		JFrame frame = new JFrame () ;
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,100,1000,500);
		Container contentpane = frame.getContentPane ();
		
		//to have full control over the position and size of the components 
		contentpane.setLayout (null);
		
		//to create a label
		//JLabel label=new JLabel ("username");
		//label.setBounds(100,50,200,30);
		/*
			1//Font Name ("Arial"): This specifies the name of the font.
			In this case, you are using "Arial".
			
			2// Font Style (Font.PLAIN): The second parameter specifies the style of the font. 
			The Font class provides several constants for different font styles:

				Font.PLAIN: Specifies a plain (normal) font style with no special styling.
				Font.BOLD: Specifies a bold font style.
				Font.ITALIC: Specifies an italic font style.
				Font.BOLD + Font.ITALIC: Specifies a bold and italic font style.
			.
			
			3// Font Size (30);
			
			*Once you've created the Font object,
			you can use it to set the font for Swing components that display text
			exemple:
			{
				Font font = new Font("Arial", Font.PLAIN, 30);

				JLabel label = new JLabel("Hello, World!");
				label.setFont(font);
			}	
		*/
		//Font font =new Font ("Arial" , Font.PLAIN, 30
		//Font font =new Font ("Arial" , Font.ITALIC, 30);
		//label.setFont(font);
		
		ImageIcon icon = new ImageIcon("IMAGE.jpg");
		
		JLabel imlabel = new JLabel (icon);
		imlabel.setBounds(0,0,icon.getIconWidth() , icon.getIconHeight());
		
		JLabel imtext = new JLabel("TEXT",icon,JLabel.LEFT);
		imtext.setBounds(0,100,500,100);
		//add the label on the pane 
		//contentpane.add(label);
		
		contentpane.add(imlabel);
		
		
	}
}