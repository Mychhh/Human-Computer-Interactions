package k_TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener
{

	JButton button;
	JTextField textfield;	
	
    MyFrame()
    {
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Submit");//button text
		button.addActionListener(this);//action listener of a button
		
		textfield = new JTextField();	
		textfield.setPreferredSize(new Dimension(240, 40));     //size of a textfield 
		textfield.setFont(new Font("Consolas", Font.PLAIN, 35));//font style of a textfield
		textfield.setForeground(new Color(0x00FF00));           //text color
		textfield.setBackground(Color.BLACK);                   //background color
		textfield.setCaretColor(Color.WHITE);                   //caret color
		textfield.setText("Username");                          //add a text immediately, but you can still edit a text
		
		this.add(button);
		this.add(textfield);
		this.pack();
		this.setVisible(true); 
    } 
	
	public void actionPerformed(ActionEvent arg0) 
	{
		if(arg0.getSource() == button) 
		{
			System.out.println("Welcome "+ textfield.getText());
			
			button.setEnabled(false);      
			textfield.setEditable(false); //After the user entered their username we will disabled the button ad textfield 
		}
			
	}

}
