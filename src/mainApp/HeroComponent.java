package BombJack;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;

import BombJack.Hero;


public class HeroComponent extends JComponent {
	
	private Hero hero;
	private Map map;

	public HeroComponent() {
		hero = new Hero(50, 50);
		map = new Map();

	}

	
	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;
		// makes things look slightly prettier
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		hero.draw(g2);
		map.draw(g2);
		

	}
	public void moveChunbae(int dx, int dy) {
		hero.moveBy(dx, dy);
		repaint();
	}
	
	
}
