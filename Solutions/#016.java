/*
Word
Vasya is very upset that many people on the Net mix uppercase and lowercase letters in one word. That's why he decided to invent an extension for his favorite browser that would change the letters' register in every word so that it either only consisted of lowercase letters or, vice versa, only of uppercase ones. At that as little as possible letters should be changed in the word. For example, the word HoUse must be replaced with house, and the word ViP — with VIP. If a word contains an equal number of uppercase and lowercase letters, you should replace all the letters with lowercase ones. For example, maTRIx should be replaced by matrix. Your task is to use the given method on one given word.
*/
import java.util.Scanner;
public class word1
{
	public static void main(String[] args)
	{
		Scanner z=new Scanner(System.in);
		String s=z.next();
		String sl=s.toLowerCase();
		String su=s.toUpperCase();
		int l=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.toCharArray()[i]==sl.toCharArray()[i])
				l++;
		}
		int u=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.toCharArray()[i]==su.toCharArray()[i])
				u++;
		}
		if(l>u || l==u)
			System.out.println(s.toLowerCase());
		else
			System.out.println(s.toUpperCase());
	}
}
