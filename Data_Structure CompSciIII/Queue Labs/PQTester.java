//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PQTester
{
	private Queue<String> pQueue = new PriorityQueue<String>();

	public PQTester()
	{
	}

	public PQTester(String list)
	{
		String splitStr[] = list.split(" ");
		for(int i = 0; i < splitStr.length; i++) {
			pQueue.add(splitStr[i]);
		}
	}

	public void setPQ(String list)
	{
	}

	public Object getMin()
	{
		return pQueue.peek();
	}

	public String getNaturalOrder()
	{
		String output="";
		Queue<String> temp = pQueue;
		while(!temp.isEmpty()) {
			output += temp.remove() + " ";
		}
		return output;
	}

	//write a toString method
	public String toString() {
		return pQueue.toString();
	}
}
