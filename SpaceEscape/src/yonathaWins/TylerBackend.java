package yonathaWins;

public class TylerBackend implements YonathanSupport {

	//go to yonathan backend, make 2d array, define proportions
	//
	public boolean isPlaying;
	private TylerSupport frontend;
	private int lines;
	private int turns;
	private int x;
	private int y;
	private int indexOcc = 0;
	private Object[] occupiedSeg;
	private String orientation = "0123";
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
		return 0;//straight line 
		if(occupiedSeg[indexOcc-1].y-occupiedSeg[indexOcc].y<0)
		return 1;//corner up from left
		if(occupiedSeg[indexOcc-1].y-occupiedSeg[indexOcc].y>0)
		return 2;//corner down from left	
	}
	
	else if(occupiedSeg[indexOcc-2].x-occupiedSeg[indexOcc-1].x>0) {
		if(occupiedSeg[indexOcc-1].x-occupiedSeg[indexOcc].x>0)
		return 0;//straight line	
		if(occupiedSeg[indexOcc-1].y-occupiedSeg[indexOcc].y<0)
		return 3;//corner up from right
		if(occupiedSeg[indexOcc-1].y-occupiedSeg[indexOcc].y>0)
		return 4;//corner down from right
	}
		
	else if(occupiedSeg[indexOcc-2].y-occupiedSeg[indexOcc-1].y<0)		{
		if(occupiedSeg[indexOcc-1].x-occupiedSeg[indexOcc].x<0)
		return 4;//corner down from right
		if(occupiedSeg[indexOcc-1].x-occupiedSeg[indexOcc].x>0)
		return 2;//corner down from left	
		if(occupiedSeg[indexOcc-1].y-occupiedSeg[indexOcc].y<0)
		return 5;//vertical line
	}
	else if(occupiedSeg[indexOcc-2].y-occupiedSeg[indexOcc-1].y>0) {
		if(occupiedSeg[indexOcc-1].x-occupiedSeg[indexOcc].x<0)
		return 3;//corner up from right
		if(occupiedSeg[indexOcc-1].x-occupiedSeg[indexOcc].x>0)
		return 1;//corner up from left	
		if(occupiedSeg[indexOcc-1].y-occupiedSeg[indexOcc].y>0)
		return 5;//vertical line
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

	@Override
	public String getValidUserInput() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isPlaying() {
		// TODO Auto-generated method stub
		return false;
	}

}
