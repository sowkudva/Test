import java.util.ArrayList;
import java.util.Arrays;

public class App {
	
	public static void main (String[] args)
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		//adding
		numbers.add(10);
		numbers.add(22);
		numbers.add(32);
		
		//retrieving
		//System.out.println( numbers.get(0));
		 
		int inarr1[] = {1, 2, 3}; 
	      int inarr2[] = {1, 2, 3};  
	      Object[] arr1 = {inarr1};  // arr1 contains only one element 
	      Object[] arr2 = {inarr2};  // arr2 also contains only one element 
	      Object[] outarr1 = {arr1}; // outarr1 contains only one element 
	      Object[] outarr2 = {arr2}; // outarr2 also contains only one element         
	      if (Arrays.deepEquals(outarr1, outarr2)) 
	          System.out.println("Same"); 
	      else
	          System.out.println("Not same"); 
		
	   // Another Java program to demonstrate 2-D jagged 
	   // array such that first row has 1 element, second 
	   // row has two elements and so on. 
	   
	   		int r = 5; 

	   		// Declaring 2-D array with 5 rows 
	   		int arr[][] = new int[r][]; 
	   		System.out.println("array length"+arr.length);
	   		// Creating a 2D array such that first row 
	   		// has 1 element, second row has two 
	   		// elements and so on. 
	   		for (int i=0; i<arr.length; i++) 
	   			arr[i] = new int[i+1]; 

	   		// Initializing array 
	   		int count = 0; 
	   		for (int i=0; i<arr.length; i++) 
	   			for(int j=0; j<arr[i].length; j++) 
	   				arr[i][j] = count++; 

	   		// Displaying the values of 2D Jagged array 
	   		System.out.println("Contents of 2D Jagged Array"); 
	   		for (int i=0; i<arr.length; i++) 
	   		{ 
	   			for (int j=0; j<arr[i].length; j++) 
	   				System.out.print(arr[i][j] + " "); 
	   			System.out.println(); 
	   		} 
	   	} 
	   

	

}
