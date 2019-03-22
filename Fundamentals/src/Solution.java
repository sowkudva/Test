import java.util.Scanner;

public class Solution {

	
	public static void main (String[] args)
	{
		int A_score=0;
		int B_score=0;
		int[] a = new int[3];
		int[] b = new int[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			a[i]=sc.nextInt();
		}
//		 a[0]=sc.nextInt();
//		 a[1]=sc.nextInt();
//		 a[2]=sc.nextInt();
//		 b[0]=sc.nextInt();
//		 b[1]=sc.nextInt();
//		 b[2]=sc.nextInt();
		for(int i=0;i<3;i++)
		{
			b[i]=sc.nextInt();
		}
		
		for (int i=0;i<3;i++)
		{
			if (a[i]==b[i])
			{
				B_score=B_score;
				A_score=A_score;
			}
			else if (a[i]<b[i])
			{
				B_score++;
			}
			else 
				A_score++;
		}
		
		System.out.println(A_score+" "+B_score);
		
		
		
	}
}
