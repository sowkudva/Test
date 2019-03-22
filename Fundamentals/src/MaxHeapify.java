
public class MaxHeapify {
	
	public static int[] Heapify(int[] array, int i,int n)
	{
		int l=2*i+1; //1
		int r=2*i+2; //2
		int largest=i; //0
		
		if(l<n && array[l]> array[i])
		
			largest=l;
		else
			largest=i;
		if(r<n && array[r]>array[largest])
			largest=r;
		if(largest != i)
			
		{
			int temp=array[largest];
			array[largest]=array[i];
			array[i]=temp;
			Heapify(array, largest, n); 
		}
		return array;
	}
	
	public static int ExtractMax(int[] array, int n,int i)
	{
		int max=0;
		if (n<1)
			System.out.println("Heap undeflow");
			else
			{
				max=array[i];
				array[i]=array[n-1];
				Heapify(array,i,n-1);
				
			
			}
		return max;
			
	}
	public static int[] IncreaseKey(int[] array,int key, int i)
	{
		
		if (key <array[i])
				System.out.println("Key is less than the array element to be replaced");
				else
					array[i]=key;
					while(i>0 && array[i/2]< array[i])
					{
						int temp=array[i];
						array[i]=array[i/2];
						array[i/2]=temp;
						i=i/2;
					}
					return array;
					
	}
	public static int[] InsertKey(int[] array,int key)
	{
	        //define the new array
	        int[] newArray;
	        newArray=new int[array.length + 1];
	 
	        //copy values into new array
	        for(int s=0;s < array.length;s++)
	            newArray[s] = array[s];
	        
	        //newArray[newArray.length-1]=key;
	        
	        IncreaseKey(newArray,key,newArray.length-1);
		
	        return newArray;
	}
		
	
	static void printArray(int arr[], int size) 
    { 
        for (int i = 0; i < size; ++i) 
            System.out.print(arr[i]+" "); 
    } 
	
	public static void main (String[] args)
	
	{
		int[] array= {10, 14, 12,22,67,24,1,89,2};
		int n=array.length;
		System.out.print("\nHeap size : "+n); 
		//start from the largest non leaf
		//here the array is starting from 0 index hence the leaf nodes are from
		//(n/2). hence the largest non leaf node will be (n/2)-1 => (n-2)/2
		
		//BUILD-HEAP function
		for (int i =(n/2)-1; i >=0; i--) 
            Heapify(array, i, n); 
		
		System.out.print("\nMax Heap array : "); 
        printArray(array, n); 
        
        
        IncreaseKey(array,300,3);
        System.out.print("\nHeap after increasing key : "); 
        printArray(array, n); 
        

        array= InsertKey(array,500);
        System.out.print("\nHeap after new key insert: "); 
        printArray(array, array.length); 
        
        for (int i =0; i<1;i++)//n-1; i++) 
        {
        	//this is to extract the first max element of the array. Always 0 element is maximum
        int max=ExtractMax(array,n-i,0);
        System.out.print("\nmax element of Heap  : "+max);
        
        System.out.print("\nAfter Extracting max element from Heap : "); 
        printArray(array, n-(i+1));
        }
//        
         
        
		
	}

}

