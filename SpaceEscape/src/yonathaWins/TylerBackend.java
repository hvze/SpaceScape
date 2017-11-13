package yonathaWins;

public class TylerBackend implements YonathanSupport {

	
	private TylerSupport frontend;
	private int lines;
	private int turnsMax;
	
	public TylerBackend(TylerSupport frontend) {
		this.frontend = frontend;
		lines = 3;
		turnsMax = 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
