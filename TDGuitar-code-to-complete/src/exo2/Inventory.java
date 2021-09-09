package exo2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<>();
	}

	public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {

		guitars.add(new Guitar(serialNumber, price, builder, model, type, backWood, topWood));
	}

	public Guitar getGuitar(String serialNumber) {
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = i.next();
			if (guitar.getSerialNumber() == serialNumber) {
				return guitar;
			}
		}
		return null;
	}

	public List search(Guitar searchGuitar) {
		
		List guitarMatch = new ArrayList<>();
		
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = i.next();

			// Ignore serial number since that's unique
			// Ignore price since that's unique

			// Builder
			Builder builder = searchGuitar.getBuilder();
			if ((builder != null) && (!builder.equals("")) && (!builder.equals(guitar.getBuilder())))
				continue;

			// Model
			String model = searchGuitar.getModel().toLowerCase();
			if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel().toLowerCase())))
				continue;

			// Type
			Type type = searchGuitar.getType();
			if ((type != null) && (!type.equals("")) && (!type.equals(guitar.getType())))
				continue;

			// BackWood
			Wood backWood = searchGuitar.getBackWood();
			if ((backWood != null) && (!backWood.equals("")) && (!backWood.equals(guitar.getBackWood())))
				continue;

			// TopWood
			Wood topWood = searchGuitar.getTopWood();
			if ((topWood != null) && (!topWood.equals("")) && (!topWood.equals(guitar.getTopWood())))

				guitarMatch.add(guitar);
		}
		return guitarMatch;
	}

}
