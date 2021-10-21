package comportement.commande;

public class TestTelecommande {

	public static void main(String[] args) {
		//Instancie l'invocateur
		TelecommandeSimple telecommande = new TelecommandeSimple();
		//Instancie le r�cepteur
		Lampe lampe = new Lampe();
		CommandeAllumerLampe lampeAllumee = new CommandeAllumerLampe(lampe);
		//On dit � la t�l�commande de faire la commande lampeAllumee
		telecommande.setCommande(lampeAllumee);
		telecommande.boutonPresse();
	}
}
