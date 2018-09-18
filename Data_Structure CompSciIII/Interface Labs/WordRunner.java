//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));

		int size = file.nextInt();
		file.nextLine();

		ArrayList<Word> wrd = new ArrayList<Word>();

		for(int i = 0; i < size; i++) {
				wrd.add(new Word(file.nextLine()));
		}

		Collections.sort(wrd);

		out.println(wrd);


		//write a string Array













	}
}
