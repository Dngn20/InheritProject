package inherit.view;

import java.awt.Dimension;
import javax.swing.JFrame;
import inherit.controller.*;

public class InheritFrame extends JFrame
{
	private InheritController baseController;
	private InheritPanel appPanel;
	
	public InheritFrame(InheritController baseControlller)
	{
		super();
		this.baseController = baseController;
		appPanel = new InheritPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("ChatBot");
		this.setSize(new Dimension (800, 600));
		this.setResizable(false);
		this.setVisible(true);
	}
}
