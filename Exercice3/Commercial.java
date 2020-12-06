package ex3;

public abstract class commercial extends Employé {
	protected double chiffre;
	public commercial (String nom,String prenom, int age, String date, double chiffre)
	{
		super(nom,prenom,age,date);
		this.chiffre= chiffre;
	}
	
}
