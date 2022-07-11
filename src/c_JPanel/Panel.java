package c_JPanel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel {

	public static void main(String[] args) {
		
		ImageIcon icon = new ImageIcon("C:\\Users\\Michael Pabaya\\Pictures\\Downloads\\icons8-uwu-emoji-24");
//JLabel		
		JLabel label =  new JLabel();
		label.setText("Hi");
		label.setIcon(icon);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		
//JPanel		
		JPanel redPanel = new JPanel();          //Create a panel
		redPanel.setBackground(Color.red);       //Set a color of a panel
		redPanel.setBounds(0, 0, 250, 250);      //Set dimensions of a panel
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);
		greenPanel.setLayout(new BorderLayout());//Set layout to a greenPanel
		
		greenPanel.add(label);                   //adds a label, on a panel
		
//JFrame
        JFrame frame =  new JFrame();
		                      
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);                                
		frame.setVisible(true); 
		
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
		
	}

}
