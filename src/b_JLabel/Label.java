package b_JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Label {

	public static void main(String[] args) {
		
		//Create image
		ImageIcon imageText = new ImageIcon("C:\\Users\\Michael Pabaya\\Pictures\\Wallpaper\\Amon_and_his_Equalists.png");
		
		//Create a color border
		Border border = BorderFactory.createLineBorder(Color.gray, 3);
		
//JLabel = a GUI display area for a string of text, an image, ot both    
		JLabel label = new JLabel();                            
		
		label.setText("Bro, do you even code?");           //Set text of label
		label.setIcon(imageText);                          //Set image on labelText
		label.setHorizontalTextPosition(JLabel.CENTER);    //Set text LEFT,CENTER, or RIGHT of image
		label.setVerticalTextPosition(JLabel.TOP);         //Set text TOP,CENTER, or BOTTOM of image
		label.setForeground(new Color(0xFF00FF));          //This will set font color of text
		label.setFont(new Font("MV Boli", Font.PLAIN, 26));//This will set font of text
		label.setIconTextGap(-7);                          //Set gap of text to image
		
		label.setBackground(Color.black);                  //Set background color
		label.setOpaque(true);                             //Display background color  
		
		label.setBorder(border);                           //Create a border 
		label.setVerticalAlignment(JLabel.CENTER);         //Set Vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER);       //Set Horizontal position of icon+text within label
		
      //label.setBounds(100, 100, 550, 550);               //Set x,y position within frame as well as dimensions    
		
//JFrame		
		JFrame frame =  new JFrame();
		
		frame.setTitle("Hotdog");                            
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(555,555);                                
		frame.setVisible(true); 
		
		frame.add(label);        //This will add a label  
	  //frame.pack();            //This will resize the size of the frame to accomadate all the components that you have 
		                         //note: you have to add first all the label before you use this functions
	  //frame.setLayout(null);   //Set Layout of a label
		
		ImageIcon Image = new ImageIcon("C:\\Users\\Michael Pabaya\\Pictures\\Wallpaper\\Amon_and_his_Equalists.png");
		frame.setIconImage(Image.getImage());
		
		frame.getContentPane().setBackground(new Color(02,26,25));
	}
}