
class PoorDog
{
	public int size;
	int b ;
	
	public void Testmethod()
	{
		int x =0 ;
		int total = x + size +b;
		
	}
	
	int orig =42;
	int go (int arg)
	{
		arg *=2;
		return arg;
	}
}


public class poorDogTestDrive {
	
	public static void main (String args[])
	{
		PoorDog one = new PoorDog();
		System.out.println("Test test" + one.size);
	
		int y = one.go(42);
	
	}
	
	

}
