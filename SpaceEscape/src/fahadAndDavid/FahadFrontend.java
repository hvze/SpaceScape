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

	        backend.changeValues();

	        analyzeBoard();//this frontend method might be where the frontend partner 
	            //programs everything that would earn most credit for 2D arrays

	        updateBoard();
	    }
	        printGameOverMessage(backend.victorious());
	}

	public void updateBoard() {
		// TODO Auto-generated method stub
		
	}

	public void respondToInput(String input) {
		// TODO Auto-generated method stub
		
	}

	public void analyzeBoard() {
		// TODO Auto-generated method stub
		
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
		if(backend.validInput()) {
			GameBoard[row][col] = toggleContent(row,col);
		}
	}

	private Object toggleContent(int row, int col) {
		// TODO Auto-generated method stub
		return null;
	}
}