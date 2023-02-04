/*
I Wanna Be the Guy
There is a game called "I Wanna Be the Guy", consisting of n levels. Little X and his friend Little Y are addicted to the game. Each of them wants to pass the whole game.

Little X can pass only p levels of the game. And Little Y can pass only q levels of the game. You are given the indices of levels Little X can pass and the indices of levels Little Y can pass. Will Little X and Little Y pass the whole game, if they cooperate each other?
*/
import java.util.Scanner;

public class guy {

public static void main(String[] args)
{
// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
int n=in.nextInt();
boolean[] flag=new boolean[n+1];
int p=in.nextInt();
for(int i=0;i<p;i++)
{
int temp=in.nextInt();
flag[temp]=true;
}
p=in.nextInt();
for(int i=0;i<p;i++)
{
int temp=in.nextInt();
flag[temp]=true;
}
for(int i=1;i<=n;i++)
{
if(flag[i]==true)
continue;
else
{
System.out.println("Oh, my keyboard!");
return ;
}
}
System.out.println("I become the guy.");
in.close();

}

}
