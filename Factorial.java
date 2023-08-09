
public class Factorial {

	public static void main(String[] args) 
	{
		int n = 10;
		System.out.println("Factorial of " + n + " with loop : " + FactorialWithLoop(n));
		System.out.println("Factorial of " + n + " with recursion : " + FactorialWithRecursion(n));
	}
	
	static int FactorialWithRecursion(int n) 
	{
		if(n == 0)
		{
			return 1;
		}
		else
		{
			return n*FactorialWithRecursion(n-1); 
		}
	}


	static int FactorialWithLoop(int n) 
	{
		int Factorial = 1;
		for(int i = 0; i <= n; i++ )
		{
			if(i == 0)
			{
				Factorial = 1;
			}
			else
			{
				Factorial *= i;
			}
		}
		return Factorial;
	}

}
