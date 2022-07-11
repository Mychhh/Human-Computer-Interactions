package l_checkbox;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.Font;

public class MyFrame extends JFrame implements ActionListener
{
	JButton button;
	JCheckBox checkBox;
	ImageIcon xIcon;
	ImageIcon checkIcon;
	
	MyFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		xIcon = new ImageIcon("C:\\Java\\Icon\\PNG\\Black Ex Icon.png");
		xIcon.setImage(xIcon.getImage().getScaledInstance(30,30,30)); //set the size of the imageicon
		
		checkIcon = new ImageIcon("C:\\Java\\Icon\\PNG\\Black Check Icon.png");
		checkIcon.setImage(checkIcon.getImage().getScaledInstance(30,30,30)); //set the size of the imageicon
		
//button				
		button = new JButton();
		button.setText("Submit");
		button.addActionListener(this);

//checkbox		
		checkBox = new JCheckBox();		
		checkBox.setText("Im not a robot");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));
		checkBox.setIcon(xIcon);
		checkBox.setSelectedIcon(checkIcon);
		
		this.add(button);
		this.add(checkBox);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		if(arg0.getSource() == button)
		{
			System.out.println(checkBox.isSelected());
		}
	}

}
