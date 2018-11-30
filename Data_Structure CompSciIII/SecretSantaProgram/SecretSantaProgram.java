import java.util.*;
import java.lang.*;
public class SecretSantaProgram {
  public static ArrayList<String> peeps;
  public static HashMap<String ,String> santa;
  public static void main(String[] args) {
    Scanner name = new Scanner(System.in);
    peeps = new ArrayList<String>();
    for(int i = 0; i <= 6; i++) {
      System.out.println("What's your name, Bucko?");
      peeps.add(name.next());
    }



    boolean notUrSelf = false;

    while(!notUrSelf) {
      giftTimeBois();
      notUrSelf = isUDiff();
    }


  }

  public static void giftTimeBois() {
    santa = new HashMap<String, String>();
    ArrayList<String> timmythetemp = new ArrayList<String>(peeps);

    for(int i = 0; i < peeps.size(); i++) {
      santa.put(peeps.get(i), timmythetemp.remove((int)Math.random() * timmythetemp.size()));
    }
  }

  public static boolean isUDiff() {
    for(int i = 0; i < santa.size(); i++) {
      String humans = peeps.get(i);

      if(humans.equals(santa.get(humans))) {
        return false;
      }
    }
    return true;
  }


}
