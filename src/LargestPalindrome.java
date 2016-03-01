
public class LargestPalindrome {

	public static void main(String[] args) {
		
		int largest = 0, product;
		String word, reversed;
		
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				
				product = i * j;
				
				word = Integer.toString(product);
				reversed = new StringBuilder(word).reverse().toString();
				
				if ((word.compareTo(reversed) == 0) & product > largest) {
					largest = product;
					System.out.println(i + "*"+ j + "=" + product + "::" + word + " - larger palindrome");
				}
				
			}
		}
		
		System.out.println(largest);
		
	}

}
