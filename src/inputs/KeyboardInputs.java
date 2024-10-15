package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import main.GamePanel;

public class KeyboardInputs implements KeyListener {
	
	private GamePanel gamePanel;
	
	public KeyboardInputs(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		switch (e.getKeyCode()) {
		case KeyEvent.VK_Z:
			System.out.println("Z is pressed");
			gamePanel.changeYdelta(-5);
			
			break;
		case KeyEvent.VK_Q:
			System.out.println("Q is pressed");
			gamePanel.changeXdelta(-5);
			break;
		case KeyEvent.VK_S:
			System.out.println("S is pressed");
			gamePanel.changeYdelta(5);
			break;
		case KeyEvent.VK_D:
			System.out.println("D is pressed");
			gamePanel.changeXdelta(5);
			break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}
	
	
}
