package fahadAndDavid;

public class FahadFrontend implements DavidSupport{
	
	private FahadSupport backend;
	
	public static void main(String[] args) {
		FahadFrontend demo = new FahadFrontend();
		demo.play();
	}
	
	private void play() {public void play(){
	    while(backend.stillPlaying()){
	        displayBoard();
	        displayScore();
	        String input = backend.getValidUserInput();
	        respondToInput(input);

	        backend.computerMove();//this backend method might be where the backend partner 
	            //programs everything that would earn most credit for 2D arrays

	        analyzeBoard();//this frontend method might be where the frontend partner 
	            //programs everything that would earn most credit for 2D arrays

	        updateScore();
	    }
	        printGameOverMessage(backend.victorious());
	}
		
	}

	private void displayScore() {
		// TODO Auto-generated method stub
		
	}

	private void displayBoard() {
		// TODO Auto-generated method stub
		
	}

	public FahadFrontend() {
		backend = new DavidBackend(this);
	}
}