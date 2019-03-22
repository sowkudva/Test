//This program checks if the elemnts of the array are unique.

import java.util.Scanner;

public class Enigma {
	
	public static boolean assignment3(int a[],int n)
	{
		for (int i=0;i<n-2;i++)
		
			for(int j=i+1;j<n-1;j++)
			{
				if (a[i]==a[j])
						return false;
				
					
			}
		
		
				return true;
		
		
	}

	
	public static void main (String[] args)
	
	{
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int a[]= new int[n];
		for (int i=0;i<n;i++)
			a[i]=sc.nextInt();
		boolean res=assignment3(a,n);
		System.out.println(res);
		
	}
}
