
public class SmallestMultiple {

	public static void main(String[] args) {
	
		int x[] = {2, 3 , 5, 7, 11, 13, 17, 19};	// priemgetallen tussen 1 en 20
		
		// zoek de hoogste macht van elk priemgetal < 20
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " wordt ");
			while (x[i]*x[i] < 20) {
				x[i] *= x[i];
			}
			System.out.println(x[i]);
		}

		long smallest = 1;
		
		for (int i = 0; i < x.length; i++) {
			smallest *= x[i];
		}

		System.out.print(smallest);
		
	}
}
