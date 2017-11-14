package yonathaWins;

public class TylerBackend implements YonathanSupport {

	//go to yonathan backend, make 2d array, define proportions
	//
	public static boolean isPlaying;
	private TylerSupport frontend;
	private int lines;
	private int turns;
	private int x;
	private int y;
	private String oreintation = "0123";
	String validKeys = "wasde";
	
	
	public TylerBackend(TylerSupport frontend) {
		this.frontend = frontend;
		lines = 3;
		turns = 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	private int checkConnections() {
	return 0;	
		
	}
	public void setOrientation() {
		
		
	}
	public boolean isValid() {
		for(int i = 0; i < 4; i++) {
			if(i==0) {
				if(x+1 == )
			}
			
			if(i==1) {}
			
			if(i==2) {}				
			if(i==3) {}
		}		
	}
	public String getOrientation() {
		
	
	}
}
