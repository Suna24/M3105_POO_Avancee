package comportement.commande;

public class CommandeAllumerLampe implements Commande {
	private Lampe lampe;

	public CommandeAllumerLampe(Lampe lampe) {
		this.lampe = lampe;
	}

	public void executer() {
		lampe.marche();
	}
}
