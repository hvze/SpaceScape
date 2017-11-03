package yonathaWins;

import caveExplorer.CaveExplorer;
import caveExplorer.CaveRoom;

public class TylerCave extends CaveRoom {
 
	public TylerCave(String description) {
		super(description);
		boolean isJeff = false;
	}

	public String validKeys() {
		return "wdsal";
	}
	
	public void printAllowedEntry() {
		CaveExplorer.print("You can only enter 'w', 'a', 's', or 'd' to move or"
				+ "if you type l you can talk");}
	public void performAction(int direction) {
		CaveExplorer.print("Hello, tell me your name");
		String userString = CaveExplorer.in.nextLine();
		if(userString.equalsIgnoreCase("jeff") || userString.equalsIgnoreCase("doge") ) {
			CaveExplorer.print("true");
		}
	}
	


}
