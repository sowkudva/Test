import java.io.*;
import java.util.Scanner;

public class operators 
{
	
	public static void main (String args[])
	
	{
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter the numbers");
		
		int b =a.nextInt();
		int c= a.nextInt();
		int d= a.nextInt();
		System.out.println("you enetered :"+ b +" "+ c +" " + d);
			 
		
		
		if (b == c && b == d)
			{
			System.out.println("They are equal");
			}
		else 
		{
			if (b == c || c==d || b==d)
				System.out.println("Two numbers are equal");
			else
				System.out.println("None of the Numbers are not equal");
			
				
		}
		
			
			
		//System.out.println("result is " + ((1+2.236)/2);
		//System.out.println("result is " + ((1+2+3+4.0));
		//System.out.println("result is " +(4.1 >= 4);
		//System.out.println("result is " +(1 + 2 + "3");
		
		
		
				
	}
	
	
}
