//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.*;

public class UniquesDupes
{
	public UniquesDupes () {

	}
	public static Set<String> getUniques(String input)
	{
		Set<String> uniques = new TreeSet<String>();
		String[] wordBois = input.split(" ");
		for(int i = 0; i < wordBois.length; i++) {
			uniques.add(wordBois[i]);
		}


		return uniques;
	}

	public static Set<String> getDupes(String input)
	{
		String[] wordBois = input.split(" ");
		Set<String> uniques = new TreeSet<String>();
		ArrayList<String> dupes = new ArrayList<String>();
		for(int i = 0; i < wordBois.length; i++) {
			uniques.add(wordBois[i]);
		}
		Set<String> dumb = dupes.addAll(uniques);
		return dumb;
	}
}
