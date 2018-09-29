import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class SpanRunner{
  public static void main(String[] args) throws FileNotFoundException{
    SpanishToEnglish bing = new SpanishToEnglish();
    bing.addWords();


    File f = new File("sentences.dat");
    Scanner scan = new Scanner(f);

    int numSen = scan.nextInt();
    scan.nextLine();

    System.out.println(bing.toString());

    for(int i = 0; i < numSen; i++){
      String sen = scan.nextLine();
      System.out.println(bing.translate(sen));
    }
}
}
