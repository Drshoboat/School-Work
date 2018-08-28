//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab01c
{
	public static void main( String args[] )
	{
		//read in the datafile to create magic square objects
		//that are size requested in the datafile.
       MagicSquare bob = new MagicSquare();
       bob.setSize(5);
       bob.checkMagic();
       bob.PrintArray();
       System.out.println("The magic square is: " + bob.checkMagic() + "\n");
       bob.setSize(1);
       bob.checkMagic();
       bob.PrintArray();
       System.out.println("The magic square is: " + bob.checkMagic() + "\n");
       bob.setSize(7);
       bob.checkMagic();
       bob.PrintArray();
       System.out.println("The magic square is: " + bob.checkMagic() + "\n");
       bob.setSize(3);
       bob.checkMagic();
       bob.PrintArray();
       System.out.println("The magic square is: " + bob.checkMagic() + "\n");
 
       
 
	}
}