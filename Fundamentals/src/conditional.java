import java.util.Scanner;

public class conditional {
	
	public static void main (String[] args)
	{
		Scanner sc= new Scanner(System.in);
				int N= sc.nextInt();
 sc.close();
	if((N%2)!=0)
    	{
			System.out.println("Weird");

    	}
	else if(((N%2)==0) &&((N>=2) &&(N<=5)))
    {
        System.out.println("Not Weird");


    }
 else if(((N%2)==0) &&((N>=6) &&(N<=20)))
    {
        System.out.println("Weird");
        

    }
else

    {
        System.out.println("Not Weird");
        

    }

}
}

