import java.util.Scanner;
import java.lang.System;
import java.util.*;
import java.io.File;
import java.io.*;

public class SpanishToEnglish{
    Map<String, String> translations = new HashMap<String, String>();
    public SpanishToEnglish(){

    }
    public void addWords() throws FileNotFoundException{
    // reads in file of words
    File f = new File("spantoeng.dat");
    Scanner scan = new Scanner(f);


    int numWords = scan.nextInt();
    scan.nextLine();

    for(int i = 0; i < numWords; i++) {
      String word = scan.nextLine();
      String[] words = word.split(" ");

      translations.put(words[0], words[1]);
    }
  }

  public String translate(String sentence){
    String[] wordsNStuff = sentence.split(" ");
    String output = "";
    for(int i = 0; i < wordsNStuff.length; i++){
      output += translations.get(wordsNStuff[i]) + " ";
    }
    return output;
  }

  public String toString(){
    return translations.toString();
  }
}
