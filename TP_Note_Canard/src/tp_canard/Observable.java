package tp_canard;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Observable implements CouacObservable{
	
	private List<Observateur> observateurs = new ArrayList<>();
	private CouacObservable canard;
	
	public Observable(CouacObservable canard) {
		this.canard = canard;
	}

	@Override
	public void enregistrerObservateur(Observateur observateur) {
		observateurs.add(observateur);
	}

	@Override
	public void notifierObservateurs() {
		Iterator<Observateur> iterateur = observateurs.iterator();
		
		while(iterateur.hasNext()) {
			iterateur.next().actualiser(canard);
		}
	}
	

}
