package dicegame;

public class DiceGame implements IDiceGame{

	private Dice dice;
	private Input input;
	private IDisplay display;
	
	public DiceGame(Input input, IDisplay aDisplay, Dice aDice) {
		super();
		this.input = input;
		this.display = aDisplay;
		this.dice = aDice;
	}

	@Override
	public void start() {
		do {
			playOneRound();
		} while (input.readChar() == 'y');
	}

	public void playOneRound() {
		display.displayEntryText();
		int userChoice =input.readInt();
		int diceRollValue = getRandomDiceValue();
		display.displayDiceValue(diceRollValue);
		if (userChoice == diceRollValue)
			display.displaySuccessText();
		display.displayPlayAgainText();
	}

	public int getRandomDiceValue() {
		dice.roll();
		return dice.getTopValue();
	}

}
