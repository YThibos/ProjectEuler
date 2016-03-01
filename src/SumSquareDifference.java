
public class SumSquareDifference {
	

	public static void main(String[] args) {
		
		int sum = 0, sumOfSquares = 0, squareOfSums;
		
		for (int i = 1; i < 101; i++) {
			
			sumOfSquares += (i*i);
			sum += i;
			
		}
		
		squareOfSums = (sum*sum);
		
		System.out.print(squareOfSums - sumOfSquares);
		
	}

}
