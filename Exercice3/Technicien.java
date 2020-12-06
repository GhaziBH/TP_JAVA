package ex3;

public class technicien extends Employé {
	protected int nbUnité;

	public technicien(String nom, String prenom, int age, String date,int nbUnité) {
		super(nom, prenom, age, date);
		this.nbUnité= nbUnité;
	}
	public double calculerSalaire() {
		return nbUnité*5;
	}
	public String getNom() {
		String S=("Le technicien"+ nom + " " + prenom);
		return S;
	}

}
