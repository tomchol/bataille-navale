package ensta;

class Destroyer extends AbstractShip {
	
	Destroyer(Orientation orientation){
		super("Destroyer", 'D', 2, orientation);
	}
	
	Destroyer(){
		super("Destroyer", 'D', 2, Orientation.EAST);
	}

}

