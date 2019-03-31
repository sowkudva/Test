package challenges;

import java.util.Scanner;

public class arrayDay6 {
	
	static void printReverse(int[] arr) {
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		int[] arr = new int[n];
		
		String[] arrItems=sc.nextLine().split(" ");
		sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		
	
		
		for(int i=0;i<n;i++) {
			int arrItemInt= Integer.parseInt(arrItems[i]);
		
				arr[i]=arrItemInt;
				
	}

		printReverse(arr);
}
}