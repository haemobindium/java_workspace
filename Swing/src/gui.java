import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class gui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   JFrame frame = new JFrame("My First GUI");
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       frame.setSize(400,400);
			      
	       JMenuBar mb = new JMenuBar();
	       JMenu m1 = new JMenu("File");
	       JMenu m2 = new JMenu("Help");
	       mb.add(m1);
	       mb.add(m2);
	       JMenuItem m11 = new JMenuItem("Open");
	       JMenuItem m12 = new JMenuItem("Save as");
	       m1.add(m11);
	       m1.add(m12);
	       
	       //Creating panel at bottom and adding components
	       JPanel panel = new JPanel();
	       JLabel label = new JLabel("Enter Text");
	       JTextField text = new JTextField(10);
	       JButton send = new JButton("Send");
	       		//frame.getContentPane().add(send); // Adds Button to content pane of frame	       
	       JButton reset = new JButton("Reset");
	       		//frame.getContentPane().add(reset);
	       panel.add(label);	//flow layout for panel
	       panel.add(text);
	       panel.add(send);
	       panel.add(reset);
	       
	       //text area at the center
	       JTextArea ta = new JTextArea();
	       
	       frame.getContentPane().add(BorderLayout.SOUTH, panel);
	       frame.getContentPane().add(BorderLayout.CENTER,ta);
	       frame.getContentPane().add(BorderLayout.NORTH, mb);
	       
	       frame.setVisible(true);
	       
	       
	       
	       panel.setVisible(true); 
	       
	       
	       
	       
	}

}
