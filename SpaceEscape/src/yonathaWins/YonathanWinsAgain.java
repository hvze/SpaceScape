package yonathaWins;

import caveExplorer.CaveRoom;

public class YonathanWinsAgain extends CaveRoom {

	public YonathanWinsAgain(String description) {
		super(description);
		
	}

	public void preformAction() {
	
	}
	public void performAction(int direction) {
		System.out.println("That key does nothing.");
	}
	public void printAllowedEntry() {
		System.out.println("hello");
	}
	public String validKeys() {
		return "wdsa";
	}
}
