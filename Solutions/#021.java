/*
Translation
The translation from the Berland language into the Birland language is not an easy task. Those languages are very similar: a berlandish word differs from a birlandish word with the same meaning a little: it is spelled (and pronounced) reversely. For example, a Berlandish word code corresponds to a Birlandish word edoc. However, it's easy to make a mistake during the «translation». Vasya translated word s from Berlandish into Birlandish as t. Help him: find out if he translated the word correctly.
*/
import java.util.Scanner;
public class Translation
{
    public static void main(String args[])
    {
        Scanner z = new Scanner(System.in);
        String a=z.next();
        String b=z.next();
        StringBuilder sb=new StringBuilder(b);
        if(a.equals(sb.reverse().toString()))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
