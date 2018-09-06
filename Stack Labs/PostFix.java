import java.util.Stack;
import java.util.*;
import java.lang.NumberFormatException;
public class PostFix {
  Stack<Integer> nums = new Stack<Integer>();
  public int solvePost(String[] arr) throws NumberFormatException{
    String numbers = "0123456789";
    int result = 0;
    int solved;
    for(int i = 0; i < arr.length; i++) {
      if(nums.size() > 0){
      if(numbers.indexOf(arr[i]) > -1) {
        nums.push(Integer.parseInt(arr[i]));
    } else if(arr[i].equals("+")) {
        result = nums.pop() + nums.pop();
        nums.push(result);
    } else if(arr[i].equals("-")){
        result = nums.pop() - nums.pop();
    } else if(arr[i].equals("*")) {
        result = nums.pop() * nums.pop();
    } else if(arr[i].equals("/")) {
        result = nums.pop() / nums.pop();
    }
    }

    }
    solved = nums.pop();
    return solved;
  }
}
