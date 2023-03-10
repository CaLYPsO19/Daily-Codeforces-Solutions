/*
Queue at the School
During the break the schoolchildren, boys and girls, formed a queue of n people in the canteen. Initially the children stood in the order they entered the canteen. However, after a while the boys started feeling awkward for standing in front of the girls in the queue and they started letting the girls move forward each second.

Let's describe the process more precisely. Let's say that the positions in the queue are sequentially numbered by integers from 1 to n, at that the person in the position number 1 is served first. Then, if at time x a boy stands on the i-th position and a girl stands on the (i + 1)-th position, then at time x + 1 the i-th position will have a girl and the (i + 1)-th position will have a boy. The time is given in seconds.

You've got the initial position of the children, at the initial moment of time. Determine the way the queue is going to look after t seconds.
*/
import java.util.*;
import java.lang.*;
public class school
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int t=sc.nextInt();
	        String s=sc.next();
	        char ch[]=s.toCharArray();
	        char temp;
	        for(int j=0;j<t;j++)
	        {
	        	for(int i=0;i<ch.length-1;i++)
	        	{
	        	if(ch[i]=='B' && ch[i+1]!='B')
	        	{
	        		temp=ch[i];
	        		ch[i]=ch[i+1];
	        		ch[i+1]=temp;
	        		i++;
	        	}
	            }
	        }
	        for(int i=0;i<ch.length;i++)
	        {
	        	System.out.print(ch[i]);
	        }
	}
}
