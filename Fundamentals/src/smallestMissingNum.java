import java.util.Arrays;
import java.util.Scanner;

public class smallestMissingNum {
	
	static int smallestMissedNum(int[] arr) {
		int missing=0;
		Arrays.sort(arr);
		
		
		for(int i=0;i<arr.length-1;i++)
		{
			
			if((arr[i+1]- arr[i])>1)
			{
				 missing= arr[i]+(arr[i+1]- arr[i]);
			}
			
		}
		return missing;
	}
	
	static void printArray(int[] arr) {
		
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n];
		
		for (int i=0;i<n;i++)
		{
			arr[i]= sc.nextInt();
		}
		
		printArray(arr);
		
		System.out.println(smallestMissedNum(arr));
	}

}
