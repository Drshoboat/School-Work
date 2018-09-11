//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Brian Culpepper

public class Fibonacci
{
	//instance variable
  private long[] fibArr;
  
	//constructors
   public Fibonacci(int input)
   {
   fibArr = new long[input];

     setFibo(input);
   }
   
   
	//set method
   public void setFibo(int input)
   {
       fibArr = new long[input];
         
      fibArr[0] = 1;
      
        
      for(int i = 1; i<fibArr.length;i++)
      {
        if(i ==1){
         fibArr[1] = fibArr[0] + 0;
          
       } 
         if(i >1){
            fibArr[i] = fibArr[i-2] + fibArr[i-1];  
         }   
      }
      
   
   }
   

   
	//get method
   public long getFibo(int input)
   {
   if(input-1 < fibArr.length)
   {
   return fibArr[input-1];
   }
   return -1;
   }
    	//toString
   
}