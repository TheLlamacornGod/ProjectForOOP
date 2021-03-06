package edu.neumont.csc150.finalproject.group21;

import javax.swing.JPanel;

public class WindowStartScreen extends JPanel {

	private ImageComponent background;
	private MenuButtons start, exit;
	
	public WindowStartScreen(FrameGame frame) {
		
		this.setLayout(null);
		
		background = new ImageComponent("Images/StartScreen.png");
		background.setLocation(0, 0);
		
		start = new MenuButtons(frame, 2, "Start");
		start.setSize(110, 50);
		start.setLocation((background.getWidth()/3) - (start.getWidth()/2), 800);
		
		exit = new MenuButtons(frame, 0, "Exit");
		exit.setSize(110, 50);
		exit.setLocation((background.getWidth()/2) + (exit.getWidth()), 800);
		
		this.setSize(background.getWidth(), background.getHeight() + 50);
		this.add(start);
		this.add(exit);
		this.add(background);
	}
	
}
