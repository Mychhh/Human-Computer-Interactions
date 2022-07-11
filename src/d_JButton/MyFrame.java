package d_JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {
	
	JButton button; 
	JLabel label;
	
//  Constructors	
	MyFrame()
	{
		ImageIcon icon  = new ImageIcon("C:\\Users\\Michael Pabaya\\Downloads\\icons8-point-24.png");
		ImageIcon icon1 = new ImageIcon("C:\\Users/Michael Pabaya\\Downloads\\icons8-uwu-emoji-24.png");
		
		label = new JLabel();
		label.setIcon(icon1);
		label.setBounds(220, 250, 150, 150);
		label.setVisible(false);
		
		button = new JButton();	               //Creates a button 
		button.setBounds(100, 100, 250, 100);  //Set size or bounds of a button
		button.addActionListener(this);        //Adds an Action Listener
		button.setText("I am a Button!");      //Set text
		button.setFocusable(false);            //this will get rid off the lines along side the text button  
		button.setIcon(icon);
		
		//Sets a position of a button
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Cosmic Sans", Font.BOLD, 25)); //Sets a Font styles of a text
		button.setIconTextGap(-11);                             //Set icon text gap
		button.setForeground(Color.cyan);
		button.setBackground(Color.lightGray);                
		button.setBorder(BorderFactory.createEtchedBorder());

//Sets button unable
//  	button.setEnabled(false);
		
//this is an advance expression 
//if you don't want to implements Action Listener and a new method
//		button.addActionListener(e -> System.out.println("poo"));
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Close frame
		this.setLayout(null);                               //Set Layout
		this.setSize(500,500);                              //Size of the frame  
		this.setVisible(true);                              //Make the frame Visible\
		
		this.add(button);
		this.add(label);

	}

@Override
	public void actionPerformed(ActionEvent e) 
    {  
	
	if(e.getSource() == button)
	{
		System.out.println("Poo");
		label.setVisible(true);
	}
	
	}

}
