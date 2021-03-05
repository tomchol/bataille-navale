package ensta;
import java.util.*;

/**
 * Hello world!
 *
 */

public class TestGame 
{
    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

	public static void main()
	{
		Board board = new Board("Board", 10);
        board.print();
        Destroyer d = new Destroyer();
        Submarine s1 = new Submarine(); 
        Submarine s2 = new Submarine(); 
        Battleship b = new Battleship();
        Carrier c = new Carrier();
        AbstractShip[] ships = new AbstractShip[5];
        ships[0] = d;
        ships[1] = s1;
        ships[2] = s2;
        ships[3] = b;
        ships[4] = c;
		BattleShipsAI ai = new BattleShipsAI(board, board);
        ai.putShips(ships);
        int shipDestroyed =0;
        while (shipDestroyed<5)
        {
            int[] coords = new int[2];
            Hit hit = ai.sendHit(coords);
            System.out.println("Tir en x ="+ (coords[0]+1)+"; y ="+ (coords[1]+1)+"; "+hit.toString());
            if (hit != Hit.MISS && hit != Hit.STIKE) shipDestroyed ++;
            board.print();
            sleep(1000);
        }

        
	}
}

