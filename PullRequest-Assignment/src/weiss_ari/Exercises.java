/**
 * @author Ari Weiss
 */
package weiss_ari;

import java.util.LinkedList;
import java.lang.Math;

public class Exercises
{
	static int threeAndFive()
	{
		int sum = 0;
		
		for(int i = 0; i < 1000; i++)
		{
			if(i % 3 == 0)
				sum += i;
			else if(i % 5 == 0)
				sum += i;
		}
		
		return sum;
	}
	
	static int evenFibSum()
	{
		int returnVal = 0;
		int n_1 = 0, n_2 = 0;
		double sqrt5 = 0.0;
		LinkedList<Integer> fib = new LinkedList<Integer>();
		for(int i = 0, n = 1; i < 4000000; n++)
		{
			if(n == 1)
			{
				n_1 = 1;
				n_2 = 1;
			}
			else
			{
				i = n_1 + n_2;
			}
			n_1 = n_2;
			n_2 = i;
			if(i % 2 == 0 && !(i == 0))
			{
				fib.add(new Integer(i));
			}
		}
		
		for(int i = 0; i < fib.size(); i++)
		{
			returnVal += fib.get(i);
		}
		return returnVal;
	}
	
	static int largestPrimeFactor()
	{
		long number = 600851475143L;
		long returnVal = 0L;
		LinkedList<Integer> multiplesOf24plusOne = new LinkedList<Integer>();
		for(int i = 0; i < number; i++)
		{
			multiplesOf24plusOne.add(new Integer((24 * i) + 1));
		}
		
		long prev = 0L;
		for(int i = 0; i < number; i++)
		{
			if(multiplesOf24plusOne.contains(((int) Math.pow(i,  2))))
			{
				if(number % prev == 0)
				{
					prev = i;
				}
			}
		}
		returnVal = prev;
		return (int) returnVal;
	}
	
}
