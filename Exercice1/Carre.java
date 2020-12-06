package Ex1;

public class Carre extends Forme{
	private double cote;
	public Carre(double cote) {
		this.cote= cote;
	}
	public double Surface() {
		return cote*cote;
	}
}
