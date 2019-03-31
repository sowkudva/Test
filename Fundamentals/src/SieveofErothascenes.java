import java.util.Scanner;

public class SieveofErothascenes {
	
	static int countPrimes(int n) {
		int count=0;
		if(n<=2) {
			return 0;
		}
		
		boolean primes[]= new boolean[n];
		
		for (int i =2;i<n;i++) {
			primes[i]= true;
		}
		
		for (int i=2;i<n;i++) {
			if(primes[i])
			{
				for(int j=i+i;j<n;j+=i)
				{
					primes[j]=false;
				}
			}
		}
		
		for(int i=2;i<n;i++) {
			if(primes[i]) {
				count++;
			}
		}
		
		return count;
	}
	
	static void intervalPrimes(int low,int high) {
		while(low<high) {
			boolean flag= false;
			//not more than the half of a num are divisible by a num
			for(int i=2;i<low/2;i++) {
				if(low%i==0)
				{
					flag=true;
					break;
				}
			}
				if(!flag)
					System.out.println(low);
			low++;
		}
		
	}
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println("number of primes ="+countPrimes(n));
		
		int low=sc.nextInt();
		int high=sc.nextInt();
		intervalPrimes(low,high);
		
		
	}

}
