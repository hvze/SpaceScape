package fahadAndDavid;

public class FahadFrontend implements DavidSupport{
	
	private FahadSupport backend;
	
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
	        backend.toggleLights();
	        
	        updateBoard();
	    }
	        printGameOverMessage(backend.victorious());
	}

	public void updateBoard() {
		// TODO Auto-generated method stub
		
	}

	public void respondToInput(String input) {
		if(backend.validInput()) {
			
		}
	}

	public void printGameOverMessage(String victorious) {
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
			GameBoard[row][col] = toggleContent(row,col);
			if(row > 0 && row+1 < GameBoard.length) {
				GameBoard[row-1][col] = toggleContent(row-1,col);
				GameBoard[row+1][col] = toggleContent(row+1,col);
			}
			if(col > 0 && col+1 < GameBoard[row].length) {
				GameBoard[row][col-1] = toggleContent(row,col-1);
				GameBoard[row][col+1] = toggleContent(row,col+1);
			}
	}

	private void toggleContent(int row, int col) {
		if(GameBoard[row][col] == "[]") {
			GameBoard[row][col] = "*";
		}
		if(GameBoard[row][col] == "*") {
			GameBoard[row][col] = "[]";
		}
	}
}