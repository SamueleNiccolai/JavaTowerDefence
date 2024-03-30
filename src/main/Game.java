package main;

import javax.swing.JFrame;

public class Game extends JFrame{
	
	private GameScreen gameScreen;
	public Game() {
		// To Create a Window
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// To open the position in the center
		setLocationRelativeTo(null);
		
		// To add object
		this.gameScreen = new GameScreen();
		add(gameScreen);
	}

	public static void main(String[] args) {
		Game game = new Game();
	}
	

}
