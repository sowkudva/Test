package challenges;

import java.util.Scanner;

public class numberRecursion {
	
	static int numRecursion(int num) {
		
		System.out.print(num+" ");
		if(num==1) {
			return 1;
		}
		
		else
		{
			return numRecursion(num-1);
		}
		
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			
			numRecursion(num);
			System.out.println(" ");
			
		}
	}
}
