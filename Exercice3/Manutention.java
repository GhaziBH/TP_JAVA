package ex3;

public class manutention extends Employé{
	protected int nbH;
	public manutention(String nom, String prenom, int age, String date, int nbH) {
		super(nom, prenom, age, date);
		this.nbH=nbH;
	}
	public double calculerSalaire() {
		return nbH*65;
	}
	public String getNom() {
		String S=("Le manuteur"+ nom + " " + prenom);
		return S;
	}
	

}
