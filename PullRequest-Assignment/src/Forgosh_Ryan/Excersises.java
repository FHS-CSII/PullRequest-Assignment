/*
@author Ryan Forgosh


*/

package Forgosh_Ryan;
import java.util.ArrayList;
public class Excersises 
{
	public static int threeAndFive()
	{
		int sum = 0;
		for (int i = 1; i <= 1000; i++)
		{
			if (i % 3 == 0 || i % 5 == 0)
				sum += i;
		}
		return sum;
	}
	
	public static int evenFibSum()
	{
		ArrayList<Integer> fib = new ArrayList<Integer>();
		int limit = 4000000;
		long one = 0; //first even number in the sequence
		long two = 2; // second even number in the sequence
		long sum = one + two;
		
		while (two <= limit)
		{
			long three = 4 * two + one;
			
			if (three > limit)
				break;
			
			one = two;
			two = three;
			sum += two;
		}
		
		return (int) sum;
	}
	
	public static int largestPrimeFactor()
	{
		long number = 600851475143L;
		long maxPrime = -1;
		
		while (number % 2 == 0)
		{
			maxPrime = 2;
			number /= 2;
		}
		
		for (int i = 3; i < Math.sqrt(number); i += 2)
		{
			while (number % i == 0)
			{
				maxPrime = i;
				number /= i;
			}
		}
		if (number > 2)
			maxPrime = number;
		return (int) maxPrime;
	}
}
