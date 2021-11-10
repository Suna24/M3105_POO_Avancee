package structure.adaptateur;

public class TestEtudiant {

	public static void main(String[] args) {
		Student aStudent = new Student();
		
		IEtudiant unEtudiant = new AdaptStudentObject(aStudent);
		IEtudiant unEtudiant2 = new AdaptStudentClass();
		
		unEtudiant.etudie();
		unEtudiant2.etudie();
		
	}
}

//Tips
//Niv objet -- > agrégation (étudiant en attribut de AdapteurObjet) |
//																	|--> Impléments IEtudiant
//Niv classe --> hérite de student									|
