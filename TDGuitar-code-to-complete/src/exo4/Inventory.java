package exo4;

import java.util.*;

public class Inventory {
	
	//Attributes
	private List<Guitar> guitars;

	//Constructor
	public Inventory() {
		guitars = new LinkedList<>();
	}

	//Methods
	public void addGuitar(String serialNumber, double price, GuitarSpec spec) {

		guitars.add(new Guitar(serialNumber, price, spec));
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

	public List<Guitar> search(GuitarSpec searchGuitar) {

		List<Guitar> matchingGuitars = new ArrayList<>();

		for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = i.next();
			
			if(guitar.getSpec().matches(searchGuitar)) {
				matchingGuitars.add(guitar);
			}
			
		}
		
		return matchingGuitars;
	}

}
