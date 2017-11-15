package rickyAndGarrett;

import java.util.Scanner;

public class GarrettBackEnd implements RickySupport{
	
	private GarrettSupport frontend;
	private RickyGarrettPlot[][] plots;

	private static int numberOfBombs;
	private boolean isPlaying;
	public static Scanner in;
	
	public GarrettBackEnd(GarrettSupport frontend){
		 this.frontend = frontend;
		 plots = new RickyGarrettPlot[6][6];
		 numberOfBombs = 5;
		 isPlaying = false;
	}
	
	public RickyGarrettPlot[][] getPlots() {
		return plots;
	}

	@Override
	public boolean stillPlaying() {
		return isPlaying;
	}

	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}

	@Override
	public String getValidUserInput() {
		String input = in.nextLine();
		String a = input.substring(0, 1);
		String b = input.substring(1, 2);
		String c = input.substring(2, 3);
		if(!b.equals(",") || input.length() != 3) {
			return "Please type in this format: x,y";
		}else {
			if((a.compareTo("5") <= 0 && a.compareTo("0") >= 0) &&
					(c.compareTo("5") <= 0 && c.compareTo("0") >= 0)) {
				return input;
			}else {
				return "Please type in this format: x,y";
			}
		}
	}

	@Override
	public boolean victorious() {
		// TODO Auto-generated method stub
		return false;
	}

}