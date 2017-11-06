package fahadAndDavid;

import caveExplorer.CaveExplorer;
import caveExplorer.CaveRoom;

public class FahadRoom extends CaveRoom {
	
	public FahadRoom(String description) {
		super(description);
	}
	
	public String validKeys() {
		return "wdsae";
	}
	
	public void printAllowedEntry() {
		CaveExplorer.print("You can only enter 'w', 'a', 's', or 'd' to move or"
				+ "you can type 'e' to interact.");
	}
	
	public String getContents() {
			return "D";
	}

}
