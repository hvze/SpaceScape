package rickyAndGarrett;

public class RickyFrontEnd implements GarrettSupport{
	
	private RickySupport backend;
	
	public static final void main(String[] args) {
		RickyFrontEnd demo = new RickyFrontEnd();
		demo.start();
	}

	public void start() {
		System.out.println("Press m for the menu.");
	}
	
	public void play() {
		  while(backend.stillPlaying()){
		        displayBoard();
		        String input = backend.getValidUserInput();
		        respondToInput(input);
		        autoReveal();
		  }
		        printGameOverMessage(backend.victorious());
	}

	private void printGameOverMessage(boolean victorious) {
		if(victorious) {
			System.out.println("You is win!");
		}else {
			System.out.println("You is lose!");
		}
	}

	public void autoReveal() {
		
	}

	public void respondToInput(String input) {
		
	}

	public void displayBoard() {
		
	}

	public RickyFrontEnd(){
		 backend = new GarrettBackEnd(this);
	}
}