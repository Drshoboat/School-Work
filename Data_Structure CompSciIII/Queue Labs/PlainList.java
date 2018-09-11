import java.util.Stack;
import java.util.Queue;
import java.util.*;
public class PlainList {
    Queue<String> q = new LinkedList<String>();
    Stack<String> stack = new Stack<String>();

    public void palinList(String str) {
      boolean palin = true;
        String[] arr = str.split(" ");
        while(palin){
          for(int i = 0; i < arr.length; i ++) {
              q.add(arr[i]);
              stack.push(arr[i]);
            }
            while(!q.isEmpty()){
              if(!(q.remove().equals(stack.pop()))) {
                palin = false;
              }

          }
          if(palin == true){
            System.out.println(str + " is a palinlist");
            palin = false;
          }else {
            System.out.println(str + " is not a palinlist");
          }
          palin = false;
      }

    }
}
