package tp_canard;

public class Mandarin implements Cancaneur{

	@Override
	public void cancaner() {
		System.out.println("Coincoin");
		
	}

	@Override
	public void enregistrerObservateur(Observateur observateur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifierObservateurs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}
	
}
