package structure.decorateur;

public class Usine {
	
	public static void main(String[] args) {
	
		Voiture astonMartin = new VoitureAvecClimatisation(new AstonMartin()); 
		astonMartin = new VoitureAvecParachute(astonMartin); 
		astonMartin = new VoitureAmphibie(astonMartin);
 
		System.out.println(String.format("Prix = %.2f", astonMartin.getPrix())); 
                // affiche "Prix = 1110,99€"
	}
}

//Questions
//Parachute, Amphibie, Climastisation --> D�corateurs Concrets
//Option --> D�cirateur Abstrait
//Voiture --> Component
//AstonMartin --> ConcreteComponent

//Diff�rence avec le patron composite
//La multiplict� 0 � * pour le composite alors que 1 seulement pour le d�corateur