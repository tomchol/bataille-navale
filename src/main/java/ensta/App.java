package ensta;
import java.util.*;

/**
 * Hello world!
 *
 */

public class App 
{
	public static void main( String[] args )
	{
		Board board = new Board("Tom", 10);
		Board mechant = new Board("lui", 10);
		Submarine s = new Submarine(); 
		List<AbstractShip> ships = new ArrayList<AbstractShip>();
		for (int i=0; i<5; i++) ships.add(s);
		Player Tom = new Player(board, mechant, ships);
		Tom.putShips();
		Tom.board.setHit(true,5,5);
		Tom.board.setHit(false,9,9);
		Tom.board.print();
		Tom.board.sendHit(0,0);
		Tom.board.sendHit(0,1);
		Tom.board.sendHit(0,2);
		Tom.board.print();
	}
}

