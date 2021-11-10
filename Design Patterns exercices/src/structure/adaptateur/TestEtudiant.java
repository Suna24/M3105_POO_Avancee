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
//Niv objet -- > agr�gation (�tudiant en attribut de AdapteurObjet) |
//																	|--> Impl�ments IEtudiant
//Niv classe --> h�rite de student									|
