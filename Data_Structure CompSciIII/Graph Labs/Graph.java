import java.util.*;
import java.io.*;

public class Graph {
  Map<String, String> graph = new TreeMap<String, String>();

  public Graph() {

  }

  public void addToMap() throws FileNotFoundException{
    File file = new File("graph1.dat");
    Scanner f = new Scanner(file);

    int howManyTimes = f.nextInt();
    f.nextLine();
    for(int i = 0; i < howManyTimes; i++) {
      String letters = f.nextLine();
      String[] letter = letters.split(" ");//splits data into pairs
      for(int j = 0; j < letter.length; j++) {
        String[] point= letter[j].split("");//splits pairs into idividual strings
        if(graph.containsKey(point[0])) {
          graph.replace(point[0], graph.get(point[0]) + point[1]);
        } else {
          graph.put(point[0], point[1]);
        }
        if(graph.containsKey(point[1])) {
          graph.replace(point[1], graph.get(point[1]) + point[0]);

        }
        if(!graph.containsKey(point[1])) {
          graph.put(point[1],point[0]);
        }
      }
    }
    //System.out.println(graph);
  }

  public boolean contains(String letter)
	{
    return graph.containsKey(letter);
	}

  public boolean check(String first, String second, ArrayList<String> been) {
    if(!contains(first)) {
      return false;
    }
    if(!contains(second)) {
      return false;
    } else {
        String[] seconds = graph.get(first).split("");
        for(int i = 0; i < seconds.length; i++) {
          if(){
            //work on check method, if statement
          }
        }
      }
    }
  }
