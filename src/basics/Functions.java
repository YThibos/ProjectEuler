package basics;

public class Functions {
	
	public static boolean isPrime (long p) {
		
		if (p % 2 == 0) return false;
		long max = (long) Math.ceil(Math.sqrt(p));
		for (long divisor = 3; divisor < max; divisor += 2) {
			if (p % divisor == 0) return false;
		}
		return true;
		
	}

}
