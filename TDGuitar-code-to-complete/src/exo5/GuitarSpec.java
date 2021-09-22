package exo5;

public class GuitarSpec extends InstrumentSpec{

	public static final int NO_PREF_NUM_STRINGS = -1;
	
	// Attributes
	private int numStrings;

	// Constructors
	public GuitarSpec(Builder builder, String model, int numStrings, Type type, Wood backWood, Wood topWood) {
		super(builder, model, type, backWood, topWood);
		this.numStrings = numStrings;
	}

	// Gettres and Setters
	public int getNumStrings() {
		return numStrings;
	}
	
	//Méthode matches
	public boolean matches(InstrumentSpec searchInstrument) {
		
		if(!super.matches(searchInstrument)) {
			return false;
		}
		
		if(!(searchInstrument instanceof GuitarSpec)) {
			return false;
		}
		
		if (((GuitarSpec) searchInstrument).getNumStrings() != NO_PREF_NUM_STRINGS && ((GuitarSpec) searchInstrument).getNumStrings() != getNumStrings()) {
			return false;
		}

		return true;
	}

}
