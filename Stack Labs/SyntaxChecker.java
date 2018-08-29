import java.util.Scanner;
import java.io.File;
import java.util.Stack;
import java.io.FileNotFoundException;
public class SyntaxChecker {
  Stack<String> openSyntax = new Stack<String>();
  public SyntaxChecker() {
    fillStack();
  }
  public void fillStack() throws FileNotFoundException{
    // Reads in file
    File f = new File("syntaxChecker.dat");
    Scanner file = new Scanner(f);

    String syntax = file.nextLine();
    file.nextLine();
    String[] arrSyn = syntax.split("");

    for(int i =0; i<arrSyn.length; i++) {
      if(arrSyn[i].equals("{") || arrSyn[i].equals("(") || arrSyn[i].equals("<") || arrSyn[i].equals("[")) {//if char == opening symbol
        openSyntax.push(arrSyn[i]);
      } else if(arrSyn[i].equals("}") || arrSyn[i].equals(")") || arrSyn[i].equals(">") || arrSyn[i].equals("]")) {//if char == closing symbol
          if(openSyntax.size() > 0) {
              String test = openSyntax.pop();
              if(test.equals(arrSyn[i])) {// check but do nothing if both are equal

              }// else end method
          }
      }
    }
  }
}
