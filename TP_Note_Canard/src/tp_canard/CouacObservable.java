package tp_canard;

public interface CouacObservable {
	
	public void enregistrerObservateur(Observateur observateur);
	
	public void notifierObservateurs();

}
