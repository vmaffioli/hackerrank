import java.io.*;
import java.util.*;

public class JavaStringReverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */

		String result = "Yes";
		for (int i = 0, ii = A.length() - 1; i < A.length() && ii >= 0; i++, ii--) {

			if (A.charAt(i) != A.charAt(ii)) {
				result = "No";
			}

		}
		
		System.out.println(result);
	}
}