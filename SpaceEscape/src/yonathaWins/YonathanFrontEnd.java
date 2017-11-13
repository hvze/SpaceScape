package yonathaWins;

public class YonathanFrontEnd implements TylerSupport {

	
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
		
		
	}

}
