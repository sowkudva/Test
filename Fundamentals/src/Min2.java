import java.util.Scanner;

public class Min2 {
	public static int assign3(int a[], int l, int r)
	{
		
		
		
		
		int mid=(l+r)/2;
		
		if (l==r)
		{
			return a[l];
		}
		else
		{
			int temp1=assign3(a,l,mid);  //-- t(n\2)
			//System.out.println("temp1 called "+temp1);
			int temp2=assign3(a,mid+1,r);  // ---t(n/2)
			//System.out.println("temp2 called "+temp2);
			if(temp1<=temp2)
				return temp1;
			else
				return temp2;
	}
	}
	
	
	public static  void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int res=assign3(a,0,n-1);
		System.out.println(res);
			
	}

}
