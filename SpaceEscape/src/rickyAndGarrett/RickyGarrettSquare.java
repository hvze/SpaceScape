package rickyAndGarrett;

public class RickyGarrettSquare {

	private boolean revealed;
	private int numberOfBombsCloseby;
	private boolean isBomb;
	
	public RickyGarrettSquare() {
		revealed = false;
		numberOfBombsCloseby = 0;
		isBomb = false;
	}
	
	public boolean isRevealed() {
		return revealed;
	}

	public void setRevealed(boolean revealed) {
		this.revealed = revealed;
	}

	public int getNumberOfBombsCloseby() {
		return numberOfBombsCloseby;
	}

	public void setNumberOfBombsCloseby(int numberOfBombsCloseby) {
		this.numberOfBombsCloseby = numberOfBombsCloseby;
	}

	public boolean isBomb() {
		return isBomb;
	}

	public void setBomb(boolean isBomb) {
		this.isBomb = isBomb;
	}
}
