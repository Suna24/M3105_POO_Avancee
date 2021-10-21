package structure.decorateur;

public class Usine {
	
	public static void main(String[] args) {
	
		Voiture astonMartin = new VoitureAvecClimatisation(new AstonMartin()); 
		astonMartin = new VoitureAvecParachute(astonMartin); 
		astonMartin = new VoitureAmphibie(astonMartin);
 
		System.out.println(String.format("Prix = %.2f", astonMartin.getPrix())); 
                // affiche "Prix = 1110,99â‚¬"
	}
}

//Questions
//Parachute, Amphibie, Climastisation --> Décorateurs Concrets
//Option --> Décirateur Abstrait
//Voiture --> Component
//AstonMartin --> ConcreteComponent

//Différence avec le patron composite
//La multiplicté 0 à * pour le composite alors que 1 seulement pour le décorateur