package tp_canard;

public class Appelant implements Cancaneur{

	@Override
	public void cancaner() {
		System.out.println("Couincouin");
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
