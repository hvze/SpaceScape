package fahadAndDavid;

import java.util.Scanner;

public class DavidBackend implements FahadSupport{
	
	public boolean[][] game;
	public static Scanner in;
	public boolean victorious = false;
	
	public void generateMap() {
		game = new boolean[5][5];
		for(int row = 0; row < game.length; row++) {
			for(int col = 0; col < game[row].length; col++) {
				if(Math.random() < .2)
					toggleLights(row, col); 
			}
		}
	}
	
	public void toggleLights(int row, int col) {
		
	}
	
	public DavidBackend(DavidSupport frontend) {
		
	}
	
	
	public void main(String[] args) {
		generateMap();
	}

}
