package u_MouseListener;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements MouseListener
{

	JLabel label;
	
	MyFrame()
	{
		label = new JLabel();
		label.setBounds(0,0, 100,100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		label.addMouseListener(this); 
		
		this.add(label);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.setVisible(true);
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) 
	{
		//Invoked when the mouse button has been clicked (pressed and released)
		System.out.println("You clicked the mouse");
	}

	@Override
	public void mouseEntered(MouseEvent arg0) 
	{
		//Invoked when a mouse enters to a component
		System.out.println("You entered the component");
		label.setBackground(Color.blue);
	}

	@Override
	public void mouseExited(MouseEvent arg0) 
	{
		//Invoked when a mouse exits on a component 
		System.out.println("You exited the component");
		label.setBackground(Color.red);
	}

	@Override
	public void mousePressed(MouseEvent arg0) 
	{
		//Invoked when a mouse button has been pressed on a component
		System.out.println("You pressed the mouse");
		label.setBackground(Color.yellow);
	}	

	@Override
	public void mouseReleased(MouseEvent arg0) 
	{
		//Invoked when a mouse button has been released on a component
		System.out.println("You released the mouse");
		label.setBackground(Color.green);
	}
	
}
