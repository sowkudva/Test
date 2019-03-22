import java.util.Arrays;

public class Test {

	
	public static int appearsKTimes(int size, int inputArray[], int k)
    {
        Arrays.sort(inputArray);
        int i=1, count = 1;
        int element = inputArray[0];
        int res = -1;
        while(i < size)
        {
            if(element == inputArray[i])
            {
                count++;
            }
            else
            {
                if(count == k)
                {
                    res = element;
                }
                
            }
            element = inputArray[i];
            count = 1;
            i++;
        }
        return res;
}
	public static void main (String[] args)
	{
		int a[]= {6,2,3,2,3,6,4,5,6};
		
		int res =appearsKTimes(9,a,3);
		System.out.println(res);
	}
}

