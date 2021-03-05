package ensta;

public class ShipState {

    private AbstractShip ship;
    private Boolean struck;

    /* **
     * Constructeurs
     */
    public ShipState() {}

    public ShipState(AbstractShip ship) {
		this.ship = ship;
		this.struck = false;
	}

    
    /**
     * Set the ship of this case
     * @param ship the ship that will be associated to this case
     */
    public void setShip(AbstractShip ship)
    {
        this.ship = ship;
    }

    /**
     * Get the ship associated to the case
     * @return the ship
     */
    public AbstractShip getShip(){
        return ship;
    }


    /**
     * Mark the ship at this case as Strunck
     */
    public void addStrike(){
        if (!struck) {
            struck = true;
            ship.addStrike();
        }
    }


    /**
     * Get if the ship in this case in strunck
     * @return true if the ship is strunck
     */
    public boolean isStrunck(){
        return struck;
    }

    /**
     * Get if the ship in this case in sunk
     * @return true if the ship is sunk
     */
    public boolean isSunk() 
    {
        return ship.isSunk();
    }
    /**
     * Get the right string to print regarding the case condition
     * @return the String
     */
    public String toString(){
        String st = "";
        if (ship != null)
        {
            if (struck) st += ColorUtil.colorize(ship.label, ColorUtil.Color.RED);
            else st += ship.getLabel();
        }
        else st += ".";
        return st;
    }
}