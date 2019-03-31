//This program finds the medians of 2 sorted arrays
public class MedianOfarrays {
	static int comparision(int[] A, int[] B,int[] C)
	{
		int i=0, j=0, k=0;
		
		
			while((i<A.length) && j<B.length)
			{
				if (A[i]<B[j])
				{
					C[k]=A[i];
					i++;
					k++;
				}
				else
				{
					C[k]=B[j];
				
					j++;
					k++;
				}
			}
			while (i<A.length)
			{
				C[k]=A[i];
				i++;
				k++;
				
			}
			
			while (j<B.length)
			{
				C[k]=B[j];
				j++;
				k++;
				
			}
			
		
		for (int s=0;s<C.length;s++)
		{
			System.out.println(C[s]);
		}
		int m1 = (C.length-1)/2;
		int m2 = (C.length)/2;
		int median= (C[m1]+C[m2])/2;
		return median;
	}
	
	public static void main (String[] args)
	{
		int A[]= {1, 12, 15, 26, 38};
		int B[]= {2, 13, 17, 30, 45};
		
		int s1=A.length;
		int s2=B.length;
		int s3=s1+s2;
		int C[]= new int[s3];
		System.out.println("Median is "+comparision(A,B,C));
		
		
		
	}

}
