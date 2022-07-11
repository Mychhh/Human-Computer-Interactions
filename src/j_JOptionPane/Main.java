package j_JOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	
	//JOption Pane = pop up a standard dialogue box that prompts user the value
	//               or informs them something	
		
	JOptionPane.showMessageDialog(null, "This is some uselss info", "title", JOptionPane.PLAIN_MESSAGE);	
	JOptionPane.showMessageDialog(null, "This is some uselss info", "title", JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog(null, "This is some uselss info", "title", JOptionPane.QUESTION_MESSAGE);
	JOptionPane.showMessageDialog(null, "This is some uselss info", "title", JOptionPane.WARNING_MESSAGE);
	JOptionPane.showMessageDialog(null, "This is some uselss info", "title", JOptionPane.ERROR_MESSAGE);

//you can store this value and make a statement based on your program	
	int answer = JOptionPane.showConfirmDialog(null, "bro do you even code?", "this is my title", JOptionPane.YES_NO_CANCEL_OPTION);

	String name = JOptionPane.showInputDialog("What is your name: ");
	System.out.println("Hello "+ name);
	
	String[] responses = {"No, you're awesome!","thank you!","*blush*"}; 
	ImageIcon icon = new ImageIcon("smile.png");
	                     
//                                                                                                                                             icon              	
	JOptionPane.showOptionDialog(null, "You are awesome", "Secret Message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, responses, 0);
	
	}

}
