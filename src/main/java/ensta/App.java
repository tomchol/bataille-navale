package ensta;

/**
 * Hello world!
 *
 */

public class App 
{
	public static void main( String[] args )
	{
		Board board = new Board("Tom", 10);
		board.print();
		Submarine s1 = new Submarine(Orientation.EAST);
		Battleship b1 = new Battleship(Orientation.SOUTH);
		board.putShip(s1,1,1);
		board.print();
		board.putShip(b1,10,10);
		board.print();
		
		System.out.println(board.hasShip(5,5));
		System.out.println(board.hasShip(10,10));
		
		board.setHit(true, 4,4);
		board.setHit(true, 7,3);
		board.print();
		System.out.println(board.getHit(7,3));
		System.out.println(board.getHit(7,4));
		
	}
}

