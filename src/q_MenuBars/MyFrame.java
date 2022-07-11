package q_MenuBars;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener
{
	
	JMenuBar menuBar;
	
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;  
	
	ImageIcon loadIcon = new ImageIcon("C:\\Java\\Icon\\PNG\\loading.png");
	ImageIcon saveIcon = new ImageIcon("C:\\Java\\Icon\\PNG\\saved.png");
	ImageIcon exitIcon = new ImageIcon("C:\\Java\\Icon\\PNG\\exit.png");
	
	MyFrame()
	{
		
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		menuBar = new JMenuBar();
		
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit"); //this are the menu that will be added to a JMenuBar
		helpMenu = new JMenu("Help");
		
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save"); //this menu item will be added to the JMenu
		exitItem = new JMenuItem("Exit");
		
		loadIcon.setImage(loadIcon.getImage().getScaledInstance(20,20,20)); 
		saveIcon.setImage(saveIcon.getImage().getScaledInstance(20,20,20)); //set the size of the imageicon
		exitIcon.setImage(exitIcon.getImage().getScaledInstance(20,20,20)); 
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		loadItem.setIcon(loadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);
		
	  //you need to hold alt if you want to use shortcut keys in a JMenu
		fileMenu.setMnemonic(KeyEvent.VK_F);// alt + f to load
		editMenu.setMnemonic(KeyEvent.VK_E);// alt + e to save
		helpMenu.setMnemonic(KeyEvent.VK_H);// alt + h to exit
		
	  //keyboard short cut for bar items
		loadItem.setMnemonic(KeyEvent.VK_L);// l to load
		saveItem.setMnemonic(KeyEvent.VK_S);// s to save
		exitItem.setMnemonic(KeyEvent.VK_E);// e to exit
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);             //adding to a JMenu
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);              //adding menu to a menuBar
		menuBar.add(helpMenu);
		
		this.setJMenuBar(menuBar);          //adding menuBar to a frame
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		
		if(arg0.getSource() == loadItem) 
		{
			System.out.println("*beep, boop, baap* file Loaded");
		}
		else if(arg0.getSource() == saveItem) 
		{
			System.out.println("*beep, boop, baap* file Saved");
		}
		else if(arg0.getSource() == exitItem) 
		{
			System.out.println("*beep, boop, baap* EXIT ");
			System.exit(0);
		}
		
	}

	
	
	
	
	
	
}
