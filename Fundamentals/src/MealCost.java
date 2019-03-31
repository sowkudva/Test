import java.util.Scanner;

public class MealCost {
	static long calculateTotal(double cost, int tip, int tax)
	{
		long totalCost=Math.round (cost+(cost*(tip/100.0))+(cost*(tax/100.0)));
		
		
		return totalCost;
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double cost=sc.nextDouble();
		int tip=sc.nextInt();
		int tax= sc.nextInt();
		
		System.out.println(calculateTotal(cost,tip,tax));
	}

}
