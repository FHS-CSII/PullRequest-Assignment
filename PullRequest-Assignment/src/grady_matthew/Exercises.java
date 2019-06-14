/**
 * @author Matthew Grady
*/

package grady_matthew;

public class Exercises 
{
	static int threeAndFive()
	{
		int sum = 0;
		
		for (int x = 0; x < 1000; x ++)
		{
			if (x % 3 == 0) // if multiple of 3
			{
				sum = sum + x;
			}
			
			if (x % 5 == 0) // If multiple of 5
			{
				sum = sum + x;
			}
		}
		return sum;
	}
	
	static int evenFibSum()
	{
		int sum = 2, n1 = 1, n2 = 2, n = 0;

        while(n<4000000)
        {
            n=n1+n2; // Adds two terms together
            n1=n2; // sets n1 to the next term
            n2=n; // sets n2 to the next number the the sequence
            
            if(n%2==0) // Figures out if even or ot not
            {
                sum=sum+n;
            }
        }
        return sum;
	}
	
	static int largestPrimeFactor()
	{
        long num = 600851475143L;
        boolean isPrime = true;
        int highestNumber = 0;

        for (int i = 2; i < num; i++) 
        {
            if (num % i == 0) 
            {
                for (int j = 2; j < i; j++) 
                {
                    if (i % j == 0) 
                    {
                        isPrime = false;
                    }
                }
                if (isPrime) {

                    highestNumber = i;
                }
            }   
        }
        return highestNumber;
	}
}