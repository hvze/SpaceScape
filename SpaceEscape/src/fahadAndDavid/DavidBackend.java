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
		toggleSlot(row+1, col);
		toggleSlot(row-1, col);
		toggleSlot(row, col);
		toggleIfInBounds(row,col+1);
		toggleIfInBounds(row,col);
		toggleIfInBounds(row,col-1);
	}
	
	public void toggleSlot(int row, int col) {
		if(row >= 0 && row < game.length) {
			if(col > 0) {
				game[row][col - 1] = !game[row][col - 1];
			}
			if(col < game[row].length - 1) {
				game[row][col + 1] = !game[row][col + 1];
			}
		}
	}
	public void toggleIfInBounds(int row, int col) {
		if(row >= 0 && row < game.length && col >= 0 && col < game[row].length) {
			game[row][col] = !game[row][col];
		}
	}


	public boolean isToggleable(int row, int col) {
		if(row >= 0 )
	}
	
	public DavidBackend(DavidSupport frontend) {
		
	}
	
	
	public void main(String[] args) {
		generateMap();
	}

}
