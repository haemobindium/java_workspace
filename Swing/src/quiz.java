import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class quiz {

	public static void main(String[] args) {
		   JFrame frame = new JFrame("My First GUI");
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       frame.setSize(400,400);
			/*      
		       JMenuBar mb = new JMenuBar();
		       JMenu m1 = new JMenu("File");
		       JMenu m2 = new JMenu("Help");
		       mb.add(m1);
		       mb.add(m2);
		       JMenuItem m11 = new JMenuItem("Open");
		       JMenuItem m12 = new JMenuItem("Save as");
		       m1.add(m11);
		       m1.add(m12);
	       	*/
	       //Creating panel at bottom and adding components
	       
	       
	       JPanel panel = new JPanel();
	       
	       JLabel label = new JLabel("Q1: Which one is primitive datatype?");
	       	//JTextField text = new JTextField(10);
	       
	       JLabel l1 = new JLabel("int");
	       JLabel l2 = new JLabel("String");
	       JLabel l3 = new JLabel("Double");
	       JLabel l4 = new JLabel("Float");
	       JLabel l5 = new JLabel("Boolean");
	       
	       JButton next = new JButton("Next");
	       		//frame.getContentPane().add(send); // Adds Button to content pane of frame	       
	       		//JButton reset = new JButton("Reset");
	       		//frame.getContentPane().add(reset);
	       
	       //JOptionPane op = new JOptionPane();
	       
	       
	       JRadioButton birdButton = new JRadioButton();
	       birdButton.setMnemonic(KeyEvent.VK_B);
	       //birdButton.setActionCommand(birdString);
	       //birdButton.setSelected(true);

	       JRadioButton catButton = new JRadioButton();
	       catButton.setMnemonic(KeyEvent.VK_C);
	       //catButton.setActionCommand(catString);

	       JRadioButton dogButton = new JRadioButton();
	       dogButton.setMnemonic(KeyEvent.VK_D);
	       //dogButton.setActionCommand(dogString);

	       JRadioButton rabbitButton = new JRadioButton();
	       rabbitButton.setMnemonic(KeyEvent.VK_R);
	      // rabbitButton.setActionCommand(rabbitString);

	       JRadioButton pigButton = new JRadioButton();
	       pigButton.setMnemonic(KeyEvent.VK_P);
	       //pigButton.setActionCommand(pigString);

	       //Group the radio buttons.
	       ButtonGroup group = new ButtonGroup();
	       group.add(birdButton);
	       group.add(catButton);
	       group.add(dogButton);
	       group.add(rabbitButton);
	       group.add(pigButton);

	       //Register a listener for the radio buttons.
	       // birdButton.addActionListener(this);
	       //catButton.addActionListener(this);
	       //dogButton.addActionListener(this);
	       //rabbitButton.addActionListener(this);
	       //pigButton.addActionListener(this);
	       
	       frame.getContentPane().add(BorderLayout.NORTH, label);
	       
	       //frame.setLayout(new FlowLayout());
	       
	       JPanel p1 = new JPanel();
	       frame.setLayout(new FlowLayout());
	       
	       Container c = frame.getContentPane();
	       c.setLayout(new GridLayout(0,1));
	       p1.add(birdButton);
	       p1.add(l1);
	       
	       
	       frame.getContentPane().add(p1);
	       
	       //Container c = frame.getContentPane();
	       c.setLayout(new GridLayout(0,1));
	       p1.add(birdButton);
	       p1.add(l1);
	       
	       
	       frame.getContentPane().add(p1);
	       
	       JPanel p2 = new JPanel();
	       
	       p2.add(pigButton);
	       p2.add(l2);
	       
	       
	       //frame.getContentPane().add(BorderLayout.AFTER_LINE_ENDS, p2);
	       
	       frame.add(catButton);
	       frame.add(l2);
	       frame.add(dogButton);
	       frame.add(l3);
	       frame.add(rabbitButton);
	       frame.add(l4);
	      // frame.add(pigButton);
	       //frame.add(l5);
	       
	   
	       frame.getContentPane().add(BorderLayout.PAGE_END, next);
	       
	       
	       //frame.getContentPane().add(BorderLayout.CENTER,ta);
	       //frame.getContentPane().add(BorderLayout.NORTH, mb);
	       panel.setVisible(true);
	       
	       frame.setVisible(true);
	       
	       
	       
	       

	}

}
