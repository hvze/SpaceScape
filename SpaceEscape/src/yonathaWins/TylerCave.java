package yonathaWins;

import caveExplorer.CaveExplorer;
import caveExplorer.CaveRoom;
import caveExplorer.NPC;

public class TylerCave extends CaveRoom {
 


	public TylerCave(String description) {
		super(description);
		
	}
	public String validKeys() { 
		return "wdsal";
	}
	

	public void printAllowedEntry() {
		CaveExplorer.print("You can only enter 'w', 'a', 's', or 'd' to move or"
				+ "if you type l you can talk");}
	public void performAction(int direction) {
		if(direction == 4) {
				interact();
			}
		else {
			CaveExplorer.print("That key does nothing.");
		}
	}
		
	
	public void interact() {
		CaveExplorer.print("Hello, tell me your name");
		String userString = CaveExplorer.in.nextLine();
		if(userString.equalsIgnoreCase("jeff") || userString.equalsIgnoreCase("doge") ) {
			CaveExplorer.print("i like your name");}
		else {
			CaveExplorer.print("i don't like your name");
			}
		}
	}
 



