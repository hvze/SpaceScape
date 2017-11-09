package rickyAndGarrett;

import caveExplorer.CaveExplorer;
import caveExplorer.NPC;
import caveExplorer.NPCRoom;

public class RickyRoom extends NPCRoom {
	
	private NPC presentNPC;

	public RickyRoom(String description) {
		super(description);
	}
	
	public void performAction(int direction) {
		if(direction == 4) {
				interact();
			}
			CaveExplorer.print("There's no one here who is active to talk to you... You're gonna have to wait until the NPC comes back from lunch");
		}

	
	public void interact() {
		CaveExplorer.print("Welcome to the Break Room. Here, You will be entered for a quick break from your journey");
		String s = CaveExplorer.in.nextLine();
		while(!(s.equalsIgnoreCase("leave"))){
			CaveExplorer.print("I am waiting for an answer...(psst! Type 'leave' in order to leave this room.)");
			s = CaveExplorer.in.nextLine();
		}
		CaveExplorer.print("Well, It was nice meeting you. Good Luck on your journey and safe travels.");
	}
	
	public String getContents() {
		return "B";
	}
	
}
/*
	CaveRoom customRoom = new NPCRoom("Room");
	CaveExplorer.caves[2][3] = customRoom;
*/	
