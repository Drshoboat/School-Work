//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MathSetRunner
{
	public static void main(String args[]) throws IOException
	{
		File f = new File("mathsetdata.dat");
		Scanner file = new Scanner(f);

		int howManyLines = file.nextInt();
		file.nextLine();

		for(int i = 0; i < howManyLines; i++) {
			MathSet billyjimmytommysallyandtimmothy = new MathSet();
			String one = file.nextLine();
			String two = file.nextLine();

			System.out.println("Set one [" + one + "]");
			System.out.println("Set two [" + two + "] \n");
			System.out.println("union - " + billyjimmytommysallyandtimmothy.union(one, two));
		}
	}
}
