package tp_canard;

public class CompteurDeCouacs implements Cancaneur{
	
	private Cancaneur cancaneur;
	private static int nombreDeCouacs;
	
	public CompteurDeCouacs(Cancaneur cancaneur) {
		this.cancaneur = cancaneur;
	}

	@Override
	public void cancaner() {
		cancaneur.cancaner();
		nombreDeCouacs++;
	}

	public static int getNombreDeCouacs() {
		return nombreDeCouacs;
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
