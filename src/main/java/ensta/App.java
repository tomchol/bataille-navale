package ensta;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
		Board b1 = new Board("Tom", 7);
		Destroyer s1 = new Destroyer(Orientation.SOUTH);
		System.out.println(s1.getOrientation());
		
		b1.print();
    }
}

