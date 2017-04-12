package inherit.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import inherit.controller.InheritController;

public class InheritPanel extends JPanel
{
	private InheritController baseController;
	private SpringLayout baseLayout;
	private JButton button1;
	private JButton button2;
	private JTextArea textArea;
	
	
	
	public InheritPanel(InheritController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.button1 = new JButton("Button 1");
		this.button2 = new JButton("Button 2");
		this.textArea = new JTextArea(25,60);
		
		
		
		
		
		setupListener();
		setupPanel();
		setupLayout();
		
	}
	
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.darkGray);
		this.setPreferredSize(new Dimension(900, 600));
		this.add(button1);
		this.add(button2);
		this.add(textArea);
	}


	public void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, button1, 121, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, button2, 0, SpringLayout.NORTH, button1);
		baseLayout.putConstraint(SpringLayout.EAST, button2, -199, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, button1, 49, SpringLayout.SOUTH, textArea);
		baseLayout.putConstraint(SpringLayout.NORTH, textArea, 36, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textArea, 85, SpringLayout.WEST, this);

	}

	public void setupListener()
	{
		
		
	}
	


}