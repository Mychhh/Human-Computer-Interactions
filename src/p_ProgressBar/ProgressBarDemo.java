package p_ProgressBar;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ProgressBarDemo 
{
	
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar();
	
	ProgressBarDemo()
	{
		
		bar.setValue(0);
		bar.setBounds(0,0, 420,50);     //size within a frame or components and size of the bar
				
		bar.setStringPainted(true);     //adds a percent value
		bar.setFont(new Font("MV Boli", Font.BOLD, 25));
		
		bar.setForeground(Color.RED);   //Fill color of a bar
		bar.setBackground(Color.BLACK); //Background color
		 	
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);          //if you did not declare a layout in frame, 
		                                //you should set bounds on a components that you would add on a frame
		frame.setVisible(true);
		
		fill();
	}
	
	public void fill() 
	{
		
		int counter = 0;
		
		//the loading progress of a bar
		while(counter <= 100) 
		{
			bar.setValue(counter);
			
			try 
			{
				Thread.sleep(50);
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			
			counter += 1;
		}
		//this will print if the loading has been completed
		bar.setString("Done");
	}
	
	
	
	
	
	
	
	
	
}
