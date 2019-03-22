//program to cyclically rotate array
//eg a={1,2,3,4,5,6,7,8,9}
//after cyclic rotation a=[9,1,2,3,4,5,6,7,8}

public class cycleRotateArray {

	static void rotateCycle(int a[], int d)
	{
		int l= a.length;
		int temp=a[l-1];
		for (int i=l-1; i>0;i--)
			a[i]=a[i-1];
		a[0]=temp;
		printArray(a,l);	
				
	}
	
	static void printArray(int a[],int l)
	{
		System.out.println("After cyclic rotation ");
		for (int i=0;i<l;i++)
			System.out.println(" "+a[i]);
		
	}
	
	public static void main (String[] args)
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		
		int d=2;
		rotateCycle(a,d);
		
	}
	
}


