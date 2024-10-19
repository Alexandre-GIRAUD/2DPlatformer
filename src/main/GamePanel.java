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

import static utils.Constants.PlayerConstants.*;
import static utils.Constants.Directions.*;
import static main.Game.GAME_HEIGHT;
import static main.Game.GAME_WIDTH;

public class GamePanel extends JPanel {
	
	private MouseInputs mouseInputs;
	private Game game;
	
	public GamePanel(Game game) {

		mouseInputs = new MouseInputs(this);
		this.game = game;

		setPanelSize();
		addKeyListener(new KeyboardInputs(this));
		addMouseListener(mouseInputs);
		addMouseMotionListener(mouseInputs);
			
	}
	
	public void setPanelSize() {
		Dimension size = new Dimension(GAME_WIDTH,GAME_HEIGHT);
		setPreferredSize(size);
	}
	
	public void updateGame() {

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		game.render(g);

	}
	
	public Game getGame() {
		return game;
	}
	
}
