import java.util.Scanner;

public class JavaSubstringComparisons {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'

		for (int i = 0; i < s.length(); i++) {
			if (i == 0) {
				smallest = s.substring(i, k); 
				largest = s.substring(i, k);

			} else {
				if (i + k <= s.length()) {
					if (smallest.compareTo(s.substring(i, k + i)) > 0) {
						smallest = s.substring(i, k+i);
					}
					if (largest.compareTo(s.substring(i, k + i)) < 0) {
						largest = s.substring(i, k+i);
					}
				}
			}
		}
		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}
