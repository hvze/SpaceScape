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
	private int indexOcc = 0;
	private Object[] occupiedSeg;
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
	
	public int setOrientation() {
	if(occupiedSeg[indexOcc-2].x-occupiedSeg[indexOcc-1].x<0)		{
		if(occupiedSeg[indexOcc-1].x-occupiedSeg[indexOcc].x<0)
		return 0;
		if(occupiedSeg[indexOcc-1].x-occupiedSeg[indexOcc].x>0)
		return 1;	
		if(occupiedSeg[indexOcc-1].y-occupiedSeg[indexOcc].x<0)
		return 2;
		if(occupiedSeg[indexOcc-1].y-occupiedSeg[indexOcc].x>0)
		return 3;	
	}
	
	else if(occupiedSeg[indexOcc-2].x-occupiedSeg[indexOcc-1].x>0) {
		if(occupiedSeg[indexOcc-1].x-occupiedSeg[indexOcc].x<0)
		return 4;
		if(occupiedSeg[indexOcc-1].x-occupiedSeg[indexOcc].x>0)
		return 5;	
		if(occupiedSeg[indexOcc-1].y-occupiedSeg[indexOcc].x<0)
		return 6;
		if(occupiedSeg[indexOcc-1].y-occupiedSeg[indexOcc].x>0)
		return 7; 
	}
		
	else if(occupiedSeg[indexOcc-2].y-occupiedSeg[indexOcc-1].y<0)		{\
		if(occupiedSeg[indexOcc-1].x-occupiedSeg[indexOcc].x<0)
		return 8;
		if(occupiedSeg[indexOcc-1].x-occupiedSeg[indexOcc].x>0)
		return 9;	
		if(occupiedSeg[indexOcc-1].y-occupiedSeg[indexOcc].x<0)
		return 10;
		if(occupiedSeg[indexOcc-1].y-occupiedSeg[indexOcc].x>0)
		return 11;
	}
	else if(occupiedSeg[indexOcc-2].y-occupiedSeg[indexOcc-1].y>0) {
		if(occupiedSeg[indexOcc-1].x-occupiedSeg[indexOcc].x<0)
		return 12;
		if(occupiedSeg[indexOcc-1].x-occupiedSeg[indexOcc].x>0)
		return 13;	
		if(occupiedSeg[indexOcc-1].y-occupiedSeg[indexOcc].x<0)
		return 14;
		if(occupiedSeg[indexOcc-1].y-occupiedSeg[indexOcc].x>0)
		return 15;
	}
	
		}
			
		
	
	public boolean isValid(int  x ,int  y) {
//yonathan setting x and y is on your end
				if(Flow[x][y].occupied == false ) {
					occupiedSeg[indexOcc] = Flow[x][y];
					indexOcc++;
					setOrientation();
					return true;
				}
					
				return false;
	
	}

}
