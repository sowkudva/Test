import java.util.Arrays;

public class CountSortFromText {

	public static void countingSort(int[] A)
	{
		int max = Arrays.stream(A).max().getAsInt(); 
		System.out.println("Maximum is "+max);
		//max=9
        //int min = Arrays.stream(A).min().getAsInt(); 
        //min=0
        //int range=max-min+1;
        //System.out.println("range is "+range);
		int l=A.length;
		
		//output array of sorted order
		int Output[]=new int[l];
		
		//create a count array
		int count[]=new int[max+1];
		
		//count array	0	1	2	3	4	5	6	7	8	9  10	11	12....
		//    			0	0	0	0	0	0	0	0	0	0	0	0	0..
		
		//store the count of each character from array[] in count[] array
		for(int j=0;j<l;j++)
		{
			count[A[j]]++;
			System.out.println("checking point ===="+count[A[j]]);
			
		}
		//A[j] = 9	3	4	5	12
		//A[0]=9  count[9]=1; 
		//A[1]=3  count[3]=1
		//A[2]=4  count[4]=1;
		//A[3]=5  count[5]=1;
		//A[4]=12 count[12]=1;
		
		//count	0	1	2	3	4	5	6	7	8	9	10	11	12
		//value 0	0	0	1	1	1	0	0	0	1	0	0	1
		
		//change the count[i] now to contain actual position by adding up the previous to next element
		
		for (int k=1;k<count.length;k++)
		{
			count[k] += count[k-1];
		}
		
		
		
		//K	1	2	3	4	5	6	7	8	9
		//count[0]=0
		//count[1]=count[1]+count[0]= 0
		//count[2]=count[2]+count[1]= 0
		//count[3]=count[3]+count[2]=0+1=1
		//count[4]=count[4]+count[3]=1+1=2
		//count[5]=count[5]+count[4]=2+1=3
		//count[6]=count[6]+count[5]=3+0=3
		//count[7]=count[7]+count[6]=3+0=3
		//count[8]=count[8]+count[7]=3+0=3
		//count[9]=count[9]+count[8]=3+1=4
		//count[10]=count[10]+count[9]=4+0=4
		//count[11]=count[11]+count[10]=4+0=4
		//count[12]=count[12]+count[11]=4+1=5
		
		System.out.println("count array now is ");
		for (int k=0;k<count.length;k++)
			System.out.println(count[k]);
		
		//count	0	1	2	3	4	5	6	7	8	9	10	11	12
		//value 0	0	0	1	2	3	3	3	3	4	4	4	5
		
		//build the output array
		System.out.println("Output array now is ");
		for (int i = l-1; i>=0; i--) 
        { 
            Output[count[A[i]]-1] = A[i]; 
            System.out.println("this is the index of count refereed"+(A[i]));
            System.out.println(count[A[i]] +" is = "+Output[count[A[i]]-1]);
            count[A[i]]--; 
        } 
		//A[6]=5 =>A[4]-0 =>5-0 count[5]=6-1=5 =>output[5]=A[6]=5
		
		//count	0	1	2	3	4	5	6	7	8	9
		//value 2	3	3	4	5	6-1	6	6	6	7
		
		//A[5]=4 =>A[5]-0 =>4-0 count[4]=5-1=4 =>output[4]=A[5]=4
		
		//count	0	1	2	3	4	5	6	7	8	9
		//value 2	3	3	4	5-1	6-1	6	6	6	7
		
		//A[4]=3 =>A[4]-0 =>3 count[3]=4 =>4-1=3 => output[3]=A[4]=3
		
		//count	0	1	2	3	4	5	6	7	8	9
		//value 2	3	3	4-1	4	4	4	4	4	7
		
		//A[3]=0 =>A[3]-0 =>0-0=0 => count[0]=2-1=1 => output[1]=A[3]=0
		
		//count	0	1	2	3	4	5	6	7	8	9
		//value 2-1	3	3	4-1	4	4	4	4	4	7
		
		//A[2]=0 =>A[2]-0 =>0-0 => count[0]=1-1=0 => output[0]=A[2]=0
		
		//count	0	1	2	3	4	5	6	7	8	9
		//value 1-1	3	3	4-1	4	4	4	4	4	7
		
		//A[1]=9 =>A[1]-0 =>9-0=9 => count[9]=7-1=6 => output[6]=A[1]=9
		
		//count	0	1	2	3	4	5	6	7	8	9
		//value 1-1	3	3	4-1	4	4	4	4	4	7-1
		
		//A[0]=1 =>A[1]-0 =>1-0=1 => count[1]=3-1=2 => output[2]=A[0]=1
		
		//copy the output array to main array 
		 for (int i = 0; i<l; ++i) 
	            A[i] = Output[i]; 
		 
		 
		
	}
	
	public static void main (String[] args)
	
	{
		
		int[] array= {9,3,4,3,5,12,12};
		countingSort(array);
		
		System.out.println("Sorted array is \n");
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);
		
		
	}

}

