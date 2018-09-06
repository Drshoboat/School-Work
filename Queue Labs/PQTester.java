import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PQTester
{
	PriorityQueue<String> pq = new PriorityQueue<String>();
	public void fillPQ(String str){
		String[] arr = str.split(" ");
		for(int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
			System.out.println("toString() -" + pq);

		}

	}


}
