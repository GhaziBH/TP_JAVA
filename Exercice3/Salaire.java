package ex3;

public class Salaire {

	public static void main(String[] args) {
		Personnel p = new Personnel(200);
		p.ajouterEmploye(new Vendeur("Pierre","Business",45,"1995",30000 ));
		p.ajouterEmploye(new Representant("Léon","Vendtout",25,"2001",20000 ));
		p.ajouterEmploye(new technicien("Yves","Bosseur",28,"1998",1000 ));
		p.ajouterEmploye(new manutention("Jeanne","stocketout",32,"1998",45 ));
		p.ajouterEmploye(new TechARisque("Jean","Flippe",28,"2000",1000 ));
		p.ajouterEmploye(new manutARisque("Al","Abordage",30,"2001",45 ));

		p.calculerSalaires();
		System.out.println("Le salaire moyen dans l'entreprise est de " + p.salaireMoyen()+ " francs");

	}

}
