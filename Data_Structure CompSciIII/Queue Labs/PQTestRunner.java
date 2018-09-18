//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class PQTestRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		PQTester one = new PQTester("one two three four five six seven");
		PQTester two = new PQTester("1 2 3 4 5 one two three four five");
		PQTester three = new PQTester("a p h j e f m c i d k l g n o b");

		System.out.println("toString() - " + one.toString());
		System.out.println("getMin() - " + one.getMin());
		System.out.println("getNaturalOrder() - " + one.getNaturalOrder());
		System.out.println("toString() - " + two.toString());
		System.out.println("getMin() - " + two.getMin());
		System.out.println("getNaturalOrder() - " + two.getNaturalOrder());
		System.out.println("toString() - " + three.toString());
		System.out.println("getMin() - " + three.getMin());
		System.out.println("getNaturalOrder() - " + three.getNaturalOrder());
	}
}
