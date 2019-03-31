package challenges;

import java.util.Scanner;

public class recursionDay8 {
	
	 static int factorial(int n) {
		 
		 if(n==1) {
			 return 1;
		 }
		 
		 else
		 {
			 return (n*factorial(n-1));
		 }
		 
	 }
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.println(factorial(N));
	}

}
