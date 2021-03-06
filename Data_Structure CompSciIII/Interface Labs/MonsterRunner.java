//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);

		//ask for name and size
		out.print("Enter 1st monster's name : ");
		String monsterOne = keyboard.next();
		out.println("Enter 1st monster's size : ");
		int monsterOneSize = keyboard.nextInt();


		//instantiate monster one
		Skeleton bob = new Skeleton(monsterOne, monsterOneSize);

		//ask for name and size
		out.println("Enter 2nd monster's name : ");
		String monsterTwo = keyboard.next();
		out.println("Enter 2nd monster's size : ");
		int monsterTwoSize = keyboard.nextInt();
		//instantiate monster two
		Skeleton tom = new Skeleton(monsterTwo, monsterTwoSize);

		out.println("Monster 1 - " + bob.toString());
		out.println("Monster 2 - " + tom.toString());


		if(bob.getHowBig() > tom.getHowBig()) {
			out.println("Monster one is bigger than Monster two.");
		} else if( monsterOneSize < monsterTwoSize) {
			out.println("Monster one is smaller than Monster two");
		}
		if(bob.namesTheSame(tom)) {
			out.println("Monster one does have the same name as Monster two.");
		} else{
			out.println("Monster one does not have the same name as Monster two");
		}
	}
}
