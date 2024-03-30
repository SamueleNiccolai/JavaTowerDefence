package main;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GameScreen extends JPanel{

	public GameScreen() {
		
	}
	
	// To call the super class to do all the calculation
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.RED);
		g.drawRect(50, 50, 100, 100);
	}

}
