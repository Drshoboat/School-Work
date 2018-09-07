//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

//ArrayList of ints
//or
//array of ints

import java.util.ArrayList;
import static java.lang.System.*;

public class IntQueue
{
	//pick your storage for the queue
	//you can use the an array or an ArrayList

	//option 1
	private int[] rayOfInts;
	private int numInts;

	//option 2
	private ArrayList<Integer> listOfInts;

	public IntQueue()
	{
		ArrayList <Integer> arrlist = listOfInts.clone();
	}

	public void add(int item)
	{
		listOfInts.add(item);
	}

	public int remove()
	{
		arrlist.remove(0);

	}

	public boolean isEmpty()
	{
		if(listOfInts.isEmpty())
		{
			return true;
		}
		return false;
	}

	public int peek()
	{
		listofInts.get(0);

	}

	public String toString()
	{
		return "";
	}
}
