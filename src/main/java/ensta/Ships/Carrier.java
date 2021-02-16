package ensta;

class Carrier extends AbstractShip {
	
	Carrier(Orientation orientation){
		super("Carrier", Label.C, 5, orientation);
	}
	
	Carrier(){
		super("Carrier", Label.C, 5, Orientation.EAST);
	}

}

