package Bhatt_Sahil;
public class Exercise 
{
	public static int threeAndFive()
	{
		int h = 0;
		for(int i=0; i<1000; i++){
			if(i%3==0 || i%5==0)
				h+=i;
		}
		return h;
	}
	
	
	public int evenFibSum()
	{
		int sum =2;
		int num1=1;
		int num2=2;
		int num=0;
		
		while (num<4000000){
			num=num1+num2;
			num1=num2;
			num2=num;
			if(num%2==0)
			{
				sum=sum+num;
			}
		}
		return sum;
	}

	public int largestPrimeFactor()
	{
		int i;
		long num=600851475143L;
		
		for (i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				num/=i;
				i--;
			}
		}
		return i;
	}
}
