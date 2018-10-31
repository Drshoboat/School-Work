//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;
import java.util.*;


public class DupRunner
{
	public static void main( String args[] )
	{
		UniquesDupes jimothy = new UniquesDupes();

		System.out.println("Original List: a b c d e f g h a b c d e f g h i j k");
		System.out.println("Uniques : " + jimothy.getUniques("a b c d e f g h a b c d e f g h i j k"));
		System.out.println("Dupes : " + jimothy.getDupes("a b c d e f g h a b c d e f g h i j k"));

		System.out.println("Original List: one two three one two three six seven one two");
		System.out.println("Uniques : " + jimothy.getUniques("one two three one two three six seven one two"));
		System.out.println("Dupes : " + jimothy.getDupes("one two three one two three six seven one two"));

		System.out.println("Original List: 1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6");
		System.out.println("Uniques : " + jimothy.getUniques("1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6"));
		System.out.println("Dupes : " + jimothy.getDupes("1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6"));
	}
}
