package ensta;


/**
 * Unit test for Board.
 */
public class TestBoard 
{
	public static void main( String[] args )
	{
		Board board = new Board("Tom", 10);
		Submarine s1 = new Submarine(Orientation.EAST);
		Battleship b1 = new Battleship(Orientation.SOUTH);
		board.putShip(s1,1,1);
		board.putShip(b1,7,2);
		board.print();
		
		System.out.println(board.hasShip(5,5));
		System.out.println(board.hasShip(7,4));
		
		board.setHit(true, 4,4);
		board.setHit(true, 7,3);
		board.print();
		System.out.println(board.getHit(7,3));
		System.out.println(board.getHit(7,4));
		
	}
}
