package tp_canard;

public class VisitorCompteurNoeudFeuile implements Visitor{
	
	//Les compteurs
	public static int nbNoeud = 0;
	public static int nbFeuille = 0;
	
	//Getters
	public static int getNbNoeud() {
		return nbNoeud;
	}

	public static int getNbFeuilles() {
		return nbFeuille;
	}

	@Override
	public void visit(Troupe t) {
		nbNoeud++;
	}

	@Override
	public void visit(Colvert c) {
		nbFeuille++;
		
	}

	@Override
	public void visit(Mandarin c) {
		nbFeuille++;
	}

	@Override
	public void visit(Appelant c) {
		nbFeuille++;
	}

	@Override
	public void visit(CanardEnPlastique c) {
		nbFeuille++;
	}

	@Override
	public void visit(AdaptateurDOie c) {
		nbFeuille++;
	}

	@Override
	public void visit(CompteurDeCouacs c) {
		nbNoeud++;
	}

	@Override
	public void visit(Visitable c) {
		System.out.println("Classe pas encore gérée !");
	}
	
}
