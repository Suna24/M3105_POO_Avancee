import dicegame.Dice;
import dicegame.DiceGame;
import dicegame.DiceWith8Faces;
import dicegame.IDiceGame;
import dicegame.IDisplay;
import dicegame.Input;
import dicegame.display.Display;
import dicegame.input.KeyboardInput;

public class DiceGameLauncher {

	public static void main(String[] args) {
		
		Dice aDiceWith8Faces = new DiceWith8Faces();
		Input input = new KeyboardInput();
		IDisplay display = new Display();
		
		IDiceGame game = new DiceGame(input, display, aDiceWith8Faces); 
		game.start();
	}

}
