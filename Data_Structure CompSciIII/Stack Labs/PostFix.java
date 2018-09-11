import java.util.Stack;
import java.util.*;
import java.lang.NumberFormatException;
public class PostFix {
  Stack<Float> nums = new Stack<Float>();
  public float solvePost(String[] arr) throws NumberFormatException{
    String numbers = "0123456789";
    float result = 0;
    nums.push(Float.parseFloat(arr[0]));
    for(int i = 1; i < arr.length; i++) {

      if(nums.size() > 0){
      //  float num1 = nums.pop();
        //float num2 = nums.pop();
      if(numbers.indexOf(arr[i]) > -1) {
        nums.push(Float.parseFloat(arr[i]));
        //System.out.println(nums.peek());
    } else if(arr[i].equals("+")) {
        result = nums.pop() + nums.pop();
        //System.out.println(result);
        nums.push(result);
    } else if(arr[i].equals("-")){
        float num1 = nums.pop();
        float num2 = nums.pop();
        result = num2 - num1;
        //System.out.println(result);
        nums.push(result);
    } else if(arr[i].equals("*")) {
        result = nums.pop() * nums.pop();
        //System.out.println(result);
        nums.push(result);
    } else if(arr[i].equals("/")) {
      float num1 = nums.pop();
      result = nums.pop() / num1;
        //System.out.println(result);
        nums.push(result);
    }
  }
    //nums.push(result);
    }
    return nums.pop();
  }
}
