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

// La m�thode socle est suivreRecette(), elle est finale car non modifiable

//Ce sont les m�thodes qui sont pr�sentes dans la m�thode socle qui peuvent 
//�tre red�finies. Il n'y a pas de sens � les d�clarer priv�es
//les m�thodes par defaut peuvent etre privees
