package com.thecherno.rain;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable {

	private static final long serialVersionUID = 1L;
	
	//screen-resolution:window
	public static int width = 600;
	public static int height = width/16*9;
	public static int scale = 3;
	
	//Threads
	private Thread thread;
	private JFrame frame;
	private boolean running = false;
	
	//creating an image
	private BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
	//accessing image
	private int[] pixels = ((DataBufferInt)image.getRaster().getDataBuffer()).getData();
	
	public Game(){
		Dimension size = new Dimension(width*scale,height*scale);
		setPreferredSize(size);
		
		frame = new JFrame();
		
	}
	
	public synchronized void start(){
		running = true;
		thread = new Thread(this,"Display");
		thread.start();
	}
	
	public synchronized void stop(){
		running = false;
		try{
			thread.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

	
	public void run() {
		while(running){
			update();//logic update game
			render();//display the images
		}
	}
	
	public void update(){
		
	}
	
	public void render(){
		//Buffer Strategy:temporary storage place
		BufferStrategy bs = getBufferStrategy();
		if(bs == null){
			createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
			//display graphics code here
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getHeight());		
		g.dispose();
		bs.show();		
	}
	
	public static void main(String[] args){
		Game game = new Game();
		game.frame.setResizable(false);
		game.frame.setTitle("Rain");
		game.frame.add(game);
		game.frame.pack();
		game.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.frame.setLocationRelativeTo(null);
		game.frame.setVisible(true);
		
		game.start();
	}
}
