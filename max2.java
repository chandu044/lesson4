import java.util.*;

import java.lang.*;

import java.io.*;



/* Name of the class has to be "Main" only if the class is public. */

class Ideone

{

	public static void main (String[] args) throws java.lang.Exception

	{

		int max=0;

		Scanner sc = new Scanner (System.in);

		

		int[] a = new int[10];

		 for (int i =0;i<10;i++)

		 {

		 	a[i] = sc.nextInt();

		 }

		 int i=0;

		 int j=9;

		 while(i<=j)

		 {

		 	if (a[i] < a[j])

			{

		 		max=a[j];

		 		i++;

		 	}

		 	else

		 	{

		 		max=a[i];

		 		j--;

		 	}

		 	

		}

		 	System.out.println(max);

		 

		   

	}

}
