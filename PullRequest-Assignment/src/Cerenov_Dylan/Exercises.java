/**
 * @author Dylan Cerenov
 */
package Cerenov_Dylan;

public class Exercises 
{
	public int threeAndFive()
	{
		int returnVal = 0;
		for (int i = 0; i < 1000; i++)
		{
			if (i % 3 == 0 || i % 5 == 0)
				returnVal = returnVal + i;
		}
		return returnVal;
	}
	
	public int evenFibSum()
	{
		int sum = 0;
		int last = 1, last2 = 0;
		while (last < 4000000)
		{
			if (last % 2 == 0)
				sum += last;
			int temp = last2;
			last2 = last;
			last = last + temp;
		}
		return sum;
	}
	
	public int largestPrimeFactor()
	{
		long n = 600851475143L;
		int k = 2;
		long returnVal = -1;
		while (n > 1)
		{
			while (n % k == 0)
			{
				returnVal = k;
				n = n / k;
			}
			if (k > 2)
				k = k + 2;
			else
				k = 3;
		}
		return (int) returnVal;
	}
}
