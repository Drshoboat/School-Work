//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;
import static java.lang.System.*;
import java.util.*;

public class BiDirectionalGraphRunner
{
	public static void main( String[] args ) throws IOException
	{
		File file = new File("bidgraph.dat");//reads in data from .dat file
		Scanner f = new Scanner(file);

		int numTimes = f.nextInt();
		f.nextLine();

		for(int i = 0; i < numTimes; i++) {
			BiDirectionalGraph jimmybillyandmillie = new BiDirectionalGraph();
			String names = f.nextLine(); // makes a string of all the names
			String whatToConnect = f.nextLine(); // makes a string of names to connect
			String[] name = names.split(" "); //seperates each name into an array

			for(int j = 0; j < name.length; j+=2) {
				jimmybillyandmillie.addToMap(name[j] + " " + name[j+1]);
			}

			String[] connections = whatToConnect.split(" ");
			ArrayList<String> timmyandjimmy = new ArrayList<String>();

			if(jimmybillyandmillie.check(connections[0], connections[1], timmyandjimmy)) {
				System.out.println(connections[0] + " CONNECTS TO " + connections[1] + " == YAH");
			} else {
				System.out.println(connections[0] + " CONNECTS TO " + connections[1] + " == NAH");
			}
		}
	}
}
