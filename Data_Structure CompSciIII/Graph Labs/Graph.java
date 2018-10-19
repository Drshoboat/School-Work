import java.util.*;
public class Graph {
  Map<String, String> graph = new TreeMap<String, String>();
  boolean didFind = false;
  public Graph() {

  }

  public void addToMap(String points){
      //System.out.println(points);
       //splits data into pairs
       String[] point= points.split("");//splits pairs into idividual strings

        if(graph.containsKey(point[0])) {
          graph.replace(point[0], graph.get(point[0]) + point[1]);
        }
        if(!graph.containsKey(point[0])) {
          //System.out.println(point.length);
          graph.put(point[0], point[1]);
        }
        if(graph.containsKey(point[1])) {
          graph.replace(point[1], graph.get(point[1]) + point[0]);

        }
        if(!graph.containsKey(point[1])) {
          graph.put(point[1],point[0]);
        }


    //System.out.println(graph);
  }

  public boolean contains(String letter)
	{
    return graph.containsKey(letter);
	}

  public boolean check(String first, String second, ArrayList<String> been) {
    //System.out.println(first + " " + second);
    //System.out.println(graph.toString());

    if(!contains(first)) {
      //System.out.println("you shouldn't be seeing this yet bud" + first);
      return false;
    }
    if(been.contains(first)) {
      //System.out.println("you shouldn't be seeing this yet bud" + first);
      return false;
    }
    String[] seconds = graph.get(first).split("");
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
