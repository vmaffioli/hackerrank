import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaCurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        
        String[] data = {"en", "en", "zh", "fr", "US", "IN", "CN", "FR", "US: ", "India: ", "China: ", "France: "};
        
        for(int i=0;i<data.length/3;i++) {
            Locale xLocale = new Locale(data[i], data[i+4]);
            NumberFormat xFormat = NumberFormat.getCurrencyInstance(xLocale);
            String result = xFormat.format(payment);
            
            System.out.println(data[i+8] + result);

        }

    }
}