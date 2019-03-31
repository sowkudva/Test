import java.util.Scanner;

public class TwoDimArray {
	
	static int hourglassSum(int[][] arr, int x, int y)
	{
		int sum=0;	
		sum=arr[x][y]+arr[x][y+1]+arr[x][y+2]+arr[x+1][y+1]+arr[x+2][y]+arr[x+2][y+1]+arr[x+2][y+2];	
		return sum;
		}
		
	
	
	public static void main (String[] args)
	{
	
	int[][] a= new int[6][6];
	int sum=0;
	Scanner sc = new Scanner(System.in);
	

	for (int y = 0; y < 6; y++){
        for (int x =0; x<6; x++)
        {
            a[y][x] = sc.nextInt();
        }
	}
            
	int Max = hourglassSum(a,0,0);	
	
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			sum=hourglassSum(a,i,j);
			if(sum>Max)
			{
				Max=sum;
			}
		}
		
	}
	
	System.out.println(Max);
	
	//This prints the two dimentional array
	
	for(int i=0;i<6;i++)
	{
		for(int j=0;j<6;j++)
		{
			System.out.print(a[i][j]+" ");
	    }
		System.out.println(" ");
	}

}
	}
	


/*
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0 */