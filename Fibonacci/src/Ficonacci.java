
public class Ficonacci 
{
	public static int fibo (int n)
	{
		// method 1 : loop
		/*int[] a = new int[n+1];
		for(int i = 1 ; i < n+1 ;i++)
		{
			if(i == 1 || i == 2) { a[i] = 1; }
			else { a[i] = a[i-1] + a[i-2]; }
		}
		return a[n];*/
		
		// method 2 : recursive
		if(n == 1 || n == 2)
		{
			return 1;
		}
		return fibo(n-1) + fibo(n-2);  
		
	}

	public static void main(String[] args) 
	{   
		int n = 10 ;
		/*System.out.print("The sequence of fibonacci of " + n + " number is : ");
		for(int i = 1 ; i <= n ; i++)
		{
			System.out.print(fibo(i) + "  ");
		}*/ 
		System.out.println("\nThe " + n + "th(st) number in the fibonacci sequence is : " + fibo(n));
        
	}

}
