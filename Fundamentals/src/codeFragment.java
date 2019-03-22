import java.util.Scanner;

public class codeFragment {

public static void main (String args[])	
	
{
	double t = 9.0;
	 // System.out.println(t1);
	  
	  while((Math.abs(t - 9.0/t) > .001))
			  {
	  t = (9.0/t + t) / 2.0;
	  System.out.printf("%.5f", t);
	  

}
	  System.out.println('b');
		System.out.println('b' + 'c');
		System.out.println((char) ('a' + 4));
		
		System.out.println("ENTER THE NUMBER");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		//String s = Integer.toBinaryString(n);
		String s = "";
	    for (int i = n; i > 0; i /= 2)
	     s = (i % 2) + s;
		System.out.println("the entered number binary string is"+s);
		int[] a= new int[10];
	
		for (int i = 0; i < 10; i++)
		{
			a[i] = i * i;
		System.out.println(a[i]);
		System.out.println(a.length);
		}
}
}


