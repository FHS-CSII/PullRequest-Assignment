/**
 * @author Harry Allex
 */
package Allex_Harry;

import java.math.BigInteger;
import java.util.ArrayList;

public class Exercises
{
	public static int threeAndFive()
	{
		int x = 0, sum = 0;
		while (x < 1000)
		{
			if (x%3 == 0 || x % 5 == 0)
			{
				sum+=x;
			}
			x++;
		}
		return sum;
	}

	public static int evenFibSum()
	{
		int first = 1, second = 1, sum = 0;
		while(first < 4000000)
		{
			if(first % 2 == 0)
			{
				sum += first;
			}
			if(second % 2 == 0)
			{
				sum += second;
			}
			first = first + second;
			second = first + second;

		}
		return sum;
	}

	public static int largestPrimeFactor()
	{
		long largest = 600851475143L;
		long factor = 2;
		while(largest > factor)
		{
			if(largest % factor == 0)
			{
				largest = largest/factor;
				factor = 2;
			}
			else
				factor++;
		}
		return (int)largest;
	}
}
