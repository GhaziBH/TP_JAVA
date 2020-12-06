package ex3;

public class manutARisque extends manutention implements ARisque{

	public manutARisque(String nom, String prenom, int age, String date, int nbH) {
		super(nom, prenom, age, date, nbH);
	}
	public double calculerSalaire() {
		return super.calculerSalaire()+ prime;
	}

}
