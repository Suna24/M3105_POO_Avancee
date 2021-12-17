package tp_canard;

public class SimulateurDeCanards {

	public static void main(String[] args) {
		//Partie 1
		SimulateurDeCanards simulateur = new SimulateurDeCanards();
		FabriqueDeCanardsAbstraite fabriqueDeCanards = new FabriqueDeComptage();
		simulateur.simuler(fabriqueDeCanards);
	}

	public void simuler(FabriqueDeCanardsAbstraite fabriqueDeCanard) {
		
		//Partie 1
		/*Cancaneur colvert = new Colvert();
		Cancaneur mandarin = new Mandarin();
		Cancaneur appelant = new Appelant();
		Cancaneur canardEnPlastique = new CanardEnPlastique();
		System.out.println("\nSimulateur de canards");
		simuler(colvert);
		simuler(mandarin);
		simuler(appelant);
		simuler(canardEnPlastique);*/
		
		//Partie 2
		/*Cancaneur canardOie = new AdaptateurDOie(new Oie());
		System.out.println("\nSimulateur de canards");
		simuler(canardOie);*/

		// Partie 3
		/*Cancaneur colvert = new CompteurDeCouacs(new Colvert());
		simuler(colvert);
		System.out.println("Nous avons compté " + CompteurDeCouacs.getNombreDeCouacs() + " couacs\n");*/
		
		//Partie 4
		/*Cancaneur colvert = fabriqueDeCanard.creerColvert();
		Cancaneur mandarin = fabriqueDeCanard.creerMandarin();
		simuler(colvert);
		simuler(mandarin);

		// Partie 5
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
		simuler(troupeDeColverts);*/

		// Partie 6
		/*FabriqueDeCanardsAbstraite fabriqueDeCanardsAbstraite = new FabriqueDeCanard();
		Cancaneur colvert = fabriqueDeCanardsAbstraite.creerColvert();
		
		Cancanologue leCancanologue = new Cancanologue();

		colvert.enregistrerObservateur(leCancanologue);
		simuler(colvert);*/

		// Partie 7
		/*FabriqueDeCanardsAbstraite fabriqueDeCanards = new FabriqueDeComptage();
		Cancaneur colvert = fabriqueDeCanard.creerColvert();
		Cancaneur mandarin = fabriqueDeCanard.creerMandarin();
		Cancaneur canardOie = new AdaptateurDOie(new Oie());

		Troupe sousTroupe = new Troupe();
		fabriqueDeCanard = new FabriqueDeCanard();
		sousTroupe.add(fabriqueDeCanard.creerColvert());
		sousTroupe.add(fabriqueDeCanard.creerMandarin());
		sousTroupe.add(fabriqueDeCanard.creerColvert());

		Troupe maTroupe = new Troupe();
		maTroupe.add(colvert);
		maTroupe.add(mandarin);
		maTroupe.add(canardOie);
		maTroupe.add(sousTroupe);

		Visitor unVisiteur = new VisitorCompteurNoeudFeuile();
		maTroupe.accept(unVisiteur);

		System.out.println("Nb de noeuds = " + ((VisitorCompteurNoeudFeuile) unVisiteur).getNbNoeud());
		System.out.println("Nb de feuilles = " + ((VisitorCompteurNoeudFeuile) unVisiteur).getNbFeuilles());*/
	}

	public void simuler(Cancaneur canard) {
		canard.cancaner();
	}

}
