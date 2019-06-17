/**
 * @author Abbi Bhatnagar
 */
package Bhatnagar_Abi;

import java.util.ArrayList;

public class Exercises
{
	public static int threeAndFive()
	{
		int sum = 0;
		for (int i = 0; i < 1000; i++) {if (i % 3 == 0 || i % 5 == 0) {sum += i;}}
		
		return sum;
	}
	
	public static int evenFibSum()
	{
		int sum = 0;
		ArrayList<Integer> fib = new ArrayList<Integer>();
		
		fib.add(1); fib.add(1);
		for (int i = 0; sum < 4000000; i++)
		{
			int temp = fib.get(i) + fib.get(i + 1);
			fib.add(temp);
			
			if (temp % 2 == 0) {sum += temp;}
		}
		
		return sum;
	}
	
	public static int largestPrimeFactor()
	{
		int biggest = 0;
		long num = 600851475143L;
		
        for (int i = 2; i <= num; i++)
        {
            while (num % i == 0)
            {
            	num /= i;
            	biggest = i;
            }
        }
        
		return biggest;
	}
	
	public static int largestPrimeFactor(int pi)
	{
		int biggest = 0;
		for (int i = 2; i < Math.ceil(600851475143.0/2); i++)
		{
			//System.out.println(i);
			if (600851475143.0 % i == 0 && isPrime(i)) {biggest = i;}
		}
		
		return biggest;
	}
	
    private static boolean isPrime(int num)
    {
        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0 && isPrime(i)) {return false;}
        }
        
        return true;
    }
}
