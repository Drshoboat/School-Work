//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import static java.lang.System.*;

public class MathSet {

	public MathSet() {

	}

	public Set<String> union(String one, String two) {
		Set<String> billy = new TreeSet<String>();
		Set<String> jimmy = new TreeSet<String>();
		Set<String> tammy = new TreeSet<String>();
		String[] tommy = one.split(" ");
		String[] sally = two.split(" ");

		for(int i = 0; i < tommy.length; i++) {
			billy.add(tommy[i]);
		}
		for(int j = 0; j < sally.length; j++) {
			jimmy.add(sally[j]);
		}
		
	}
}
