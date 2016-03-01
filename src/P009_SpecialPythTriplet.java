
public class P009_SpecialPythTriplet {

	public static void main(String[] args) {
		
		quit: for (int a = 1; a <= 1000; a++) {
			for (int b = 1; b <= 1000; b++) {
				for (int c = 1; c <= 1000; c++) {
					
					if (a + b + c == 1000 && (a*a) + (b*b) == (c*c)) {
						System.out.print(a * b * c);
						break quit;
					}
					
				}
			}
		}
		

	}

}
