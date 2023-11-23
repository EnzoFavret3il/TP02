package etudiant;

public class Etudiant {
	String nom;

	public Etudiant(String nom) {
		this.nom = nom;
	}
	public void travailler() {
		if(this.nom=="Philippe") {
			System.out.println(this.nom+" se met au travail !");
		}
		else {
			System.out.println(this.nom+ " travail plus ou moins...");
		}
	}
	public void seReposer() {
		if(this.nom=="Philippe") {
			System.out.println(this.nom+" se repose");
		}
		else {
			System.out.println(this.nom+ " se repose comme d'habitude");
		}
	}
	
}
