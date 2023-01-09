/*
231A - Team
One day three best friends Petya, Vasya and Tonya decided to form a team and take part in programming contests. Participants are usually offered several problems during programming contests. Long before the start the friends decided that they will implement a problem if at least two of them are sure about the solution. Otherwise, the friends won't write the problem's solution.

This contest offers n problems to the participants. For each problem we know, which friend is sure about the solution. Help the friends find the number of problems for which they will write a solution.
*/
 import java.util.Scanner;
public class Team 
{
    public static void main(String args[])
    {
        Scanner ip = new Scanner(System.in);
        int x=ip.nextInt();
        int ctr=0,s=0;
        int[] a = new int[3];
        int[] b = new int[1001];
        for(int i=1;i<=x;i++)
        {
            for(int j=0;j<=2;j++)
            {
                a[j]=ip.nextInt();
                s=a[0]+a[1]+a[2];
            }
            b[i]=s;
                if(b[i]>=2)
                    ctr++;
        }
        System.out.println(ctr);
    }
} 
