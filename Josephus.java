import java.io.*;
import java.util.*;

public class Josephus
{
   public static void main(String[] args)
   {
   System.out.println(survivor(5,2));
   
   }
   public static int survivor(int p, int f)// p = # of people f = kill factor
   {
      boolean people[] = new boolean[p];
      
      for(int i = 0; i<people.length; i++)
      {
         //if true p = alive
         people[i] = true;
      
      }
      int living = p; // counter of people living
      int count = 0; // count off of who will be the next to defeated
      int spot = 0;
     while(living > 1)
     {
      if(people[spot]) // if person is alive
      {
         count ++; // count off   
         if(count % f == 0)
         {
           people[spot] = false; // person now defeated
           living --; // decrease living
         
         }
       }
         if(spot == people.length -1)
            spot = 0;
         else 
            spot ++;
     
     }   //find remaining living person
        for(int i =0; i< people.length; i++)
        
        {
         if(people[i])
            return (i+1); //return the spot of last living
        
        }
      return -1 ;// error 
   }
   










}