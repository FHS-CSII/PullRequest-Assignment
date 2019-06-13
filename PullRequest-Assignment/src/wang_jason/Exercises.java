package wang_jason;

import java.util.ArrayList;

/**
 * @author Jason Wang
 **/
public class Exercises {
	public static int threeAndFive() {
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}

		return sum;
	}

	public static int evenFibSum() {
		int a = 1, b = 1;

		int sum = 0;
		while (a <= 4000000) {
			if (a % 2 == 0)
				sum = sum + a;
			int temp = a;
			a = b;
			b = temp + b;

		}

		return sum;

	}

	public static long largestPrimeFactor() {
		long N = 600851475143L;
        while (N % 2 == 0) {
            N /= 2;
        }
        for (long factor = 3; factor < N; factor += 2) {
            while (N % factor == 0 && factor < N) {
                N /= factor;
            }
        }
        return N;

	}

}
