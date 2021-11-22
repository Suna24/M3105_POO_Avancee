package tp_canard;

public class SimulateurDeCanards {

	public static void main(String[] args) {
		SimulateurDeCanards simulateur = new SimulateurDeCanards();
		FabriqueDeCanardsAbstraite fabriqueDeCanards = new FabriqueDeComptage();
		simulateur.simuler(fabriqueDeCanards);
	}

	public void simuler(FabriqueDeCanardsAbstraite fabriqueDeCanard) {
		
		Cancaneur colvert = fabriqueDeCanard.creerColvert();
		Cancaneur mandarin = fabriqueDeCanard.creerMandarin();
		Cancaneur appelant = fabriqueDeCanard.creerAppelant();
		Cancaneur canardEnPlastique = fabriqueDeCanard.creerCanardEnPlastique();
		Cancaneur canardOie = new AdaptateurDOie(new Oie());
		
		System.out.println("\nSimulateur de canards\n");
		simuler(colvert);
		simuler(mandarin);
		simuler(appelant);
		simuler(canardEnPlastique);
		simuler(canardOie);
		
		System.out.println("Nous avons compté " + CompteurDeCouacs.getNombreDeCouacs() + " couacs\n");
		
		
		Troupe troupeDeCanards = new Troupe();
		troupeDeCanards.add(mandarin);
		troupeDeCanards.add(appelant);
		
		Troupe troupeDeColverts = new Troupe();
		Cancaneur colvert2 = new Colvert();
		Cancaneur colvert3 = new Colvert();
		troupeDeColverts.add(colvert2);
		troupeDeColverts.add(colvert3);
		
		troupeDeCanards.add(troupeDeColverts);
		System.out.println("\nSimulateur de canards : Toute la troupe");
		simuler(troupeDeCanards);
		
		System.out.println("\nSimulateur de canards : Troupe de colverts");
		simuler(troupeDeColverts);
		
		System.out.println("\n\n\n");
		
		FabriqueDeCanardsAbstraite fabriqueDeCanardsAbstraite = new FabriqueDeCanard();
		Cancaneur colvertBis = fabriqueDeCanard.creerColvert();
		
		Cancanologue leCancanologue = new Cancanologue();
		
		colvert.enregistrerObservateur(leCancanologue);
		simuler(colvertBis);
	}
	
	public void simuler(Cancaneur canard) {
		canard.cancaner();
	}

}
