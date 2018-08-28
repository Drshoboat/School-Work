//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Brian Culpepper
//Date -9/20/17

public class RayFirst
{
	public static boolean go(int[] ray)
	{
   if(ray.length == 0)
      return false;
   int val = ray[0];
   for(int spot = 1;spot <ray.length;spot++)
	{
      if(val == ray[spot])
      return true;
   
   }
   return false;
	}
}