package creation.singleton;

public class TestA {

	public static void main(String[] args) {

		A unA = A.getInstance();
		unA.method();
		
		//Question
		//Le DP Singleton est à eviter car il peut générer trop
		//de dépendances
	}
}
