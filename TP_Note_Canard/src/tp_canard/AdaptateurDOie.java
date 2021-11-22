package tp_canard;

public class AdaptateurDOie implements Cancaneur{
	
	private Oie oie;
	
	public AdaptateurDOie(Oie oie) {
		this.oie = oie;
	}

	@Override
	public void cancaner() {
		oie.cacarder();
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
