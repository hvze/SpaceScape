package yonathaWins;

import caveExplorer.CaveRoom;

public class YonathanFrontEnd implements TylerSupport {
	//make 2d array populate with tylerfiller
	//randomly populate with goalfiller
	//before a square is populated, check if it's already populated
	//randomly check when a thing is populate whether or not it's a starter and if it's a starter than make an end goal randomly around the map
	private String identifier;
	
	//match order to tylers indexs in setorientation 
	public String orientation[]= {"___\n|"+identifier+" \n|  ","___\n "+identifier
			};
	public static CaveRoom[][] flowRoom;
	private YonathanSupport frontend;
	private int linesComplete;
	public YonathanFrontEnd() {
		frontend = new TylerBackend(this);
		linesComplete = 0;
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