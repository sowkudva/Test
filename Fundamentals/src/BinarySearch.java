import java.util.Scanner;

public class BinarySearch {
	
	public static int binarySearch(int arr[], int l, int r, int x) 
	{ 
		
		if (r>=1)
		{
			int mid=(l+(r-1))/2;
			System.out.println("middle point is "+mid);
			
			//very important condition
		if (arr[mid]== x)
			return mid;
		if (x <arr[mid])
			return binarySearch(arr,  l,  mid-1,  x);
		
		if(x>arr[mid])
			return binarySearch(arr,  mid+1,  r,  x);
		
		
		}
		return -1;
	}
	public static void main (String[] args)
	{
		int len;
		
		int ele ;
		System.out.println("Enter the number of elements in the array");
		Scanner sc= new Scanner(System.in);
		len=sc.nextInt();
		int a[]=new int[len];
		System.out.println("Enter the array elements");
		for(int i=0;i<len;i++)
			a[i]=sc.nextInt();
		System.out.println("Enter the element to be serached");
		ele=sc.nextInt();
		
		int index=binarySearch(a,0,len,ele);
		if (index==-1)
			System.out.println("Element not found");
		else
		System.out.println("Element " +ele +" is found at index "+index +" in the given array");
	}
}
