/*
4A - Watermelon
One hot summer day Pete and his friend Billy decided to buy a watermelon. They chose the biggest and the ripest one, in their opinion. After that the watermelon was weighed, and the scales showed w kilos. They rushed home, dying of thirst, and decided to divide the berry, however they faced a hard problem.

Pete and Billy are great fans of even numbers, that's why they want to divide the watermelon in such a way that each of the two parts weighs even number of kilos, at the same time it is not obligatory that the parts are equal. The boys are extremely tired and want to start their meal as soon as possible, that's why you should help them and find out, if they can divide the watermelon in the way they want. For sure, each of them should get a part of positive weight.
*/
 import java.util.Scanner;
public class A9_watermelon 
{
    public static void main(String[] args) 
    {
        int w;
        Scanner input = new Scanner(System.in);
        w=input.nextInt();
        if(w>2)
        {
        if((w%2)==0)
            System.out.println("YES");
        else
            System.out.println("NO");
        }
        else
            System.out.println("NO");
    }
} 
