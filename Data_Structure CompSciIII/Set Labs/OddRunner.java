//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class OddRunner
{
	public static void main( String args[] ) throws IOException
	{
		//more test cases
		File f = new File("oddevent.dat");
		Scanner file = new Scanner(f);

		int howManyLines = file.nextInt();
		file.nextLine();

		for(int i = 0; i < howManyLines; i++) {
			OddEvenSets ededneddy = new OddEvenSets();
			String input = file.nextLine();

			System.out.println("ODDS : " + ededneddy.getOdds(input));
			System.out.println("EVENS : " + ededneddy.getEvens(input));
		}
	}
}
