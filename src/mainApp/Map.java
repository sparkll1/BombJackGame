package BombJack;


import java.awt.Graphics2D;
import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * load the ground/ item
 *  0 = Empty
 *  1 = Ground
 *  2 = item
 */
public class Map {
	private int stageLevel;
	private int[][] terrain;
	
	public Map() {
		this.stageLevel = 1;
		this.terrain = this.loadFile();
	}
	public Map(int level) {
		this.stageLevel = level;
		this.terrain = this.loadFile();
	}
	
	public int[][] loadFile() {
		Scanner scan = null; ///do i need it?
		ArrayList<String> loaded = new ArrayList<>();
		
		try {
			scan = new Scanner(new File("load/map1.txt"));
			while (scan.hasNextLine()) {
				loaded.add(scan.nextLine());
			}
		} catch (FileNotFoundException exception) {
			System.err.println("The terrain file is not found.");
		}
		
		scan.close();
		
		int[][] realMap = new int[loaded.size()][loaded.get(0).length()];
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				realMap[j][i] = Character.getNumericValue(loaded.get(i).charAt(j));
			}
		}
		
		
		
		return realMap;
	}
	
	
	
	public void setLevel(int lv) {
		this.stageLevel = lv;
	}
	
	public void setTerrain(int[][] terrain) {
		this.terrain = terrain;
	}
	
	public void draw(Graphics2D g2) {

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if(this.terrain[i][j] == 1) {
					System.out.println("ground!!!");
					Ground ground = new Ground(i * 50, j * 50);
					ground.draw(g2);
				}

				
			}
		}
	}
/*
	public boolean isWall(int row, int col) {
		if (this.map[row][col] == 1) {
			return true;
		}
		return false;
	}
	*/

}

