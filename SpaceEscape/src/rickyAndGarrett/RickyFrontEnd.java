package rickyAndGarrett;

public class RickyFrontEnd implements GarrettSupport{
	
	private RickySupport backend;
	
	public static final void main(String[] args) {
		RickyFrontEnd demo = new RickyFrontEnd();
	}

	public RickyFrontEnd(){
		 backend = new GarrettBackEnd(this);
		 backend.doSomething();
	}
}
