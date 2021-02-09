class Battleship extends AbstractShip {
	
	Battleship(Orientation orientation){
		super("Battleship", Label.B, 4, orientation);
	}
	
	Battleship(){
		super("Battleship", Label.B, 4, Orientation.EAST);
	}

}

