package BombJack;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Ground {



	
	BufferedImage image;
	private int dx;
	private int dy;
	
	public Ground(int xcoord, int ycoord){
		
		this.dx = xcoord;
		this.dy = ycoord;
		try {
			this.image = ImageIO.read(new File("load/groundImage.png"));
		} catch (IOException e) {
			throw new RuntimeException("Image Not Found ");
		}
	}
	
	public void draw(Graphics2D g2){
		g2.drawImage(this.image, this.dx, this.dy, null);
		
	}
	

}