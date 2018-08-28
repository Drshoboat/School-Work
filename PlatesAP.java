import java.io.*;
import java.util.*;


public class PlatesAP
{

	private static String vowels = "aeiou";

    public static void main(String[] args)  throws FileNotFoundException
    {
      File f = new File("plates.dat");
      Scanner file = new Scanner(f);
      
      int numPlates = file.nextInt();
      file.nextLine();
      
      for(int i = 0; i < numPlates; i++)
      {
         String plate = file.nextLine();
         String[] pArr = plate.split(" "); 
         
         int k = 0;
         while(plateLength(pArr) > 8 && containsVowels(pArr))
         {
           String temp = pArr[k];      
           int vIndex = getFirstVowel(temp); 
           if(vIndex >= 0)
             pArr[k] = temp.substring(0,vIndex) + temp.substring(vIndex+1);
           k++;
           
           if(k== pArr.length)
               k = 0;
              
         }
         String result = "";
         for(int x =0;x< pArr.length; x++)
         {
            result = result + pArr[x];
         }
         if(result.length() > 8)
         {
            result = result.substring(0,8);
         }
         System.out.println(result);
      }
      
      
    }

    //this method will glue all the strings in the
    //array together and return the length of the single
    //big String.
    public static int plateLength(String[] a)
    {
		String ans = "";
      for (int i =0 ; i < a.length;i++)
      
      {
         ans = ans +a[i];
      
      }
      return ans.length();
    }

    //this method will return the index of the
    //first vowel in a word, -1 if there are no vowels found
    //in the word
    public static int getFirstVowel(String w)
    {
		for(int i = 0; i <w.length();i++)
      {
       if(vowels.indexOf(w.charAt(i)) >= 0)
       return i;
       
      }
      return -1;
    }

	//this method will search the entire array to
	//determine if there are any vowels in any of
	//the Strings in the arrays

    public static boolean containsVowels(String[] arr)
    {
		for(int i = 0; i <arr.length;i++)
      {
         if(getFirstVowel(arr[i]) >= 0)
            return true;
      
      }
      return false;
    }






}