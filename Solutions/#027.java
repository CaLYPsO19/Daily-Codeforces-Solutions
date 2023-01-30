/*
 Calculating Function
 For a positive integer n let's define a function f:

f(n) =  - 1 + 2 - 3 + .. + ( - 1)nn

Your task is to calculate f(n) for a given integer n.
*/
import java.util.*;
import java.lang.*;
import java.io.*;

public class cal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long fn;
		if (n%2 == 0) fn = n/2;
		else fn = (-1)*(n/2 + 1);
		System.out.println(fn);
	}	
}
