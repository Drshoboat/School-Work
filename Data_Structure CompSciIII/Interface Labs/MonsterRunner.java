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


		//ask for name and size
		out.println("Enter 2nd monster's name : ");
		String monsterTwo = keyboard.next();
		out.println("Enter 2nd monster's size : ");
		int monsterTwoSize = keyboard.nextInt();
		//instantiate monster two

		out.println("Monster 1 - " + monsterOne + " " + monsterOneSize);
		out.println("Monster 2 - " + monsterTwo +  " " + monsterTwoSize);


		if(monsterOneSize > monsterTwoSize) {
			out.println("Monster one is bigger than Monster two.");
		} else if( monsterOneSize < monsterTwoSize) {
			out.println("Monster one is smaller than Monster two");
		}
		if(monsterOne.compareTo(monsterTwo) != 0) {
			out.println("Monster one does not have the same name as Monster two.");
		} else{
			out.println("Monster one does have the same name as Monster two");
		}
	}
}
