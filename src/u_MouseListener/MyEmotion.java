package u_MouseListener;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyEmotion extends JFrame implements MouseListener
{

	JLabel label;
	
	ImageIcon angry;
	ImageIcon meh;
	ImageIcon smile;
	ImageIcon sad;
	
	MyEmotion()
	{	
		angry = new ImageIcon("C:\\Java\\Icon\\PNG\\angry.png");
		meh = new ImageIcon("C:\\Java\\Icon\\PNG\\meh.png");
		smile = new ImageIcon("C:\\Java\\Icon\\PNG\\smile.png");
		sad = new ImageIcon("C:\\Java\\Icon\\PNG\\sad.png");
		
		label = new JLabel();
		label.setIcon(smile);
		
		label.addMouseListener(this);
		
		this.add(label);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setLocationRelativeTo(null); //put frame in the middle of your screen
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
		label.setIcon(angry);
	}

	@Override
	public void mouseExited(MouseEvent arg0) 
	{
		//Invoked when a mouse exits on a component 
		System.out.println("You exited the component");
		label.setIcon(smile);
	}

	@Override
	public void mousePressed(MouseEvent arg0) 
	{
		//Invoked when a mouse button has been pressed on a component
		System.out.println("You pressed the mouse");
		label.setIcon(meh);
	}	

	@Override
	public void mouseReleased(MouseEvent arg0) 
	{
		//Invoked when a mouse button has been released on a component
		System.out.println("You released the mouse");
		label.setIcon(sad);
		
	}
	
}
