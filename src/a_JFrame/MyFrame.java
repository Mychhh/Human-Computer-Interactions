package a_JFrame;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;

public class MyFrame extends JFrame
{
	MyFrame()
	{	
		this.setTitle("HotdogCheesedog");                        //Title of the frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     //Close frame
		this.setSize(420,420);                                   //Size of the frame  
		this.setVisible(true);                                   //Make the this Visible
		
		//this will change the icon of our this 
		ImageIcon Image = new ImageIcon("C:\\Users\\Michael Pabaya\\Pictures\\Wallpaper\\Amon_and_his_Equalists.png");
		this.setIconImage(Image.getImage());
		
		//change color of the background
		//note: you can create different syntax in changing color
		this.getContentPane().setBackground(new Color(02,26,25));//background color
	}
}
