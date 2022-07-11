package g_GridLayout;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main 
{

	public static void main(String[] args) 
	{
	//Layout Manager = Defines the natural layout for components within a container 
		
	//Grid Layout    = Places components in a a grid of cells.
	//                 each components takes all the available space within its cells,
	//	               and each cells is the same size.
		
//Frame				
	JFrame frame =  new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(500, 500);
	frame.setLayout(new GridLayout(3,3, 10,10));
	
/*Button	
	JButton button1 = new JButton("1");
	frame.add(button1);

Shortcut */
	frame.add(new JButton("1"));
	frame.add(new JButton("2"));
	frame.add(new JButton("3"));
	frame.add(new JButton("4"));
	frame.add(new JButton("5"));
	frame.add(new JButton("6"));
	frame.add(new JButton("7"));
	frame.add(new JButton("8"));
	frame.add(new JButton("9"));

	frame.setVisible(true);           //I added this at the end of the code, 
	                                  //in order to run the code properly. It is belong to frame 
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
