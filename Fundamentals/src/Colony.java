//this program is from Amazon internship demo.
//Given an array of elements with 1 0 terms, the program calculates the output by considering the state of the neighbouring cell
//eg, 1 0 1 0 --> ele 1 is surrounded by neighbor 0 on one side. Assume 0 on the other side. Since both are 0, cell state for el 1 = 0


import java.util.Arrays;
import java.util.Scanner;


public class Colony
{
 static int cells[]= new int[8];
 static int day ;

  
  public static int[] cellCompete(int[] cells, int days)
  {
	  
	  int out[]=new int[8];
	  int i;
	  int len=cells.length;
	  
	  for (int j=0; j<days;j++)
	  {
	  if (( cells[1]==0) )
		out[0]=0;
	  
	  else if (cells[1]==1)
		  out[0]=1;
	  
	  if ((cells[6]==0))
			out[7]=0;
		  
		  else if (cells[6]==1)
			  out[7]=1;
	
	  for  (i=0;i<len-2;i++)
	{ 	
		
		if (cells[i] != cells[i+2])
			out[i+1]=1;
		else 
			out[i+1]=0;
	}
	  cells=out;
	  System.out.println("This is after copying out to cells");
	  printArray(cells);
	  }
	 
	  cellCompete(cells,day);
	 return cells;
  }
  
  public static void printArray(int arr[]){

      int n = arr.length;

      for (int i = 0; i < n; i++) {
          System.out.print(arr[i] + " ");
      }
  
}
  
  public static void main (String[] args)
  {
	  int[] finalarray;
	  System.out.print("Enter the day");
	  Scanner sc = new Scanner(System.in);
	 
	  day=sc.nextInt();
	  System.out.println("Enter the elements of array ");
	  

      for (int i = 0 ; i < cells.length; i++ ) {
         cells[i] = sc.nextInt();
      }
      printArray(cells);
      finalarray=cellCompete(cells,day);
      
      
	  System.out.println("Modified array is");
	  printArray(finalarray);
  }
   
}