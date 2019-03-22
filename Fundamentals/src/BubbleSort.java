//Bubble sort algorithm implemented to code
public class BubbleSort {
	
	public static void sort(int a[])
	{
		int len = a.length;
		for (int i=0;i<len;i++)
			for (int j=len-1;j>i;j--)
			{
				if (a[j] < a[j-1])
						{
						int temp=a[j-1];
						a[j-1]=a[j];
						a[j]=temp;
						}
			}
		
	}
	public static void printArray(int arry[])
	{   int n = arry.length;
	System.out.println("Sorted array is :");
		for (int i=0;i<n;i++)
		{
			
			System.out.println(arry[i]);
		}
			
	}
	
public static void main (String[] args)
{
	int a[]= {1,3,2,9,3,7,8,11,26,0,-1};
	
	sort(a);
	printArray(a);
	
}

}
