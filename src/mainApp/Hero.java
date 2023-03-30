package BombJack;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Hero{
	
	BufferedImage image;
	private int dx;
	private int dy;
	
	public Hero(int xcoord, int ycoord){
		
		this.dx = xcoord;
		this.dy = ycoord;
		try {
			this.image = ImageIO.read(new File("load/catResized.png"));
		} catch (IOException e) {
			throw new RuntimeException("ImageNotFound ");
		}
	}
	
	public void draw(Graphics2D g2){
		g2.drawImage(this.image, this.dx, this.dy, null);
		
	}
	
	public void moveBy(int x, int y){
		this.dx = this.dx + x;
		this.dy = this.dy + y;
	}
	
	

}
