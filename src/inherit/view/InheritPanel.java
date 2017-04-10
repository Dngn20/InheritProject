package inherit.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import inherit.controller.InheritController;

public class InheritPanel extends JPanel
{
	private InheritController baseController;
	private SpringLayout baseLayout;
	
	
	
	
	public InheritPanel(InheritController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		
		
		
		setupListener();
		setupPanel();
		setupLayout();
		
	}
	
	
	private void setupPanel()
	{
		
	}


	public void setupLayout()
	{
		
	}

	public void setupListener()
	{
		
		
	}
	


}