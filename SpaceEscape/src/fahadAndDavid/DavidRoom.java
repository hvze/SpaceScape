package fahadAndDavid;

import caveExplorer.CaveExplorer;
import caveExplorer.CaveRoom;

public class DavidRoom extends CaveRoom {
	
	public DavidRoom(String description) {
		super(description);
	}

	//underneath replace
	public String validKeys() {
		return "wdsae";
	}
	
	public void printAllowedEntry() {
		CaveExplorer.print("You can only enter 'w', 'a', 's', or 'd' to move or" + "you can type 'e' to interact.");
	}

	public void performAction(int direction) {
		if(direction == 4) {
			interact();
		}else {
			CaveExplorer.print("That key does nothing.");
		}
	}
	
	public void interact() {
		CaveExplorer.print("You must answer the problem to pass! What is 1+1");
		String s = CaveExplorer.in.nextLine();
		while(!s.equalsIgnoreCase("2") || !s.equalsIgnoreCase("two")) {
			CaveExplorer.print("That's not the answer");
			s = CaveExplorer.in.nextLine();
		}
		CaveExplorer.print("You're not an idiot!");
	}
}
