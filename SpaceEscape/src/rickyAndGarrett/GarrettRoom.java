package rickyAndGarrett;

import caveExplorer.CaveExplorer;
import caveExplorer.CaveRoom;

public class GarrettRoom extends CaveRoom {
	
	private String[] trivia = {"Taco Bell was created in 1962 - nearly 55 years ago!","In Japan, letting a sumo wrestler make your baby cry is considered good luck.",
			"Between 1900 and 1920, Tug of War was an Olympic event.","The Code of Hammurabi decreed that bartenders who watered down beer would be executed."};

	public GarrettRoom(String description) {
		super(description);
	}
	
	public String validKeys() {
		return "wdsae";
	}
	
	public void performAction(int direction) {
		if(direction == 4) { 
			interact();
		}else {
			CaveExplorer.print("That key does nothing.");
		}
	}

	public void interact() {
		CaveExplorer.print("Welcome to the Trivia Room. Enter 'trivia' for a random fact");
		String s = CaveExplorer.in.nextLine();
		while(!s.equalsIgnoreCase("trivia")) {
			CaveExplorer.print("Please type 'trivia' for knowledge and maybe a chuckle.");
			s = CaveExplorer.in.nextLine();
		}
		CaveExplorer.print(trivia[(int)(Math.random() * trivia.length)]);
	}
	

}
