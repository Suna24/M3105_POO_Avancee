package exo4;

public class GuitarSpec {

	public static final int NO_PREF_NUM_STRINGS = -1;
	
	// Attributes
	private Builder builder;
	private String model;
	private Type type;
	private int numStrings;
	private Wood backWood;
	private Wood topWood;

	// Constructors
	public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.numStrings = numStrings;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	// Gettres and Setters
	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

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
