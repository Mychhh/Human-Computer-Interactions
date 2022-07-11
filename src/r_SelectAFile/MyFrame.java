package r_SelectAFile;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener
{
	JButton button;
	
	MyFrame()
	{
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Select a File");
		button.addActionListener(this);
		
		this.add(button);
		this.pack();
		this.setVisible(true);
	}
	
	@Override	
	public void actionPerformed(ActionEvent arg0) 
	{
		
		if(arg0.getSource() == button) 
		{
			
			JFileChooser fileChooser = new JFileChooser();
			
		    int response = fileChooser.showSaveDialog(null); 
		    
		    if(response == JFileChooser.APPROVE_OPTION) 
		    {
		    	File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
		    	System.out.println(file);
		    }
		    
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
