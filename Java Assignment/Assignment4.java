//Reverse fibonacci series till 100

import java.io.*;

class Assignment4 {
	
	static void reverseFibonacci()
	{
		int a[] = new int[100];
	

		a[0]=0;
		a[1]=1;
	
		for (int i=2; i<100; i++)
		{
	
			a[i] = a[i-2] + a[i-1];
		}
	
		for (int i=99; i>=0; i--)
		{
	
			System.out.print(a[i] +" ");
		}
	}
	
	
	public static void main(String args[])
	{
		
		reverseFibonacci(100);
	
	}
}