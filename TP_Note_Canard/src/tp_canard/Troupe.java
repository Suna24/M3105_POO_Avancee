package tp_canard;

import java.util.ArrayList;
import java.util.List;

public class Troupe implements Cancaneur{
	
	private List<Cancaneur> lesCancaneursDeLaTroupe = new ArrayList<>();
	
	public void add(Cancaneur c) {
		lesCancaneursDeLaTroupe.add(c);
	}

	@Override
	public void cancaner() {
		
		for(Cancaneur cancaneur : lesCancaneursDeLaTroupe) {
			cancaneur.cancaner();
		}
		
	}

	@Override
	public void enregistrerObservateur(Observateur observateur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifierObservateurs() {
		// TODO Auto-generated method stub
		
	}

}
