import java.util.*;

import java.lang.*;

import java.io.*;



/* Name of the class has to be "Main" only if the class is public. */

class Ideone

{

	public static void main (String[] args) throws java.lang.Exception

	{

		int i,c=0;

	    Scanner s=new Scanner(System.in);

	    String s1=s.nextLine();

	    char ch;

	    int n=s1.length();

	    for(i=0;i<n;i++)

	    {

	    	ch=s1.charAt(i);

	    	if(ch>='0'&&ch<='9')

	    	{

	    		c=c+1;

	    	}

	    }

	    System.out.print(c);

	    

	}

}
