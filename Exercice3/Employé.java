package ex3;

public abstract class Employ� {
	protected String nom;
	protected String prenom;
	protected int age;
	protected String date;
	
	public Employ�(String nom, String prenom, int age, String date)
	{
		this.nom= nom;
		this.prenom= prenom;
		this.age= age;
		this.date= date;
	}
	public abstract double calculerSalaire();
	public String getNom() {
		String S=("L'employ� "+ nom + " " + prenom);
		return S;
	}
}
