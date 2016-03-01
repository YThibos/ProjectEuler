
import java.util.Arrays;

import basics.*;

public class P010_SummationOfPrimes {

	public static void main(String[] args) {

		final int BELOWVAL = 2000000;
		
		long sum = 0;
		
		int loopback = 0;
		
		boolean primes[] = new boolean[BELOWVAL];
		Arrays.fill(primes, true);
		
		for (int i = 2; i < Math.ceil(Math.sqrt(BELOWVAL)); i++) {
			//System.out.print("Testing" + i);
			if (primes[i] == true) {
				//System.out.println(" :: is prime. Eliminating multiples.");
				for (int j = i*i; j < BELOWVAL; j += i) {
					//System.out.print(j + " eliminated - ");
					/*if (++loopback == 5) {
						System.out.println();
						loopback = 0;
					}*/
					primes[j] = false;
				}
			}
		}
		
		for (int k = 2; k < BELOWVAL; k++) {
			if (primes[k] == true) sum += k;
		}

		System.out.println(sum);
		
	}

}