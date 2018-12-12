package SecretSantaProgram;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.lang.*;
public class SecretSantaProgram {

  public static ArrayList<String> peeps;
  public static HashMap<String ,String> santa;

  public static void main(String[] args) {
    Scanner name = new Scanner(System.in);
    peeps = new ArrayList<String>();
    for(int i = 0; i < 6; i++) {
      System.out.println("What's your name, Bucko?");
      peeps.add(name.next());
    }

    name.close();

    boolean notUrSelf = false;

    while(!notUrSelf) {
      giftTimeBois();
      notUrSelf = isUDiff();
      sendThemEmailsTimmy();
      
    }


  }

  public static void giftTimeBois() {
    //System.out.println("not stuck");
    santa = new HashMap<String, String>();
    //System.out.println(santa);
    ArrayList<String> timmythetemp = new ArrayList<String>(peeps);

    for(int i = 0; i < peeps.size(); i++) {
      santa.put(peeps.get(i), timmythetemp.remove(ThreadLocalRandom.current().nextInt(0, timmythetemp.size())));
    }
    //System.out.println(santa);
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

  public static void sendThemEmailsTimmy() {
    for(int i = 0; i < santa.size(); i++) {
      new SendEmail(peeps.get(i), santa.get(peeps.get(i)));
    }
  }

}
