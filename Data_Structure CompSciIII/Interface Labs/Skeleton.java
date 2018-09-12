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
      if(this.getHowBig() > other.getHowBig()) {
          out.println("Monster one is bigger than Monster two.");
          return true;
      }
      return false;
    }
    public boolean isSmaller(Monster other) {
      if( this.getHowBig() < other.getHowBig()) {

        return true;
      }
      return false;
    }
    public boolean namesTheSame(Monster other) {
      if(this.getName().equals(other.getName())) {

        return true;
      } else{

        return false;
      }
    }

	//add a toString
    public String toString(){
      return getName() + " " + getHowBig();
    }
}
