package Ex1;

public class Cercle extends Forme {
	private double rayon;
	public Cercle (double rayon)
	{
		this.rayon= rayon;
	}
	public double Surface() {
		return 3.14 * rayon* rayon;
	}
}
