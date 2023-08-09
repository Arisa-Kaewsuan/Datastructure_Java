

public class Factorial {
	public static int fac_loop(int n)
	{
		int factorial = 0;
		for(int i = 0 ; i <= n ; i++)
		{
			if(i == 0)
			{
				factorial = 1;
			}
			else
			{
				factorial *= i;
			}
		}
		return factorial;
	}
	
	public static int fac_rec(int n)
	{
		if(n == 0)
		{
			return 1;
		}
		else
		{
			return n * fac_rec(n-1);
		}
	}

	public static void main(String[] args) 
	{
		int n = 5;
		System.out.println("Factorial of " + n + " with recursive : " + fac_rec(n));
		System.out.println("Factorial of " + n + " with loop : " + fac_loop(n));
	}

}

