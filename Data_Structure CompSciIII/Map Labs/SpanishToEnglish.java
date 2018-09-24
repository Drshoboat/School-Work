import java.util.Scanner;
import java.lang.System;
import java.io.file;

public class SpanishToEnglish throws FileNotFoundException{
    Map<String,String> translations = new HashMap<String,String>();
    public SpanishToEnglish(){

    }
    public void addWords(){
      // reads in file
      File f = new File("spantoeng.dat");
      Scanner words = new Scanner(f);

      f.nextInt();
      //String[] wordsnstuff = words.split(" ");

      for(int i = 0; i < wordsnstuff.length(); i ++) {
        f.nextLine();
        String[] wordsnstuff = words.split(" ");
        translate.put(wordsnstuff[0], wordsnstuff[1]);
      }
    }
    public String translate(String key) {
       return translations.get(key);
    }
}
