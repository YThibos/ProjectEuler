
public class EvenFibonacci {

	public static void main (String args[]) {
		
		int sum = 0;
		
		int val1 = 1;
		int val2 = 2;
		
		int temp;
		
		do {
			if (val2 % 2 == 0) sum += val2;
			temp = val2;
			val2 += val1;
			val1 = temp;
		} while (val2 < 4000000);
		
		System.out.println(sum);
	}
	
}
