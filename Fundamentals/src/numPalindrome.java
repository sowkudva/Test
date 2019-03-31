
public class numPalindrome {
	
	static int checkPalindrome(int x) {
		
		int rev=0;
		while(x!=0) {
		rev=rev*10+x%10;
		x=x/10;
		}
 return rev;
	}
	
	
	public static void main (String[] args) {
		
		int num=1234321;
		
		if (num==checkPalindrome(num))
		{
			
				System.out.println("yes palindrome");
		}
			else
		{
				System.out.println("Not palindrome");
			}
		
		
	}

}
