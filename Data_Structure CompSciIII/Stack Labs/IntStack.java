import java.util.*;
class IntStack
{
   //pick your storage for the stack
   //you can use the an array or an ArrayList

   //option 1
   private int[] rayOfInts;
   private int numInts;

   //option 2
   private ArrayList<Integer> intList = new ArrayList<Integer>();

   public IntStack(){

   }

   public void push(int item){
     intList.add(item);
   }

   public int pop(){
	    return intList.remove(intList.size()-1);
   }

   public boolean isEmpty(){
 	   if(intList.size() > 0) {
       return false;
     } else {
       return true;
     }
   }

   public int peek(){
	    return intList.get(intList.size()-1);
   }

   public String toString(){
	return intList.toString();
   }
}
