//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenSets
{
	public OddEvenSets() {

	}

	public Set<String> getOdds(String input) {
		Set<String> odd = new TreeSet<String>();
		String[] numBois = input.split(" ");

		for(int i = 0; i < numBois.length; i++) {
			int num = Integer.parseInt(numBois[i]);
			if(num % 2 != 0) {
				odd.add(numBois[i]);
			}
		}
		return odd;
	}

	public Set<String> getEvens(String input) {
		Set<String> even = new TreeSet<String>();
		String[] numBois = input.split(" ");

		for(int i = 0; i < numBois.length; i++) {
			int num = Integer.parseInt(numBois[i]);
			if(num % 2 == 0) {
				even.add(numBois[i]);
			}
		}
		return even;
	}

	}
