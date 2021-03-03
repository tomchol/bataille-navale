package ensta;
import java.io.Serializable;
import java.util.List;

public class Player {
    /* **
     * Attributs
     */
    protected Board board;
    protected Board opponentBoard;
    protected int destroyedCount;
    protected AbstractShip[] ships;
    protected boolean lose;

    /* **
     * Constructeur
     */
    public Player(Board board, Board opponentBoard, List<AbstractShip> ships) {
        this.board = board;
        this.ships = ships.toArray(new AbstractShip[0]);
        this.opponentBoard = opponentBoard;
    }

    /* **
     * Méthodes
     */

    /**
     * Read keyboard input to get ships coordinates. Place ships on given coordinates.
     */
    public void putShips() {
        boolean done = false;
        int i = 0;

        do {
            AbstractShip s = ships[i];
            String msg = String.format("placer %d : %s(%d)", i + 1, s.getName(), s.getLength());
            System.out.println(msg);
            InputHelper.ShipInput res = InputHelper.readShipInput();
            // set ship orientation
            String orientation = res.orientation;
            switch(orientation)
            {
            case "n":
            	s.changeOrientation(Orientation.NORTH);
            	break;
            case "s":
            	s.changeOrientation(Orientation.SOUTH);
            	break;
            case "e":
            	s.changeOrientation(Orientation.EAST);
            	break;
            case "w":
            	s.changeOrientation(Orientation.WEST);
            	break;
            }
            // put ship at given position
			try {
				board.putShip(s, res.x, res.y);
			} catch (Exception e)
			{
				System.out.println(e);
				i--;
			}
			
            ++i;
            done = i == 5;

            board.print();
        } while (!done);
    }
/*
    public Hit sendHit(int[] coords) {
        boolean done;
        Hit hit = null;

        do {
            System.out.println("où frapper?");
            InputHelper.CoordInput hitInput = InputHelper.readCoordInput();
            // TODO call sendHit on this.opponentBoard

            // TODO : Game expects sendHit to return BOTH hit result & hit coords.
            // return hit is obvious. But how to return coords at the same time ?
        } while (!done);

        return hit;
    }
    */

    public AbstractShip[] getShips() {
        return ships;
    }

    public void setShips(AbstractShip[] ships) {
        this.ships = ships;
    }
}