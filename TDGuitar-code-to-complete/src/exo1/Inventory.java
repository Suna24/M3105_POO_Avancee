package exo1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<>();
	}

	public void addGuitar(String serialNumber, double price, String builder, String model, String type, String backWood,
			String topWood) {

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

	public Guitar search(Guitar searchGuitar) {
		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = i.next();

			// Ignore serial number since that's unique
			// Ignore price since that's unique

			// Builder
			String builder = searchGuitar.getBuilder();
			if ((builder != null) && (!builder.equals("")) && (!builder.equals(guitar.getBuilder())))
				continue;

			// Model
			String model = searchGuitar.getModel();
			if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel())))
				continue;

			// Type
			String type = searchGuitar.getType();
			if ((type != null) && (!type.equals("")) && (!type.equals(guitar.getType())))
				continue;

			// BackWood
			String backWood = searchGuitar.getBackWood();
			if ((backWood != null) && (!backWood.equals("")) && (!backWood.equals(guitar.getBackWood())))
				continue;

			// TopWood
			String topWood = searchGuitar.getTopWood();
			if ((topWood != null) && (!topWood.equals("")) && (!topWood.equals(guitar.getTopWood())))

				return guitar;
		}
		return null;
	}

}
