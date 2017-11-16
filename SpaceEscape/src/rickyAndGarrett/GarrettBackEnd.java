package rickyAndGarrett;

import java.util.Scanner;

public class GarrettBackEnd implements RickySupport{
	
	private GarrettSupport frontend;
	private RickyGarrettSquare[][] squares;

	private static int numberOfBombs;
	private boolean isPlaying;
	public static Scanner in;
	
	public GarrettBackEnd(GarrettSupport frontend){
		 this.frontend = frontend;
		 squares = new RickyGarrettSquare[6][6];
		 numberOfBombs = 5;
		 isPlaying = false;
		 createBoard();
	}
	
	public void createBoard() {
		for(int row = 0; row < squares.length; row++){
			for(int col = 0; col < squares[row].length; col++){
				squares[row][col] = new RickyGarrettSquare(row, col);
			}
		}
		randomizeBombs();
	}

	public void randomizeBombs() {
		int count = 0;
		while(count < numberOfBombs){
			int minesweeperRow = (int)(Math.random() * squares.length);
			int minesweeperCol = (int)(Math.random() * squares[minesweeperRow].length);
			if(!squares[minesweeperRow][minesweeperCol].isBomb()) {
				squares[minesweeperRow][minesweeperCol].setBomb(true);
				count++;
			}
		}
	}

	public RickyGarrettSquare[][] getSquares() {
		return squares;
	}

	@Override
	public boolean stillPlaying() {
		return isPlaying;
	}

	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}

	@Override
	public String getValidUserInput() {
		String input = in.nextLine();
		String a = input.substring(0, 1);
		String b = input.substring(1, 2);
		String c = input.substring(2, 3);
		if(!b.equals(",") || input.length() != 3) {
			return "Please type in this format: x,y";
		}else {
			if((a.compareTo("5") <= 0 && a.compareTo("0") >= 0) &&
					(c.compareTo("5") <= 0 && c.compareTo("0") >= 0)) {
				return input;
			}else {
				return "Please type in this format: x,y";
			}
		}
	}

	@Override
	public boolean victorious() {
		// TODO Auto-generated method stub
		return false;
	}

}