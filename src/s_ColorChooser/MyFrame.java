package s_ColorChooser;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener 
{
	
	JButton button;
	JLabel label;
	
	MyFrame()
	{
		button = new JButton("Pick a color");
		button.addActionListener(this);
		
		label = new JLabel();
		label.setText("This is some Text :D");
		label.setFont(new Font("MV Boli",Font.PLAIN,80));
		
		label.setBackground(Color.white); //this two must be always together
		label.setOpaque(true);
		
		
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		this.add(button);
		this.add(label);
		
		this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		
		if(arg0.getSource() == button) 
		{
			JColorChooser colorChooser = new JColorChooser();
			
			Color color = JColorChooser.showDialog(null, "Pick a Color. I guess..", Color.black);
			
			label.setForeground(color);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
