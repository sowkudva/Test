import java.util.InputMismatchException;

public class NumReverse {

	static long reverse(long x) {
		long rev=0;
			while(x !=0) {
				if ((x > 0 && rev > Integer.MAX_VALUE )|| (x < 0 && rev < Integer.MIN_VALUE)) {
					return 0;
					}
				rev= rev*10+x%10;
				
				x=x/10;
				
		}
			
		return rev;
	}
	
	public static void main(String[] args) {
		try{
			int num=2000000075;
			System.out.println("reverse of num is "+reverse(num));
			
		}
		catch(InputMismatchException exception){
			  System.out.println("This is not an integer");
			}
		
	}
}
