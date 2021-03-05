package ensta;

abstract class AbstractShip {

	protected char label; 
	protected String nom;
	protected int taille;
	protected Orientation orientation;
	protected int strikeCount;
	
	
	public AbstractShip(String nom, char label, int taille, Orientation orientation) {
		this.nom = nom;
		this.label = label;
		this.taille = taille;
		this.orientation = orientation;
		this.strikeCount = 0;
	}
	
	public void changeOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

	public String getName() {
		return nom;
	}
	public int getLength() {
		return taille;
	}
	public Orientation getOrientation() {
		return orientation;
	}
	public char getLabel() {
		return label;
	}

	public void addStrike() {
		strikeCount++;
	}

	public boolean isSunk() {
		return (strikeCount >= taille);
	}

}

