import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SocMerchant {

	
	public static void main(String[] args)
	{
		

	
	        Scanner in = new Scanner(System.in);
	        int n=in.nextInt();
	        //based on the constraints the elements are not more than 100.
	        //Hence created an array of 100
	        int[] array = new int[101];
	        //accept the next line of integers are the array indexes, and increment by 1 
	        //array 0	1	2	3	4	5	6	7	8	9	10
	        //		0	0	1	1	2	2.....................
	        for(int i=0; i<n; i++){
	            array[in.nextInt()]++;
	        }
	        
	       // set counter to 0
	        long ans=0;
	        
	        for (int i=0;i<array.length;i++)
	        {
	        	//here divide the elements of array by 2
	        	if((array[i]/2)!=0)
	        	{
	        		//if its more than 2 then add the quotient to the count.
	        		int c=array[i]/2;
	        		ans+=c;
	        	}
	        }
	        //this would give us the count of pairs.
	        System.out.println(ans);
	}
}
	
