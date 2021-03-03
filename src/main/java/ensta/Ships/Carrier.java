package ensta;

class Carrier extends AbstractShip {
	
	Carrier(Orientation orientation){
		super("Carrier", 'C', 5, orientation);
	}
	
	Carrier(){
		super("Carrier", 'C', 5, Orientation.EAST);
	}

}

