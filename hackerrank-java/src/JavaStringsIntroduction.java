import java.io.*;
import java.util.*;

public class JavaStringsIntroduction {

    public static String lexiCompare(String str1,String str2){
    	if (str1.compareTo(str2)<0) {
        	return "No";
    	} else if (str1.compareTo(str2)>0) {
        	return "Yes";
    	} else {
    		return "No";
    	}
    };
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        System.out.println(A.length()+B.length());
        System.out.println(lexiCompare(A,B));
        System.out.println(A.substring(0,1).toUpperCase().concat(A.substring(1)) + " " + B.substring(0,1).toUpperCase().concat(B.substring(1)));
        
        
    }
}



