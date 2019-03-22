//program to left rotate the array by given number of elements
//eg a={1,2,3,4,5,6}
//after left rotation by 2 elements a={3,4,5,6,1,2}

public class leftRotate {
	
	void dorotate(int a[],int d)
	{
		int lenght=a.length;
		for (int i=0;i<d;i++)
			rotate(a,lenght);
		printArray(a,lenght);
	}
	
	void rotate(int a[],int l)
	
	{
		int i, temp;
		temp=a[0];
		for (i=0; i<l-1;i++)
			a[i]=a[i+1];
		a[i]=temp;
			
		
	}
	
	void printArray(int a[], int l)
	{
		System.out.println("Array after rotation");
		for (int i=0;i<l;i++)
			System.out.println(" "+a[i]);
	}


public static void main (String[] args)
{
	int a[]= {1,2,3,4,5,6,7,8};
	
	int numOfrot=2;
	leftRotate rot= new leftRotate();
	rot.dorotate(a,3);
	
}
}