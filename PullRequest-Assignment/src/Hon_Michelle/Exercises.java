/**
 * @author Michelle Hon //include this tag in your classes with your name
 * 
 * 	- Create the following static methods:
 * 		- int threeAndFive() : Returns the sum of all the multiples of 3 or 5 below 1000
 * 		- int evenFibSum() : Returns the sum of the even-valued terms less than 4 million in the Fibonacci Sequence
 * 		- int largestPrimeFactor() : Returns the largest prime factor of the number 600851475143
*/
package Hon_Michelle;

public class Exercises {
	
	static public int threeAndFive()
	{
		int sum = 0;
		int i = 3;
		while(i < 1000)
		{
			if((i % 3 == 0) || (i % 5 == 0))
			{
				sum += i;
			}
			i++;
		}
		return sum;
	}
	
	static public int evenFibSum() 
	{
		int num1 = 1, num2 = 1;
		int sum = 0;
		while(num2 < 4000000)
		{
			int temp = num1;
			num1 = num2;
			num2 = temp + num1;
			
			if (num2 % 2 == 0)
				sum += num2;
		}
		return sum;
	}
	
	static public long largestPrimeFactor()
	{
		long num = 600851475143L;
		long lpf = 0;
			while(num % 2 == 0)
			{
				lpf = 2;
				num = num/2;
			}
			for(int i = 3; i <= Math.sqrt(num); i+=2)
			{
				if(num % i == 0)
				{
					lpf = i;
					num = num/i;
				}
			}
			
			if (num > 2) 
		        lpf = num;
			
		return lpf;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(evenFibSum());
	}

}
