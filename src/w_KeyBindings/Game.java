package w_KeyBindings;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Game 
{
	JFrame frame;
	JLabel label;
	
	Action UpAction;
	Action DownAction;
	Action LeftAction;
	Action RightAction;
	
	Game()
	{
		label = new JLabel();
		label.setBackground(Color.red);
		label.setOpaque(true);
		label.setBounds(100,100,100,100);
		
		UpAction    = new UpAction();
		DownAction  = new DownAction();
		LeftAction  = new LeftAction();
		RightAction = new RightAction();
/*Arrow Keys
		label.getInputMap().put(KeyStroke.getKeyStroke("UP"),"upAction");
		label.getActionMap().put("upAction", UpAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"),"downAction");
		label.getActionMap().put("downAction", DownAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"leftAction");
		label.getActionMap().put("leftAction", LeftAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"),"rightAction");
		label.getActionMap().put("rightAction", RightAction);
*/
//wasd keys
		label.getInputMap().put(KeyStroke.getKeyStroke('w'),"upAction");
		label.getActionMap().put("upAction", UpAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke('s'),"downAction");
		label.getActionMap().put("downAction", DownAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke('a'),"leftAction");
		label.getActionMap().put("leftAction", LeftAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke('d'),"rightAction");
		label.getActionMap().put("rightAction", RightAction);
		
		frame = new JFrame("KeyBinding Demo");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		
		frame.add(label);
		
		frame.setVisible(true);		
	}
	
	public class UpAction extends AbstractAction
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			label.setLocation(label.getX(),label.getY()-10);
		}
	}
	
	public class DownAction extends AbstractAction
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			label.setLocation(label.getX(),label.getY()+10);
		}
	}
	public class LeftAction extends AbstractAction
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			label.setLocation(label.getX()-10,label.getY());
		}
	}
	public class RightAction extends AbstractAction
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			label.setLocation(label.getX()+10,label.getY());
		}
	}
	
	
	
	
	
	
	
	
	
}
