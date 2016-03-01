
public class Prime10001 {
	
	static boolean isPrime(long p, long[] primes)
	{
	    long max = (long) Math.ceil(Math.sqrt(p));
	    for (long divisor : primes)
	    {
	        if (divisor > max) break;
	        if (p % divisor == 0) return false;
	    }
	    return true;
	}


	public static void main(String[] args) {
		
		int targetCount = 10001;
		int counter = 6;
		
		long primes[] = new long[targetCount];
		primes[0] = 2;
		primes[1] = 3;
		primes[2] = 5;
		primes[3] = 7;
		primes[4] = 11;
		primes[5] = 13;
		
		for (long x = primes[counter - 1] + 2; counter < targetCount; x += 2) {
			if (isPrime(x, primes)) primes[counter++] = x; 
		}

		System.out.println(primes[targetCount - 1]);
		
	}

}
