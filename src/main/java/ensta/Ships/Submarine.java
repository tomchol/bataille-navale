package ensta;

class Submarine extends AbstractShip {
	
	Submarine(Orientation orientation){
		super("Submarine", 'S', 3, orientation);
	}
	
	Submarine(){
		super("Submarine", 'S', 3, Orientation.EAST);
	}

}

