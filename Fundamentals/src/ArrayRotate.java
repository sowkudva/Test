import java.util.Scanner;

public class ArrayRotate {
	
	static void rotate(int[] arr, int order) {
		
		for (int i=0;i<order;i++) {
			for(int j=arr.length-1;j>0;j--) {
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				
				
			}
		}
		
	}

	static void printArray(int[] arr) {
		
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int order =sc.nextInt();
		
		int[] arr= new int[n];
		
		for (int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
		}
		
		
		
		rotate(arr, order);
		printArray(arr);
		
	}
}
