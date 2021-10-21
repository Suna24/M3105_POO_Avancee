package comportement.patron2methode;

public class TestBoisson {

	public static void main(String[] args) {
	
		BoissonCafeinee boisson = new The();
		BoissonCafeinee boisson1 = new Coffee();
		
		boisson.suivreRecette();
		
		System.out.println();
		
		boisson1.suivreRecette();
	}

}

//Questions

// La méthode socle est suivreRecette(), elle est finale car non modifiable

//Ce sont les méthodes qui sont présentes dans la méthode socle qui peuvent 
//être redéfinies. Il n'y a pas de sens à les déclarer privées
//les méthodes par defaut peuvent etre privees
