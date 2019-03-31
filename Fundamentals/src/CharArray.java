import java.util.Scanner;

public class CharArray {
	
	static void charMethod(char[] char1) {
		for (int j=0;j<char1.length;j++)
		{
			if(j%2==0)
			{
				System.out.print(char1[j]);
			}
			
		}
		System.out.print(" ");
		for(int k=0;k<char1.length;k++)
		{
			if(k%2 !=0)
			{
				System.out.print(char1[k]);
			}
		}
		System.out.println(" ");
		
	}

	
	public static void main (String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		char[] char1= {};
		for (int r=0;r<T;r++) {
			char1=sc.next().toCharArray();
			charMethod(char1);
		
		}
		
		
		
		
		}
		
	}

