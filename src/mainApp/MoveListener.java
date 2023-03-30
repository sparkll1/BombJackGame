package BombJack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class MoveListener implements KeyListener {

	private HeroComponent component;

	public MoveListener(HeroComponent h) {
		this.component = h;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if(key == 38) {
			move("up");
		}else if(key == 40) {
			move("down");
		}else if(key == 39) {
			move("right");
		}else if(key == 37) {
			move("left");
		}
				
	}
	
	public void move(String dir) {
		int x = this.component.getX();
		int y = this.component.getY();
		if(dir.equals("up")) {
			component.moveChunbae(0, -10);
		}else if(dir.equals("down")) {
			component.moveChunbae(0, 10);
		}if(dir.equals("right")) {
			component.moveChunbae(10, 0);
		}if(dir.equals("left")) {
			component.moveChunbae(-10, 0);
		}
		
	}


	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}