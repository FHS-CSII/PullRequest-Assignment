package patel_shivam;

import java.util.ArrayList;

/**
 * @author Shivam Patel
 *
 *   Assignment Instructions:
 *   	- Right click on the src folder and create a new package.
 *   	- Name the package "lastName_firstName", replacing lastName with your last name and firstName with your first name.
 *   	- Inside that package, create a new class "Exercises".
 *      - YOU SHOULD ONLY BE MAKING CHANGES IN THIS PACKAGE
 *   	- Create a javadoc comment at the top with the '@author' tag with your name next to it (do this for all classes you create)
 *   	- Create the following static methods:
 *   		- int threeAndFive() : Returns the sum of all the multiples of 3 or 5 below 1000
 *   		- int evenFibSum() : Returns the sum of the even-valued terms less than 4 million in the Fibonacci Sequence
 *   		- int largestPrimeFactor() : Returns the largest prime factor of the number 600851475143
 *   	- Create a separate Driver class and test your program by outputting the answers to your static methods
 *
 *   Submission Instructions:
 *    - Save your saved work on Eclipse - your workspace should be the file location of the cloned repo
 *    - In GitHub Desktop, add your summary and commit your changes
 *    - Then push your commits to GitHub
 *    - Go to your repo on GitHub.com
 *    - Click "New pull request"
 *    - Click "Create pull request"
 *    - In the summary for your request, put your first and last name
 *    - Send the request
 *
 *
 */
public class Exercises
{
    public static int threeAndFive()
    {
        int retval = 0;

        for(int i = 0; i < 1000; i++)
        {
            if(i % 5 == 0 || i % 3 == 0)
                retval += i;
        }


        return retval;
    }

    public static int evenFibSum()
    {
        int val = 0;

        int num1 = 1;
        int num2 = 1;


        while(num2 < 4000000)
        {


            num1 += num2;
            num2 += num1;

            if(num1 % 2 ==0)
                val += num1;
            else if (num2 % 2 == 0)
                val += num2;
        }

        return val;

    }

    public static int largestPrimeFactor()
    {
        int retval = 0;

        long num = 600851475143L;

        for(long i = num; i > 0L; i++)
        {
            if(num % i == 0 && isPrime(i))
                retval = (int)i;
            //System.out.println(retval);
        }

        return retval;
    }

    public static boolean isPrime(long num)
    {
        boolean retval = true;

        for(long i = num - 1; i > 1L; i++) {
            if (num % i == 0)
            {
                retval = false;
                break;
            }

            System.out.println(i);
        }

        return retval;


    }



}
