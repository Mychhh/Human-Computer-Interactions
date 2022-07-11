package v_DragNDrop;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyFrame extends JFrame
{
	
	DragPanel dragPanel = new DragPanel();
	
	MyFrame()
	{
		this.add(dragPanel);
		this.setTitle("Drag and Drop Demo");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null); //put frame in the middle of your screen
		this.setVisible(true);
	}
}
