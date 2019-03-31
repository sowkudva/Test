package challenges;

import java.util.Scanner;
//to find the nth ugliest number
public class UglyNum {
	
	static int uglyNum(int n) {
		
		int f2=1;
		int f3=1;
		int f5=1;
		
		int[] dp= new int[n+2];
		dp[1]=1;
		
		for(int i=2;i<=n;i++) {
			
			int mul_2= dp[f2]*2;
			int mul_3= dp[f3]*3;
			int mul_5= dp[f5]*5;
			
			int fina_dp= min(mul_2,mul_3,mul_5);
			
			dp[i]=fina_dp;
			
			if(fina_dp==mul_2)
				f2++;
			if(fina_dp== mul_3)
				f3++;
			if(fina_dp==mul_5)
				f5++;
			
		}
		for(int j=1;j<=n;j++) {
			System.out.print(dp[j]+" ");
		}
		return dp[n];
	}
	
	
	private static int min(int x, int y, int z) {
		int count =0;
		
		while(x !=0 && y!=0 && z!=0)
		{
			x--;
			y--;
			z--;
			count++;
		}
		return count;
	}


	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n =sc.nextInt();
		sc.close();
		System.out.println("The "+n+"th ugliest num is "+uglyNum(n));
		
	}

}
