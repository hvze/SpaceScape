package fahadAndDavid;

public interface FahadSupport {

	public void generateGame();
	
	public void toggleLights(int row, int col);
	
	public boolean isVictorious();

	public String getValidUserInput();
	
	public boolean validInput();

	public boolean[][] getGameBoard();
}
