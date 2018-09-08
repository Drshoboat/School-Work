public class PostfixRunner {
    public static void main(String args[]) throws NumberFormatException {
      PostFix bob = new PostFix();
      String[] first = new String[] {"2", "7", "+", "1", "2", "+", "+"};
      String[] second = new String[] {"1", "2", "3", "4", "+" , "+", "+"};
      String[] third = new String[] {"9", "3", "*", "8", "/", "4", "+"};
      String[] fourth = new String[] {"3", "3", "+", "7", "*", "9", "2", "/","+"};
      String[] fifth = new String[] {"9", "3", "/", "2", "*", "7", "9", "*", "+", "4", "–"};
      String[] sixth = new String[] {"5", "5", "+", "2", "*", "4", "/","9", "+"};
      System.out.println(bob.solvePost(first));
    /*  System.out.println(bob.solvePost(second));
      System.out.println(bob.solvePost(third));
      System.out.println(bob.solvePost(fourth));
      System.out.println(bob.solvePost(fifth));
      System.out.println(bob.solvePost(sixth));
      */
    }
}
