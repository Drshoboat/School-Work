import java.util.*;
import java.io.*;
import java.lang.System;
public class GraphRunner{
  public static void main(String[] args) throws FileNotFoundException{
    Graph bob = new Graph();

    File file = new File("graph1.dat");
    Scanner f = new Scanner(file);

    int numTimes = f.nextInt();
    f.nextLine();

    for(int i = 0; i < numTimes; i++) {
      String pointy = f.nextLine();
      //System.out.println("this is pointy: " + pointy);
      String whatToConnect = f.nextLine();
      //System.out.println("This is whatToConnect: " + whatToConnect);
      String[] points = pointy.split(" ");
      for(int j = 0; j < points.length; j++) {
        bob.addToMap(points[j]);
      }
      String[] connections = whatToConnect.split("");
      ArrayList<String> billy = new ArrayList<String>();
      if(bob.check(connections[0], connections[1], billy)) {
        System.out.println(connections[0] + " connects to " + connections[1] + " == yes");
      } else {
        System.out.println(connections[0] + " connects to " + connections[1] + " == no");
      }
    }

  }
}
