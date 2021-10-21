package comportement.patron2methode;

public abstract class BoissonCafeinee {

	public final void suivreRecette() {
		faireBouillirEau();
		preparer();
		verserDansTasse();
		ajouterSupplements();
	}

	public abstract void preparer();

	public abstract void ajouterSupplements();

	private void faireBouillirEau() {
		System.out.println("Portage de l'eau à ébullition");
	}

	private void verserDansTasse() {
		System.out.println("Remplissage de la tasse");
	}
}
