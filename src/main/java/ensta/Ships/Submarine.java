package ensta;

class Submarine extends AbstractShip {
	
	Submarine(Orientation orientation){
		super("Submarine", Label.S, 3, orientation);
	}
	
	Submarine(){
		super("Submarine", Label.S, 3, Orientation.EAST);
	}

}

