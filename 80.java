/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
 class Test
{

public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	while(n>0)
	{
		int r=n%10;
		if(r%2==1)
		System.out.print(r+" ");
		n=n/10;
	}
}
}
