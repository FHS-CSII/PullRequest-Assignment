/**
 * @author Ashley Lashenick
 */

package lashenick_ashley;

import java.util.ArrayList;

public class Excercises 
{
	//Returns the sum of all the multiples of 3 or 5 below 1000
	public static int threeAndFive()
	{
		int sum = 0, multiple = 0, i = 1;
		while(multiple < 1000)
		{
			multiple = 3 * i;
			if(multiple < 1000)
					sum += multiple;
			
			i++;
		}
		
		i = 1;
		multiple = 0;
		
		while(multiple < 1000)
		{
			multiple = 5 * i;
			
			if(multiple < 1000 && !(multiple%3 == 0))
					sum += multiple;
			
			i++;
		}
		
		return sum;
	}
	
	//Returns the sum of the even-valued terms less than 4 million in the Fibonacci Sequence
	public static int evenFibSum()
	{
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(0);
		nums.add(1);
		
		int i = 1, num = 0, sum = 0;
		
		while(num < 4000000)
		{
			num = nums.get(i) + nums.get(i - 1);
			if (num < 4000000) //Adds to array if the term is less than 4 million and even
				nums.add(num);
			i++;
		}
		
		for(i = 0; i < nums.size(); i++)
		{
			if(nums.get(i) % 2 == 0)
				sum += nums.get(i);
		}
		
		return sum;
	}
	
	//Returns the largest prime factor of the number 600851475143
	public static long largestPrimeFactor()
	{
		long total = 600851475143L, num = 0L, i = 1L;
		boolean prime = false;
		
		 while(!prime)
		 {
			 if(num != 0 && total / num == 0)
			 {
				 int check = 2;
				 while(check < num && !(num%check == 0))
				 {
					 check++;
				 }
				 
				 if (check == num - 1)
					 prime = true;
			 }
		 }
		 
		 return num;
	}
}
