package fahadAndDavid;

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
		while(backend.stillPlaying()){
			displayBoard();
			displayScore();
			String input = backend.getValidUserInput();
			respondToInput(input);
			backend.toggleLights(row, col);

			updateBoard();
		}
		printGameOverMessage(backend.victorious());
	}

	public void updateBoard() {
		// TODO Auto-generated method stub

	}

	public void respondToInput(String input) {
		row = Integer.parseInt(input.substring(0,1));
		col = Integer.parseInt(input.substring(2));
	}

	public void printGameOverMessage(boolean b) {
		// TODO Auto-generated method stub

	}

	public void displayScore() {
		// TODO Auto-generated method stub

	}

	public void displayBoard() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setLights(int row, int col) {
		boolean[][] gameBoard = backend.getGameBoard();
		toggleContent(row,col);
		if(row > 0) {
			toggleContent(row-1,col);
		}
		if(row+1 < gameBoard.length) {
			toggleContent(row+1,col);
		}
		if(col >= 0) {
			toggleContent(row,col-1);
		}
		if(col+1 < gameBoard[row].length) {
			toggleContent(row,col+1);
		}
	}

	public void toggleContent(int row, int col) {
		boolean[][] gameBoard = backend.getGameBoard();
		if(gameBoard[row][col] == false) {
			visuals[row][col] = "*";
		}
		if(gameBoard[row][col] == true) {
			visuals[row][col] = "[]";
		}
		backend.toggleLights(row, col);
	}
}