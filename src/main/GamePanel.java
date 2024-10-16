package main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import java.io.InputStream;

public class GamePanel extends JPanel {
	
	private MouseInputs mouseInputs;
	private float xDelta = 100, yDelta = 100;
	private BufferedImage img, subImage;

	
	public GamePanel() {

		mouseInputs = new MouseInputs(this);
		
		importImg();
		
		setPanelSize();
		addKeyListener(new KeyboardInputs(this));
		addMouseListener(mouseInputs);
		addMouseMotionListener(mouseInputs);
			
	}
	
	private void importImg() {
		
		InputStream is = getClass().getResourceAsStream("/player_sprites.png");
	    
		try {
			img = ImageIO.read(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void setPanelSize() {
		Dimension size = new Dimension(1280,800);
		setPreferredSize(size);
	}
	
	public void changeXdelta(int value) {
		this.xDelta += value;
		repaint();
	}
	
	public void changeYdelta(int value) {
		this.yDelta += value;
		repaint();
	}
	
	public void setRectPos(int x,int y) {
		this.xDelta = x;
		this.yDelta = y;
		repaint();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//image position in player_sprites.png
		subImage = img.getSubimage(1* 64, 8*40,64,40);
		g.drawImage(subImage, (int) xDelta, (int) yDelta, 128, 80, null);
	}
	
}
