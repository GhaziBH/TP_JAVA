package ex3;

public class Vendeur extends commercial {
	
	public Vendeur(String nom,String prenom, int age, String date, double chiffre) {
		super(nom,prenom,age,date,chiffre);
		
	}
	
	public double calculerSalaire() {
		return (chiffre*0.2) + 400;
	}
	public String getNom() {
		String S=("Le Vendeur "+ nom + " " + prenom);
		return S;
	}
}
