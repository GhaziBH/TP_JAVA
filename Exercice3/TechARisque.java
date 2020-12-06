package ex3;

public class TechARisque extends technicien implements ARisque {

	public TechARisque(String nom, String prenom, int age, String date, int nbUnité) {
		super(nom, prenom, age, date, nbUnité);
	}
	
	public double calculerSalaire() {
		return super.calculerSalaire()+ prime;
	
	}

}
