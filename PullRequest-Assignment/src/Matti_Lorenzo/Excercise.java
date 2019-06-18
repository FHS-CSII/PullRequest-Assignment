/**
 * @author Lorenzo Matti
 */

package Matti_Lorenzo;

public class Excercise {

	public int threeAndFive(){
		int j = 0;
		for (int i = 0; i< 1000; i++){
			if (i%3==0||i%5==0)
				j+=i;
		}
		return j;
	}

	public int evenFibSum(){
		int sum = 2;
		int num1 = 1; 
		int num2 = 2;
		int num = 0;

		while (num < 4000000){
			num = num1 + num2;
			num1=num2;
			num2=num;
			if(num%2==0){
				sum=sum+num;
			}
		}
		return sum;
	}

	public int largestPrimeFactor(){
		int i;
		long number = 600851475143L;

		for (i = 2; i <= number; i++) {
			if (number % i == 0) {
				number /= i;
				i--;
			}
		}
		return i;
	}
}