//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;
import static java.lang.System.*;
import java.util.*;

public class BiDirectionalGraph
{
	Map<String, String> biGraph = new TreeMap<String, String>();

	public BiDirectionalGraph(){

	}
	public void addToMap(String points){
       //System.out.println(points);
       //splits data into pairs
       String[] point= points.split(" ");//splits list of names into indiv. names

        if(biGraph.containsKey(point[0])) {
          biGraph.replace(point[0], biGraph.get(point[0]) + " " + point[1]);
        }
        if(!biGraph.containsKey(point[0])) {
          //System.out.println(point.length);
          biGraph.put(point[0], point[1]);
        }
        if(biGraph.containsKey(point[1])) {
          biGraph.replace(point[1], biGraph.get(point[1]) +  " " + point[0]);

        }
        if(!biGraph.containsKey(point[1])) {
          biGraph.put(point[1],point[0]);
        }


    //System.out.println(biGraph);
  }

  public boolean contains(String letter)
	{
    return biGraph.containsKey(letter);
	}

  public boolean check(String first, String second, ArrayList<String> been) {
    //System.out.println(first + " " + second);
    //System.out.println(biGraph.toString());

    if(!contains(first)) {
      //System.out.println("you shouldn't be seeing this yet bud" + first);
      return false;
    }
    if(been.contains(first)) {
      //System.out.println("you shouldn't be seeing this yet bud" + first);
      return false;
    }
    String[] seconds = biGraph.get(first).split(" ");
    for(int i = 0; i < seconds.length; i++) {
      if((seconds[i]).equals(second)){
        //System.out.println("you did it");

        return true;
      } else {
        been.add(first);
        if(check(seconds[i], second, been)) {
          //System.out.println("you did it");

          return true;
        }
      }

    }
    return false;
  }

    public String toString() {
      return " ";
    }
}
