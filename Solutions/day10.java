/*
Word Capitalization
Capitalization is writing a word with its first letter as a capital letter. Your task is to capitalize the given word.

Note, that during capitalization all the letters except the first one remains unchange
*/
import java.util.Scanner;

public class word
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        String word = reader.next();
        char[] ch = word.toCharArray();
        ch[0] = Character.toUpperCase(ch[0]);
        for(int i=0; i<ch.length; i++)
            System.out.print(ch[i]);
    }
}
