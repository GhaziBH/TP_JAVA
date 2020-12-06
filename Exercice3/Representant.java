package ex3;

public class Representant extends commercial {

	public Representant(String nom, String prenom, int age, String date, double chiffre) {
		super(nom, prenom, age, date, chiffre);
	}
	public double calculerSalaire() {
		return (chiffre*0.2) + 800;
	}
	public String getNom() {
		String S=("Le Representant"+ nom + " " + prenom);
		return S;
	}
	
}
