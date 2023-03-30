import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Bomb {
	
	private BufferedImage image;
	private int dx;
	private int dy;

	public Bomb(int y, int x1 ) {
		this.dx = x1;
		this.dy = y;
		
		try {
			this.image = ImageIO.read(new File("load/bomb1.png"));
		} catch (IOException e) {
			throw new RuntimeException("ImageNotFound ");
		}
		
	}
	
	public void draw(Graphics2D g2){
		g2.drawImage(this.image, this.dx, this.dy, null);
		
	}
	
	public boolean collisionCheck(Hero h) {
		return h.intersected(dx, dy , 50, 50);
	}
	
	
	
	
	
	
	
	

}
