package yonathaWins;

import caveExplorer.CaveRoom;

public class YonathanFrontEnd implements TylerSupport {
	//make 2d array populate with tylerfiller
	//randomly populate with goalfiller
	//before a square is populated, check if it's already populated
	//randomly check when a thing is populate whether or not it's a starter and if it's a starter than make an end goal randomly around the map
	private String identifier;
	// ask knockles about keyboard and mouse imputs from a computer
	//match order to tylers indexs in setorientation 
	//convince ricky to do final room 
	// ask about displaying array possible problems from using caveroom to make the array
	//ask about turning off the minigame
	public String orientation[]= {"___\n|"+identifier+" \n|  ","___\n "+identifier
			};
	private CaveRoom[][] flowRoom;
	private YonathanSupport frontend;
	private int linesComplete;
	public YonathanFrontEnd() {
		frontend = new TylerBackend(this);
		flowRoom = new CaveRoom[3][3];
		linesComplete = 0;
		displayFlow();
	}

	private void displayFlow() {
		for(int row = 0; row < flowRoom.length; row++){
			for(int col = 0; col < flowRoom[row].length; col++){
				flowRoom[row][col] = new CaveRoom(row,col);
		
	}

	public static void main(String[] args) {
		YonathanFrontEnd demo = new YonathanFrontEnd();
		demo.play();

	}
	

	private void play() {
		while(TylerBackend.isPlaying) {
				
			
		
		}
		
	}
}