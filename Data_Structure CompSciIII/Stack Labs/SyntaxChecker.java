import java.util.Scanner;
import java.io.File;
import java.util.Stack;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.*;
public class SyntaxChecker {
  static Stack<String> openSyntax = new Stack<String>();

    public static void fillStack() throws FileNotFoundException{
      // Reads in file
      File f = new File("syntaxChecker.dat");
      Scanner file = new Scanner(f);

      int lines = file.nextInt();
      //System.out.println(lines);
      file.nextLine();

      String open  = "{[(<";
      String close = "}])>";
      boolean noErrors = true;
      for(int i = 1; i < lines; i++) {
        //System.out.println("Start for" + i);

        String syntax = file.nextLine();
        String[] arrSyn = syntax.split("");
      //  System.out.println(Arrays.toString(arrSyn));
        noErrors = true;
        openSyntax.clear();
        //System.out.println(openSyntax);
        while(noErrors){
        for(int j =0; j < arrSyn.length; j++) {
          if(open.indexOf(arrSyn[j]) > -1) {//if char == opening symbol

            openSyntax.push(arrSyn[j]);
          //  System.out.println(openSyntax);
        } else if(close.indexOf(arrSyn[j]) > -1) {// if char == closing symbol
            if(openSyntax.size() > 0){
              if(open.indexOf(openSyntax.pop()) != (close.indexOf(arrSyn[j]))){
                noErrors = false;
                System.out.println(Arrays.toString(arrSyn) + "is incorrect");
                //System.out.println(openSyntax);

              }
            }
          }
          if(openSyntax.size() == 0 && noErrors == true) {

            System.out.println(Arrays.toString(arrSyn) + "is correct");
            //System.out.println(openSyntax);
            noErrors = false;
          }
        }
        noErrors = false;
        //System.out.println(Arrays.toString(arrSyn) + "is incorrect");
        }
        //System.out.println("Ended for" + i);
      }

  }

}
