package exo5;

public class MandolinSpec extends InstrumentSpec{

	//Attribute
	Style style;
	
	//Constructor
	public MandolinSpec(Builder builder, String model, Style style, Type type, Wood backWood, Wood topWood) {
		super(builder, model, type, backWood, topWood);
		this.style = style;
	}

	//Getters && Setters
	public Style getStyle() {
		return style;
	}

}
