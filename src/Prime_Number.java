import java.util.*;
public class Prime_Number {
	Scanner sc=new Scanner(System.in);
	int n;
	public Prime_Number() {
		System.out.println("Enter the number");
		n=sc.nextInt();
	}
	public void compute()
	{
		int c=0;
		for(int i=1; i<n; i++)
		{
			if(n%i==0)
				c++;
		}
		if(c>1)
			System.out.println("Not a prime number");
		else
			System.out.println("Prime Number");
	}
	public static void main(String[] args) {
		Prime_Number obj=new Prime_Number();
		obj.compute();
	}

}
