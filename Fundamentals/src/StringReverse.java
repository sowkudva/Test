import java.util.Scanner;

public class StringReverse {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		char[] mychar=s.toCharArray();
		
		for (int i=mychar.length-1;i>=0;i--) {
			System.out.print(mychar[i]);
		}
		
	}

}
