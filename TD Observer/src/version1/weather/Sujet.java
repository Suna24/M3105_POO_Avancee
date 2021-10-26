package version1.weather;

public interface Sujet {
	
	public void registerObservateur(Observateur o);
	
	public void removeObservateur(Observateur o);
	
	public void notifyObservateurs();

}
