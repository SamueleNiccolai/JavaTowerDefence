package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

public class GameScreen extends JPanel {

	private Random random;
	private BufferedImage img;
	// private HashMap<String, BufferedImage> sprites = new HashMap<String,
	// BufferedImage>();
	private ArrayList<BufferedImage> spriteList = new ArrayList<BufferedImage>();

	public BufferedImage getImg() {
		return img;
	}

	public void setImg(BufferedImage img) {
		this.img = img;

	}

//	public HashMap<String, BufferedImage> getSprites() {
//		return sprites;
//	}
//
//	public void setSprites(HashMap<String, BufferedImage> sprites) {
//		this.sprites = sprites;
//	}

	public ArrayList<BufferedImage> getSpriteList() {
		return spriteList;
	}

	public void setSpriteList(ArrayList<BufferedImage> spriteList) {
		this.spriteList = spriteList;
	}

	public GameScreen(BufferedImage img) {
		random = new Random();
		setImg(img);
		loadSprites();
	}

	private void loadSprites() {
		for (int x = 0; x < 10; x++) {
			for (int y = 0; y < 10; y++) {
				getSpriteList().add(getImg().getSubimage(x * 32, y * 32, 32, 32));
			}
		}
	}

	// To call the super class to do all the calculation
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// to draw the full img
		// g.drawImage(getImg(), 0, 0, null);

		g.drawImage(getSpriteList().get(91), 0, 0, null);

		for (int x = 0; x < 20; x++) {
			for (int y = 0; y < 20; y++) {
				g.drawImage(getSpriteList().get(getRndInt(100)), x * 32, y * 32, null);
			}
		}
	}

	private Color getRndColor() {
		int red = random.nextInt(256); // => 0 <= red < 256
		int green = random.nextInt(256);
		int blue = random.nextInt(256);
		return new Color(red, green, blue);
	}

	private int getRndInt(int MaxValueExcluded) {
		return random.nextInt(MaxValueExcluded);
	}

}
