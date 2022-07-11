package i_NewWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener 
{
	
	JFrame frame =  new JFrame();
	JButton myButton = new JButton("New Window");
	
//Constructors
	LaunchPage()
	{
		myButton.setBounds(100,160,200,40);
		myButton.setFocusable(false);
		myButton.addActionListener(this);
		
		frame.add(myButton);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true); 
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		if(arg0.getSource() == myButton) 
		{
//this will automatically exit the launch page window		
		frame.dispose();
		
		NewWindow myWindow = new NewWindow();	
		}
	}
	
}
