package ex3;

public class technicien extends Employ� {
	protected int nbUnit�;

	public technicien(String nom, String prenom, int age, String date,int nbUnit�) {
		super(nom, prenom, age, date);
		this.nbUnit�= nbUnit�;
	}
	public double calculerSalaire() {
		return nbUnit�*5;
	}
	public String getNom() {
		String S=("Le technicien"+ nom + " " + prenom);
		return S;
	}

}
