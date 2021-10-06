package creation.fabrique;

public class TestStudentFactory {

	public static void main(String[] args) {

		StudentFactory factory = new DumbStudentFactory(); // or the other Smart one

		Student aStudent = factory.createStudent();

		aStudent.giveOOskill();
	}

}

//Questions
//Le principe d'ouverture fermeture n'est pas respecté
//ProduitFactory --> FabriqueAnimal
//ProduitA --> Animal
//Produit A1 && A2 --> Chien et Chat
