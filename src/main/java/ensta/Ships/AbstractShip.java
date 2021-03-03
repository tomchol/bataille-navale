package ensta;

abstract class AbstractShip {

	protected char label; 
	protected String nom;
	protected int taille;
	protected Orientation orientation;
	
	
	public AbstractShip(String nom, char label, int taille, Orientation orientation) {
		this.nom = nom;
		this.label = label;
		this.taille = taille;
		this.orientation = orientation;
	}
	
	public void changeOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

	public String getNom() {
		return nom;
	}
	public int getTaille() {
		return taille;
	}
	public Orientation getOrientation() {
		return orientation;
	}
	public char getLabel() {
		return label;
	}
}

