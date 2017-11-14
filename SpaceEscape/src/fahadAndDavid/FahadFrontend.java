package fahadAndDavid;

public class FahadFrontend implements DavidSupport{
	
	private FahadSupport backend;
	
	public static void main(String[] args) {
		FahadFrontend demo = new FahadFrontend();
		demo.play();
	}
	
	private void play() {
		// TODO Auto-generated method stub
		
	}

	public FahadFrontend() {
		backend = new DavidBackend(this);
	}
}