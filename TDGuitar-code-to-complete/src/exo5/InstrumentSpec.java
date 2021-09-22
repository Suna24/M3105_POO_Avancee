package exo5;

public abstract class InstrumentSpec {

	// Attributes
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	
	//Constructor
	public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	// Getters && Setters
	public Builder getBuilder() {
		return builder;
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public void setBackWood(Wood backWood) {
		this.backWood = backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public void setTopWood(Wood topWood) {
		this.topWood = topWood;
	}

	public boolean matches(InstrumentSpec instrumentSpec) {

			if (instrumentSpec.getBuilder() != null && !instrumentSpec.getBuilder().equals(getBuilder())) {
				return false;
			}

			if (instrumentSpec.getModel() != null && instrumentSpec.getModel() != "" && !instrumentSpec.getModel().equalsIgnoreCase(getModel())) {
				return false;
			}

			if (instrumentSpec.getType() != null && !instrumentSpec.getType().equals(getType())) {
				return false;
			}

			if (instrumentSpec.getTopWood() != null && !instrumentSpec.getTopWood().equals(getTopWood())) {
				return false;
			}

			if (instrumentSpec.getBackWood() != null  && !instrumentSpec.getBackWood().equals(getBackWood())) {
				return false;
			}

			return true;
	}

}
