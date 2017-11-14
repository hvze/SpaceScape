package rickyAndGarrett;

public class GarrettBackEnd implements RickySupport{
	
	private GarrettSupport frontend;
	private RickyGarrettPlot[][] plots;
	private static int numberOfBombs;
	
	public GarrettBackEnd(GarrettSupport frontend){
		 this.frontend = frontend;
		 plots = new RickyGarrettPlot[9][9];
		 numberOfBombs = 5;
	}

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		
	}

}
//