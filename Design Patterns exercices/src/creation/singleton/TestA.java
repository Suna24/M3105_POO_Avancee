package creation.singleton;

public class TestA {

	public static void main(String[] args) {

		A unA = A.getInstance();
		unA.method();
		
		//Question
		//Le DP Singleton est � eviter car les instances uniques des objets
		//deviennt accessibles de partout
		//C'est �galement difficile � tester
		//Probl�me revient � faire une variable globale
	}
}
