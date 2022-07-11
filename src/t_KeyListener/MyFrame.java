package t_KeyListener;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements KeyListener
{	
	JLabel label;
	
	ImageIcon rocketIcon = new ImageIcon("C:\\Java\\Icon\\PNG\\rocket.png");
	
	MyFrame()
	{
		rocketIcon.setImage(rocketIcon.getImage().getScaledInstance(100,80,0)); //set the size of the imageicon
		
		label = new JLabel();
		
		label.setBounds(0,0, 100,100);
		
//this two needs two be used at the same time if you want to set a background color		
		label.setBackground(Color.red);  //this will set what kind of background color you want
		label.setOpaque(true);           //this will make visible your desired background color
		
		label.setIcon(rocketIcon);
		
		this.add(label);
		
		this.addKeyListener(this);
		
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.getContentPane().setBackground(Color.BLACK);
		this.setLayout(null);
		this.setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent arg0) 
	{
		//Invoked when a physical key is pressed down, Uses KeyCode, int output
		switch(arg0.getKeyCode()) 
		{
		
		case 37:
			label.setLocation(label.getX()-10, label.getY());
			break;
		
		case 38:
			label.setLocation(label.getX(), label.getY()-10);
			break;
			
		case 39:
			label.setLocation(label.getX()+10, label.getY());
			break;
			
		case 40:
			label.setLocation(label.getX(), label.getY()+10);
			break;	
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) 
	{
		//called whenever the button is released
		System.out.println("You released key char " + arg0.getKeyChar());
		System.out.println("You released key code " + arg0.getKeyCode());
	}

	@Override
	public void keyTyped(KeyEvent arg0) 
	{
		//Invoked when a key is typed. Uses KeyChar, char output	
		
		switch(arg0.getKeyChar()) 
		{
		
		case 'a':
			label.setLocation(label.getX()-10, label.getY());
			break;
		
		case 'w':
			label.setLocation(label.getX(), label.getY()-10);
			break;
			
		case 's':
			label.setLocation(label.getX(), label.getY()+10);
			break;
			
		case 'd':
			label.setLocation(label.getX()+10, label.getY());
			break;	
		}
	}
	
	
	
	
	
	
	
	
	
	
}
