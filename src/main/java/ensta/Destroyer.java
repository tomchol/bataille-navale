class Destroyer extends AbstractShip {
	
	Destroyer(Orientation orientation){
		super("Destroyer", Label.D, 2, orientation);
	}
	
	Destroyer(){
		super("Destroyer", Label.D, 2, Orientation.EAST);
	}

}

