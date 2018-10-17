import java.util.*;
import java.io.*;
public class Histogram{
  Map<Integer, String> histMap = new HashMap<Integer, String>();
  public void addString() throws FileNotFoundException{
    // reads in dat file
    File f = new File("histogram.dat");
    Scanner file = new Scanner(f);

    int numChars = file.nextInt();
    file.nextLine();

    for(int i = 0; i < numChars; i++) {
      String letter = file.nextLine();
      String[] letters = letter.split("");

      histMap.put(letters[i], i);
    }
  }


}
