//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Brian Culpepper

public class FibonacciRunner
{
	public static void main(String args[])
	{
		Fibonacci fib = new Fibonacci(50);
		System.out.println(fib.getFibo(1));
		System.out.println(fib.getFibo(2));
		System.out.println(fib.getFibo(3));
		System.out.println(fib.getFibo(4));
		System.out.println(fib.getFibo(5));
		System.out.println(fib.getFibo(6));
		System.out.println(fib.getFibo(11));
		System.out.println(fib.getFibo(16));
		System.out.println(fib.getFibo(21));
		System.out.println(fib.getFibo(31));
		System.out.println(fib.getFibo(41));
		System.out.println(fib.getFibo(46));
		fib.setFibo(1);
		System.out.println(fib.getFibo(1));
		fib.setFibo(2);
		System.out.println(fib.getFibo(1));
		System.out.println(fib.getFibo(2));
		System.out.println(fib.getFibo(11));	
   }
}