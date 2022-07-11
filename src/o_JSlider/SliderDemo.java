package o_JSlider;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo implements ChangeListener
{
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	SliderDemo()
	{
		frame = new JFrame("Slider Demo");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0,100,50);
		
		slider.setPreferredSize(new Dimension(400,200));
		
		slider.setPaintTicks(true);     //this two arg
		slider.setMinorTickSpacing(10); //must be used together
		
		slider.setPaintTrack(true);     //this two arg
		slider.setMajorTickSpacing(25); //must be used together
		
		slider.setPaintLabels(true);    //show numbers
		
		slider.setFont(new Font("MV Boli", Font.PLAIN,15));
		
		slider.setOrientation(SwingConstants.VERTICAL); //by default it is horizontal
		
		slider.addChangeListener(this); //if you want to trigger an event you need to add a Listener
		
		label.setText("°C = "+ slider.getValue());   //this will show the value of the slides
		label.setFont(new Font("MV Boli", Font.PLAIN,25));
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setVisible(true);
	}
	
	@Override
	public void stateChanged(ChangeEvent arg0) 
	{
		label.setText("°C = "+ slider.getValue());
	}

}
