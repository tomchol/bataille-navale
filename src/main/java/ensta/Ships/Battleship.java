package ensta;

class Battleship extends AbstractShip {
	
	Battleship(Orientation orientation){
		super("Battleship", 'B', 4, orientation);
	}
	
	Battleship(){
		super("Battleship", 'B', 4, Orientation.EAST);
	}

}

