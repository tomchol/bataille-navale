package ensta;

abstract class AbstractShip {

	protected char label; 
	protected String nom;
	protected int taille;
	protected Orientation orientation;
	protected int strikeCount;
	
    /* **
     * Constructeur
     */
	public AbstractShip(String nom, char label, int taille, Orientation orientation) {
		this.nom = nom;
		this.label = label;
		this.taille = taille;
		this.orientation = orientation;
		this.strikeCount = 0;
	}
	
	/**
     * Change the ship orientation
     * @param orientation The new ship orientation
     */
	public void changeOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

	/**
     * Get the name of the ship
     * @return the name of the ship
     */
	public String getName() {
		return nom;
	}
	/**
     * Get the size of the ship
     * @return the size of the ship
     */
	public int getLength() {
		return taille;
	}
	/**
     * Get the orientation of the ship
     * @return the orientation of the ship
     */
	public Orientation getOrientation() {
		return orientation;
	}
	/**
     * Get the label of the ship
     * @return the label of the ship
     */
	public char getLabel() {
		return label;
	}

	/**
     * Add one to the number of times the ship has been hited
     */
	public void addStrike() {
		strikeCount++;
	}

	/**
     * Get if the ship is sunk
     * @return true if the ship is sunk
     */
	public boolean isSunk() {
		return (strikeCount >= taille);
	}

}

