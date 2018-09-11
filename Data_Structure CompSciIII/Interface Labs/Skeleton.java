//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Skeleton implements Monster
{
	//add instance variables
  String name;
  int size;

	//add a constructor
  public Skeleton (String skelName, int skelSize) {
      name = skelName;
      size = skelSize;
  }
	//add code to implement the Monster interface
    public int getHowBig() {
      return size;
    }
    public String getName() {
      return name;
    }
    public boolean isBigger(Monster other) {

    }
    public boolean isSmaller(Monster other) {

    }
    public boolean namesTheSame(Monster other) {

    }

	//add a toString
}
