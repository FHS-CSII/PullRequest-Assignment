// @author Sage Fusco
package fusco_sage;
public class Exercises 
{
	public static int threeAndFive()
	{
		int sum = 0;
		
		for(int i = 0; i < 1000; i++)
			if(i % 3 == 0 || i % 5 == 0)
				sum += i;

		return sum;
	}
	
	public static int evenFibSum()
	{
		int sum = 0, n1 = 1, n2 = 1;
		
		while(n2 <= 4000000)
		{
			n1 += n2;
			n2 += n1;
			
			if(n1 % 2 == 0)
				sum += n1;
			else if(n2 % 2 == 0)
				sum += n2;
		}
		
		return sum;
	}
	
	public static int largestPrimeFactor()
	{
		long num = 600851475143L;
		int factor = 0;
		
		return factor;
	}
}
