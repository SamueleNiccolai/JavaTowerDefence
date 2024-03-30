package main;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Game extends JFrame{
	
	private GameScreen gameScreen;
	private BufferedImage img;
	
	public GameScreen getGameScreen() {
		return gameScreen;
	}
	
	public void setGameScreen(GameScreen gameScreen) {
		this.gameScreen = gameScreen;
	}
	
	public BufferedImage getImg() {
		return img;
	}

	public void setImg(BufferedImage img) {
		this.img = img;
	}
	
	public Game() {
		
		importImg();
		
		// To Create a Window
		setSize(640, 640);
		setVisible(true);
		
			// To stop the program on window close
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// To open the position in the center
		setLocationRelativeTo(null);
		
		// To add object
		setGameScreen(new GameScreen(getImg()));
		add(gameScreen);
	}

	private void importImg() {
		InputStream is = getClass().getResourceAsStream("/spriteatlas.png"); // Browse all folders to find a resource named like this
		try {
			setImg(ImageIO.read(is));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		Game game = new Game();
	}

}
