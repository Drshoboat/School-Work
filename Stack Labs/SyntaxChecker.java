import java.util.Scanner;
import java.io.File;
import java.util.Stack;
public class SyntaxChecker {
    public static void main(String args[]) throws FileNotFoundException {
      File file = new File("syntaxChecker.dat");
      Scanner sc = new Scanner(file);
      Stack<String> syntax = new Stack<String>();
      String bob = sc.nextLine();

      System.out.println(syntax);
    }
}
