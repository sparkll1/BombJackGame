package BombJack;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;


public class HeroViewer {

	/**
	 * The width of the frame.
	 */
	public static final int WIDTH = 500;
	/**
	 * The height of the frame.
	 */
	public static final int HEIGHT = 500;

	public void makeWindow() {
JFrame frame = new JFrame();
		
		frame.setTitle("BombJack Game");
		frame.setSize(WIDTH, HEIGHT);

		
		
		HeroComponent c = new HeroComponent();
		c.setPreferredSize(new Dimension(WIDTH,HEIGHT));
		frame.add(c);
		
		
		JPanel panel = new JPanel();

	
		JButton reset = new JButton("Reset");
		reset.addKeyListener(new MoveListener(c));
		panel.add(reset);

		
		frame.add(panel, BorderLayout.SOUTH);
		
		frame.pack();
	//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);		
		
		
	}
	
	public static void main(String[] args) {
		HeroViewer viewer = new HeroViewer();
		viewer.makeWindow();
	}
	
	

}
