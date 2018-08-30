import java.util.Scanner;
import java.io.File;
import java.util.Stack;
import java.io.FileNotFoundException;
import java.util.Arrays;
public class SyntaxChecker {
  static Stack<String> openSyntax = new Stack<String>();
  static Stack<String> closeSyntax = new Stack<String>();

    public static void fillStack() throws FileNotFoundException{
      // Reads in file
      File f = new File("syntaxChecker.dat");
      Scanner file = new Scanner(f);

      int lines = file.nextInt();
      file.nextLine();

      String open = "{,[,(,<";
      String close = "},],),>";

      for(int i = 0; i < lines; i++) {
        String syntax = file.nextLine();
        String[] arrSyn = syntax.split("");
        System.out.println(Arrays.toString(arrSyn));
        System.out.println(syntax);
        boolean noErrors = true;
        while(noErrors){
        for(int j =0; j < arrSyn.length; j++) {
          if(arrSyn[j].equals("{") || arrSyn[j].equals("(") || arrSyn[j].equals("<") || arrSyn[j].equals("[")) {//if char == opening symbol

            openSyntax.push(arrSyn[j]);
            System.out.println(openSyntax);
          } else if(arrSyn[j].equals("}") || arrSyn[j].equals(")") || arrSyn[j].equals(">") || arrSyn[j].equals("]")) {//if char == closing symbol
              if(openSyntax.size() > 0) {
                  String test = openSyntax.pop();
                  if(test.equals(arrSyn[j])) {// check but do nothjng if both are equal

                  } else {
                    noErrors = false;

                  }
              }
          }
        }
        }
      }

  }

}
