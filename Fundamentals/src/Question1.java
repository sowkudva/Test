
public class Question1 {

	// You can print the values to stdout for debugging
	public class DigitSum {
	    public static int getDigitSumParity(int[] arr) {
	        int min = getMin(arr);
	        int result = getSum(min);
	        if (result == 0) {
	            return 0;
	        }
	        if (result % 2 != 0) {
	            return 1;
	        } else {
	            return 0;
	        }
	    }

	    public static int getMin(int[] arr) {
	        if (arr == null || arr.length <= 0) {
	            throw new IllegalArgumentException(
	                "Input array should contain at least 1 element.");
	        }
	        int min = arr[0];
	        int len = arr.length;
	        for (int i = 1; i < len; i++) {
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }
	        return min;
	    }

	    public int getSum(int num) {
	        int sum = 0;
	        while (num != 0) {
	            int temp = num % 10;
	            sum = sum + temp;
	            num = num / 10;
	            
	        }
	        return sum;
	    }
	}
	
	public static void main (String[] args)
	{
		int a[]= {6,2,3,2,3,6,4,5,6};
		
		int res =appearsKTimes(9,a,3);
		System.out.println(res);
	}
}
