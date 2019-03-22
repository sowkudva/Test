import java.util.Scanner;

public class exercise1 {
	
	public static void main (String args[])
	{
		Scanner in = new Scanner(System.in)
				;
		System.out.println("Enter the numbers");
		float x = in.nextFloat();
		float y =  in.nextFloat();
		in.close();
		boolean result =method1(x,y);
		System.out.println("The entered two numbers are "+x +" and " + y+"are between 0 and 1 "+ result);
	}
		
		
		
		public static boolean method1 (float x, float y)
		{
		
		if (( 0<x && x<1 ) && ( 0<y && y<1 ))
			return true;
		
		else
			return false;
	
			
			
	}
	

}
