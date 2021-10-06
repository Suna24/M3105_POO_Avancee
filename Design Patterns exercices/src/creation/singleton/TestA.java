package creation.singleton;

public class TestA {

	public static void main(String[] args) {

		A unA = A.getInstance();
		unA.method();
		
		//Question
		//Le DP Singleton est à eviter car les instances uniques des objets
		//deviennt accessibles de partout
		//C'est également difficile à tester
		//Problème revient à faire une variable globale
	}
}
