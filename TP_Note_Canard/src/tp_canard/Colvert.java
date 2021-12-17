package tp_canard;

public class Colvert implements Cancaneur{
	
	private Observable obs;
	
	public Colvert() {
		obs = new Observable(this);
	}

	@Override
	public void cancaner() {
		System.out.println("Coincoin");
		this.notifierObservateurs();
		
	}

	@Override
	public void enregistrerObservateur(Observateur observateur) {
		obs.enregistrerObservateur(observateur);
		
	}

	@Override
	public void notifierObservateurs() {
		obs.notifierObservateurs();
		
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}
