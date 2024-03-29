package version1.weather;

import java.util.*;

public class WeatherData implements Sujet {
	private List<Observateur> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<>();
	}
	
	public void measurementsChanged() {
		notifyObservateurs();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}

	@Override
	public void registerObservateur(Observateur o) {
		observers.add(o);
	}

	@Override
	public void removeObservateur(Observateur o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservateurs() {
		for(Observateur o : observers) {
			o.actualiserMesures(temperature, humidity, pressure);
		}
	}

}
