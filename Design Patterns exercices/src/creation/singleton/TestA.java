package creation.singleton;

public class TestA {

	public static void main(String[] args) {

		A unA = A.getInstance();
		unA.method();
		
		//Question
		//Le DP Singleton est � eviter car il peut g�n�rer trop
		//de d�pendances
	}
}
