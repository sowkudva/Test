import java.util.Scanner;

public class pages {
	
	static int pagesToturn(int n, int p) {
		
		int mid = (n+1)/2;
		
			
		if(p<mid)
			return p/2;
		else
				return ((n-p)/2);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n= sc.nextInt();
		int p=sc.nextInt();
		
		System.out.println(pagesToturn(n,p));
		
	}

}
