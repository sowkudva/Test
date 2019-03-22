import java.util.Scanner;

public class Power {
	
	static int pow(int x, int n)
	{ 
		int s=1;
		while(n >0)
		{
			s=s*x;
			n--;
		}
		
		
		return s;
	}
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int x = sc.nextInt();
		int n= sc.nextInt();
		sc.close();
		int power=pow(x, n);
		System.out.println(power);
	}

}
