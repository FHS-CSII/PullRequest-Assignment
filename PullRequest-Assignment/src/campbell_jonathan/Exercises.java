//@author Jonathan Campbell

package campbell_jonathan;

public class Exercises 
{
	public static int threeAndFive()
	{
		int sum = 0;
		for(int i = 0; i < 1000; i++)
			if(i % 3 == 0 || i % 5 == 0) {sum += i;}
		return sum;
	}
	
	public static int evenFibSum()
	{
		int last = 1;
		int fib = 1;
		int sum = 0;
		int temp;
		
		while(fib < 4000000)
		{
			if(fib % 2 == 0)
				sum += fib;
			
			temp = fib;
			fib += last;
			last = temp;
		}
		
		return sum;
	}
	
	public static int largestPrimeFactor()
	{
		double num = 600851475143.0;
		int factor;
		
		for(factor = 2; factor < num; factor++)
			if(num % factor == 0)
			{
				num /= factor;
				factor--;
			}
		
		return (int) factor;
	}
}
