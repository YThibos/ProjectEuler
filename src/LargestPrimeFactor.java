

public class LargestPrimeFactor {
	
	/*
	
	//checks whether an int is prime or not.
	static boolean isPrime(long n) {
	    //check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}


	public static void main (String args[]) {
		 
		long largest = 2;
		
		for (long i = 2; i < 600851475143L; i++) {
			if (isPrime(i)) largest = i;
			System.out.println("New largest prime: " + largest);
		}
	}
	*/
	
	public static void main (String args[]) {
		
	    long x=600851475143L;
	    long biggest=0L;
	    for(long i=2L; i<=x; i++){
	        for(long l=1L; l<=Math.sqrt(i); l++){
	            if(l%i==0){
	                break;
	            } else{
	                while(x%i==0){
	                    x=x/i;
	                    biggest =i;
	                }
	            }
	        }
	    }
	    System.out.println(biggest);
		
	}
}
