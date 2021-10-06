package creation.singleton;

public class A {
	
	private static A uniqueInstanceDeA;

	private A() {}

	//M�thode qui r�cup�re l'instance unique de A
	public static A getInstance() {
		if(uniqueInstanceDeA == null) {
			uniqueInstanceDeA = new A();
		}
		
		return uniqueInstanceDeA;
	}
	
	public void method() {
		System.out.println("Contenu de la methode");
	}
	
}
