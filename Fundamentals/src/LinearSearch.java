import java.util.Scanner;

public class LinearSearch {
	
	public static int search(int arr[], int ele, int len)
	{
		
		for(int i=0;i<len;i++)
		
			if(arr[i]==ele)
			{
				return i;
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
		
		int index=search(a,ele,len);
		if (index==-1)
			System.out.println("Element not found");
		else
		System.out.println("Element " +ele +" is found at index "+index +" in the given array");
	}
}
