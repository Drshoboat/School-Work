import java.util.Stack;
import java.util.Scanner;

public class StackTest {
  public static void main(String args[])
	{
    Stack<String> string = new Stack<String>();
    string.push("First");
    string.push("Second");
    string.push("Third");
    string.push("Fourth");

    System.out.println(string);

    System.out.println(string.pop());//First

    System.out.println(string.pop());//Second

    System.out.println(string.pop());//Third

    System.out.println(string.pop());//Fourth
  }
}
