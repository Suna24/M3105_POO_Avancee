package dicegame;

import java.util.Random;

public abstract class Dice {

	private int numFaces;
	private int topValue;
	private Random random;

	public Dice(int numFaces) {
		super();
		this.numFaces = numFaces;
		roll();
		random = new Random();
	}
	
	public int getTopValue() {
		return topValue;
	}

	public int getNumFaces() {
		return numFaces;
	}
	
	public void roll() {
		topValue = random.nextInt(numFaces) + 1;
	}
	
}
