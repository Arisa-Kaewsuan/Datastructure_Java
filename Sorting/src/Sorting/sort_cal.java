package Sorting;

import java.util.Arrays;

public class sort_cal 
{
	public int[] bubbleSort(int[]a)
	{
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length-i-1  ; j++) 
			{
				if(a[j] > a[j+1])
				{
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		return a;
	}
	
	public int[] selectionSort(int[]a)
	{
		
		for (int i = 0; i < a.length-1; i++) 
		{

			int max = Integer.MIN_VALUE;
			int max_index = 0 ;
			int last = a.length-i-1;
			
			for (int j = 0; j <=  last ; j++) 
			{
				if(a[j] > max)
				{
					max = a[j];
					max_index = j;
				}
			}

			int t = a[last];
			a[last] = max;
			a[max_index] = t;
		}
		return a;
	}
	
	public static void mergeSort(int[]a,int l, int r)
	{
		if(l == r) return;
		int m= (1+r)/2;
		mergeSort(a,l,m);
		mergeSort(a,m+1,r);
		int[]b = new int[r-l+1];
		int k = 0;
		int i = l;
		int j = m+1;
		while ( i <= m && j <= r)
		{
			if(a[i] < a[j])
			{
				b[k] = a[i];
				k++; i++;
			}
			else
			{
				b[k] = a[j];
				k++; j++;
			}
		}
		
		while(i <= m)
		{
			b[k] = a[i];
			k++;
			i++;
		}
			
		while(j <= r)
		{
			b[k] = a[j];
			k++;
			j++;
		}
		i = l;
		k = 0;
			
		for(; i <= r ;i++)
		{
			a[i] = b[k];
			k++;
		}
	}
	
	public static void quickSort(int[]a,int l,int r)
	{
		if(l >= r) { return; }
		int temp = a[l];
		int i = l;
		int j = r+1;
		while(i < j)
		{
			do
			{
				j--;
			} while (temp < a[j]);
			i++;
		}
		
		while (a[i] < temp)
		{
			if(i == r)
			{ break; }
			i++;
		}
		
		if(i < j)
		{
			int t = a[i];
			a[i] = a[j];
			a[j] = t;
		}
		int t2 =a[j];
		a[j] = a[l];
		a[l] = t2;
		quickSort(a,l,j-1);
		quickSort(a,j+1,r);
	}
	
	public int[] insertionSort(int[]a)
	{
		
		for (int i = 0; i < a.length ;i++) 
		{	
			int temp = a[i];
			int j;
			
			for (j = i-1 ; j >= 0 ; j--) 
			{
				if(temp > a[j]){ break; }
				a[j+1] = a[j];
		
			}
			a[j+1] = temp;
		}
		return a;
	}
}
