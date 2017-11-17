package fahadAndDavid;

import java.util.Scanner;

public class FahadFrontend implements DavidSupport{

	private FahadSupport backend;
	private int row;
	private int col;
	private String[][] visuals = new String[5][5];

	public static void main(String[] args) {
		FahadFrontend demo = new FahadFrontend();
		demo.play();
	}

	public FahadFrontend() {
		backend = new DavidBackend(this);
	}

	public void play(){
		backend.generateGame();
		while(!backend.isVictorious()){
			displayBoard();
			String input = DavidBackend.in.nextLine();
			String userInput = backend.getValidUserInput(input);
			respondToInput(userInput);

			updateBoard();
		}
		printGameOverMessage();
	}

	public void updateBoard() {
		displayBoard();
	}

	public void respondToInput(String input) {
		if(input.length() == 3) {
			row = Integer.parseInt(input.substring(0,1));
			col = Integer.parseInt(input.substring(2));
			setLights(row,col);
		}
		else {
			System.out.println("Please use this format for your input; x,y");
		}
	}

	public void printGameOverMessage() {
		System.out.println("GG. You've done well");
	}

	public void displayBoard() {
		boolean[][] gameBoard = backend.getGameBoard();
		for(int row = 0; row < gameBoard.length;row++) {
			for(int col = 0; col < gameBoard[row].length;col++) {
				if(gameBoard[row][col] == false) {
					visuals[row][col] = "*";
				}
				if(gameBoard[row][col] == true) {
					visuals[row][col] = "[]";
				}
			}
		}
	}

	public void setLights(int row, int col) {
		backend.toggleLights(row, col);
	}
}