package ensta;

public class ShipState {

    private AbstractShip ship;
    private Boolean struck;

    public ShipState() {}

    public ShipState(AbstractShip ship) {
		this.ship = ship;
		this.struck = false;
	}

    public void setShip(AbstractShip ship)
    {
        this.ship = ship;
    }

    public AbstractShip getShip(){
        return ship;
    }

    public void addStrike(){
        if (!struck) {
            struck = true;
            ship.addStrike();
        }
    }

    public boolean isStrunck(){
        return struck;
    }

    public boolean isSunk() 
    {
        return ship.isSunk();
    }

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