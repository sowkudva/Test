//This program counts the number of times the given element is present in the given boundary

import java.util.Scanner;

public class HowManyX {
	
	public static int numcount(int l, int u, int x)
	{
		int counter=0;
		for (int i=l+1;i<u;i++)
			{
			//very important step
			int temp=i;
			 while(temp>0)
			 {
				if((temp%10)==x)
					counter++;
				temp=temp/10;
			  }
			 
			}	
		
		return counter;
		
	}
	
	public static void main (String[] args)
	{
		int X,N,UB,LB;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of TC's");
		N=sc.nextInt();
		for (int i=0;i<N;i++)
		{
		System.out.println("Enter the number to be counted");
		
		X=sc.nextInt();
		
		System.out.println("Enter UB and LB");
		
			LB=sc.nextInt();
			UB=sc.nextInt();
			
		
		int count=numcount(LB,UB,X);
		if (count==0)
			System.out.println("Provided element is not found in the range of elements");
		else
		System.out.println("Element " +X +" is found "+count +" number of times");
	}
	}
}
