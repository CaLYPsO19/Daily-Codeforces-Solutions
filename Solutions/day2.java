/*
282A - Bit++
The classic programming language of Bitland is Bit++. This language is so peculiar and complicated.

The language is that peculiar as it has exactly one variable, called x. Also, there are two operations:

Operation ++ increases the value of variable x by 1.
Operation -- decreases the value of variable x by 1.
A statement in language Bit++ is a sequence, consisting of exactly one operation and one variable x. The statement is written without spaces, that is, it can only contain characters "+", "-", "X". Executing a statement means applying the operation it contains.

A programme in Bit++ is a sequence of statements, each of them needs to be executed. Executing a programme means executing all the statements it contains.

You're given a programme in language Bit++. The initial value of x is 0. Execute the programme and find its final value (the value of the variable when this programme is executed).
*/
import java.util.Scanner;
public class bit
{
    public static void main(String args[])
    {
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        int x=0;
        String a = "++X";
        String b = "X++";
        String[] str = new String[num];
        for(int i=0;i<num;i++)
        {
            String y = ip.next();
            str[i]=y;
        }
        for(int i=0;i<num;i++)
        {
            if(str[i].equals(a) || str[i].equals(b))
                x++;
            else
                x--;
        }
        System.out.println(x);
    }
}
