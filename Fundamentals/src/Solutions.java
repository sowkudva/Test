import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solutions {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
       
       int i2=scan.nextInt();
       double d2=scan.nextDouble();
       //This is to clear the keyboard buffer.
       //nextLine reads from the end of the last read and the beginning of the next line.
       scan.nextLine();
       String s3=scan.nextLine();
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */
System.out.println(i+i2);


        /* Print the sum of the double variables on a new line. */
		System.out.println(d+d2);
        /* Concatenate and print the String variables on a new line; */
        System.out.println(s+" "+s3);
        	/*the 's' variable above should be printed first. */

        scan.close();
    }
}

