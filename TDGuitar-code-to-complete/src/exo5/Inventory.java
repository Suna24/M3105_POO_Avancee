package exo5;

import java.util.*;

public class Inventory {
	
	//Attributes
	private List<Instrument> instruments;

	//Constructor
	public Inventory() {
		instruments = new LinkedList<>();
	}

	//Methods
	public void addInstrument(Instrument instrument) {

		instruments.add(instrument);
	}

	public Instrument getInstrument(String serialNumber) {
		for (Iterator<Instrument> i = instruments.iterator(); i.hasNext();) {
			Instrument instrument = i.next();
			
			if (instrument.getSerialNumber() == serialNumber) {
				return instrument;
			}
		}
		return null;
	}

	public List<Instrument> search(InstrumentSpec instrumentSpec) {

		List<Instrument> matchingInstruments = new ArrayList<>();

		for (Iterator<Instrument> i = instruments.iterator(); i.hasNext();) {
			Instrument instrument = i.next();
			
			if(instrument.getInstrumentSpec().matches(instrumentSpec)) {
				matchingInstruments.add(instrument);
			}
			
		}
		
		return matchingInstruments;
	}

}
