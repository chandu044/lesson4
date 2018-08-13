/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a=1;
                         int b=1;
                         System.out.print(a+" "+b+" ");
		for(int i=1;i<=n-2;i++)
		{

			
		        int c=a+b;
		        		       System.out.print(c+" ");

		       b=a;
		        a=c;
			
		}
		}
}
