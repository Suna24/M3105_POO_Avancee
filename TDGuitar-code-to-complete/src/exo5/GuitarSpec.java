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

	
	public boolean matches(GuitarSpec searchGuitar) {

		if (searchGuitar.getBuilder() != null && !searchGuitar.getBuilder().equals(getBuilder())) {
			return false;
		}

		if (searchGuitar.getModel() != null && searchGuitar.getModel() != "" && !searchGuitar.getModel().equalsIgnoreCase(getModel())) {
			return false;
		}

		if (searchGuitar.getType() != null && !searchGuitar.getType().equals(getType())) {
			return false;
		}

		if (searchGuitar.getNumStrings() != NO_PREF_NUM_STRINGS && searchGuitar.getNumStrings() != getNumStrings()) {
			return false;
		}

		if (searchGuitar.getTopWood() != null && !searchGuitar.getTopWood().equals(getTopWood())) {
			return false;
		}

		if (searchGuitar.getBackWood() != null  && !searchGuitar.getBackWood().equals(getBackWood())) {
			return false;
		}

		return true;
	}

}
