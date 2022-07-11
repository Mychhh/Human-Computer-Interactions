package n_JComboBox;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener
{

	JComboBox comboBox;
	
	MyFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLayout(new FlowLayout());
	    
//You need to use a wrapper class if you want to use an array of int or double etc, Ex. Integers and Double	    	    
	    String[] animals = {"dog", "cat", "bird"};
	    
	    comboBox = new JComboBox(animals);
	    comboBox.addActionListener(this);
	    
	  //comboBox.setEditable(true);                  //make it editable 
	  //System.out.println(comboBox.getItemCount()); //get item count
	  //comboBox.addItem("Horse");                   //add an option/item
	    
	  //comboBox.insertItemAt("Pig", 0);               
	  //comboBox.setSelectedIndex(0);                //adds an item in specific order
 	    
	  //comboBox.removeItem("bird");                 //removes an item by word
	  //comboBox.removeItemAt(0);                    //removes an item by index
	  //comboBox.removeAllItems();                   //removes all item
	    
	    this.add(comboBox);
	    this.pack();
	    this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		if(arg0.getSource() == comboBox) 
		{
	      //System.out.println(comboBox.getSelectedItem() + "\n" );
			System.out.println(comboBox.getSelectedIndex());
		}
	}
	
}


