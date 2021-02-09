package ensta;

/**
 * Board class
 * @param nom le nom du jour
 * @param navires le tableau avec les bateaux du joueur
 * @param frappes pour les tir effectues
 * @param tailleTableau pour la taille du tableau
 */

public class Board {

	private String nom;
	private char[] navires;
	private boolean[] frappes;
	private int tailleTableau;
	
	public Board(String nom, int tailleTableau)
	{
		this.nom = nom;
		this.tailleTableau = tailleTableau;
		this.navires = new char[tailleTableau*tailleTableau];
		this.frappes = new boolean[tailleTableau*tailleTableau];
		for(int i=0; i<tailleTableau*tailleTableau; i++)
		{
			this.navires[i] = '.';
			this.frappes[i] = false;
		}
	}
	
	public Board(String nom)
	{
		this(nom,10);
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
				ligneNavires += navires[j + i*tailleTableau] + " ";
				
				if(frappes[j + i*tailleTableau]) ligneFrappes += "X ";
				else ligneFrappes += ". ";
			}
			if (i+1<10) System.out.println((i+1) + "  " + ligneNavires + "  " + (i+1) + "  " + ligneFrappes);
			else System.out.println((i+1) + " " + ligneNavires + "  " + (i+1) + " " + ligneFrappes);
		}
	}
	
}	
	
	
