package m_radioButtons;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

public class myFrame extends JFrame implements ActionListener
{
	JRadioButton pizza;
	JRadioButton hamburger;
	JRadioButton hotdog;
	
	ImageIcon pizzaIcon = new ImageIcon("C:\\Java\\Icon\\PNG\\pizza.png");
	
	ImageIcon hamburgerIcon = new ImageIcon("C:\\Java\\Icon\\PNG\\burger.png");
	
	ImageIcon hotdogIcon = new ImageIcon("C:\\Java\\Icon\\PNG\\hotdog.png");
	
	myFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setTitle("ORDER");
		
		pizza = new JRadioButton("Pizza");
		hamburger = new JRadioButton("Hamburger");
		hotdog = new JRadioButton("Hotdog");
		
		pizzaIcon.setImage(pizzaIcon.getImage().getScaledInstance(30,30,30)); //set the size of the imageicon
		hamburgerIcon.setImage(hamburgerIcon.getImage().getScaledInstance(30,30,30)); //set the size of the imageicon
		hotdogIcon.setImage(hotdogIcon.getImage().getScaledInstance(30,30,30)); //set the size of the imageicon
		
		ButtonGroup group = new ButtonGroup();//this will limit the users choices into 1 order
		group.add(pizza);
		group.add(hamburger);
		group.add(hotdog);
		
		pizza.setIcon(pizzaIcon);
		hamburger.setIcon(hamburgerIcon);
		hotdog.setIcon(hotdogIcon);
		
		pizza.addActionListener(this);
		hamburger.addActionListener(this);
		hotdog.addActionListener(this);
	
		this.add(pizza);
		this.add(hamburger);
		this.add(hotdog);
		
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		if(arg0.getSource() == pizza) 
		{
			System.out.println("You ordered a Pizza!");			
		}
		else if(arg0.getSource() == hamburger) 
		{
			System.out.println("You ordered a Hamburger!");			
		}
		else if(arg0.getSource() == hotdog) 
		{
			System.out.println("You ordered a Hotdog!");			
		}
	}
}
