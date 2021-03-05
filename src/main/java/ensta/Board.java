package ensta;

/**
 * Board class
 * @param nom le nom du jour
 * @param ships le tableau avec les bateaux du joueur
 * @param hits pour les tir effectues
 * @param tailleTableau pour la taille du tableau
 */

public class Board implements IBoard{

	private String nom;
	private ShipState[] ships;
	private Boolean[] hits;
	private int tailleTableau;
	
	public Board(String nom, int tailleTableau)
	{
		this.nom = nom;
		this.tailleTableau = tailleTableau;
		this.ships = new ShipState[tailleTableau*tailleTableau];
		this.hits = new Boolean[tailleTableau*tailleTableau];
		for(int i=0; i<tailleTableau*tailleTableau; i++)
		{
			this.ships[i] = new ShipState();
			this.hits[i] = null;
		}
	}
	
	public Board(String nom)
	{
		this(nom,10);
	}
	
	
	public int getSize() {
		return tailleTableau;
	}
	
	public void putShip(AbstractShip ship, int x, int y)
	{
		if (x <0 || x >= tailleTableau || y<0 || y>=tailleTableau) throw new IllegalArgumentException("Le navire sort de la grille");
		for(int i=0; i<ship.getLength(); i++) 
		{
			switch(ship.orientation)
			{
				case EAST:
					if(x+i >= tailleTableau) throw new IllegalArgumentException("Le navire sort de la grille");
					if (hasShip(x+i, y)) throw new IllegalArgumentException("Le navire chevauche un autre navire");
					break;
				case NORTH:
					if(y-i < 0) throw new IllegalArgumentException("Le navire sort de la grille");
					if (hasShip(x, y-i)) throw new IllegalArgumentException("Le navire chevauche un autre navire");
					break;
				case SOUTH:
					if(y+i >= tailleTableau) throw new IllegalArgumentException("Le navire sort de la grille");
					if (hasShip(x, y+i)) throw new IllegalArgumentException("Le navire chevauche un autre navire");
					break;
				case WEST:
					if(x-i < 0) throw new IllegalArgumentException("Le navire sort de la grille");
					if (hasShip(x-i, y)) throw new IllegalArgumentException("Le navire chevauche un autre navire");
			}
		}
		for(int i=0; i<ship.getLength(); i++) 
		{
			switch(ship.orientation)
			{
				case EAST:
					ships[x + i + y*tailleTableau] = new ShipState(ship);
					break;
				case NORTH:
					ships[x + (y-i)*tailleTableau] = new ShipState(ship);
					break;
				case SOUTH:
					ships[x + (y+i)*tailleTableau] = new ShipState(ship);
					break;
				case WEST:
					ships[x - i + y*tailleTableau] = new ShipState(ship);
			}
		}	
	
	}
	
	public boolean hasShip(int x, int y)
	{
		return (ships[x + y*tailleTableau].getShip() != null);
	}
	
	public void setHit(Boolean hit, int x, int y)
	{
		hits[x + y*tailleTableau] = hit;
	}
	
	public Boolean getHit(int x, int y)
	{
		return hits[x + y*tailleTableau];
	}
	


	/**
 	 * Print function for the Board.
 	 */
	public void print()
	{
		String ligne1 = "Navires :";
		for(int i=0; i<tailleTableau-3; i++) ligne1 += "  ";
		ligne1 += "  Frappes :";
		System.out.println(ligne1);
		
		String alphabet = "A B C D E F G H I J K L M N O P Q R S t U V W X Y Z";
		System.out.println("   " + alphabet.substring(0,tailleTableau*2-1) + "      " + alphabet.substring(0,tailleTableau*2-1));
		
		for(int i=0; i<tailleTableau; i++)
		{
			String ligneNavires = "";
			String ligneFrappes = "";
			for(int j =0; j<tailleTableau; j++)
			{
				ligneNavires += ships[j + i*tailleTableau].toString() + " ";
				if(hits[j + i*tailleTableau] == null) ligneFrappes += ". ";
				else if(hits[j + i*tailleTableau] == true) ligneFrappes += ColorUtil.colorize("X ", ColorUtil.Color.RED);
				else ligneFrappes += "X ";
			}
			if (i+1<10) System.out.println((i+1) + "  " + ligneNavires + "  " + (i+1) + "  " + ligneFrappes);
			else System.out.println((i+1) + " " + ligneNavires + "  " + (i+1) + " " + ligneFrappes);
		}
	}
	
}	
	
	
