package fahadAndDavid;

import caveExplorer.CaveExplorer;
import caveExplorer.CaveRoom;

public class FahadRoom extends CaveRoom {
	
	
	public FahadRoom(String description) {
		super(description);
	}
	
	//underneath replace
	public String validKeys() {
		return "wdsae";
	}
	
	public void printAllowedEntry() {
		CaveExplorer.print("You can only enter 'w', 'a', 's', or 'd' to move or"
				+ "you can type 'e' to interact.");
	}
	
	public void performAction(int direction) {
		if(direction == 4) {
				interact();
		}
		else {
			CaveExplorer.print("That key does nothing.");
		}
	}

	public void interact() {
		CaveExplorer.print("You thought it was a random NPC, but it was I, Dio.");
		String s = CaveExplorer.in.nextLine();
		while(!s.equalsIgnoreCase("bye")) {
			CaveExplorer.print("Muda Muda");
			s = CaveExplorer.in.nextLine();
		}
		CaveExplorer.print("Well, that was fun. Later!");
	}
	
	public String getContents() {
		return "D";
	}

}
