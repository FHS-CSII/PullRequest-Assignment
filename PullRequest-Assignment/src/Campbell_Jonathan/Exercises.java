//@author Jonathan Campbell

package Campbell_Jonathan;

public class Exercises 
{
	public int threeAndFive()
	{
		int sum = 0;
		for(int i = 0; i < 1000; i++)
			if(i % 3 == 0 || i % 5 == 0) {sum += i;}
		return sum;
	}
	
	public int evenFibSum()
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
	
	public int largestPrimeFactor()
	{
		double answer = 0;
		double num = 600851475143.0;
		double factor = 2;
		
		while(true)
		{
			factor++;
			num = num/factor;
			System.out.println("hey");
			for(double i = num - 1; i > 1; i-= 1)
			{
				if(i % num == 0)
					break;
				else if(num == 2)
				{
					answer = num;
					break;
				}
			}
			if(answer != 0)
				break;
		}
		
		return (int) answer;
	}
}
