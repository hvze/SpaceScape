package fahadAndDavid;

import caveExplorer.CaveRoom;

public class FahadRoom extends CaveRoom {

	private String defaultContents = "D";

	public FahadRoom(String description) {
		super(description);
	}

	public void setDefaultContents(String defaultContents) {
		this.defaultContents  = defaultContents;
	}

}
