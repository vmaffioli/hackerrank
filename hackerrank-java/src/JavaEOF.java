import java.io.*;
import java.util.*;

public class JavaEOF {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i > 0; i=i+0) {

			if (sc.hasNext()) {
				System.out.println(i + " " + sc.nextLine());
				i++;
			} else {
				i=-100;
			}
		}
	}

}
