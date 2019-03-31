import java.util.Scanner;

public class Multiples {
	
	static void multipleTable(int n)
	{
		for (int i=1;i<=10;i++)
		{
			System.out.println(n+" x "+i +"= "+n*i);
		}
	}

	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		multipleTable(n);
	}
}
