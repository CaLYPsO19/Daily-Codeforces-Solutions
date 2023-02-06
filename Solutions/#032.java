/*
Anton and Letters
Recently, Anton has found a set. The set consists of small English letters. Anton carefully wrote out all the letters from the set in one line, separated by a comma. He also added an opening curved bracket at the beginning of the line and a closing curved bracket at the end of the line.

Unfortunately, from time to time Anton would forget writing some letter and write it again. He asks you to count the total number of distinct letters in his set.
*/
import java.util.Scanner;
public class AntonAndLetters
{
	public static void main(String[] args)
	{
		Scanner zz=new Scanner(System.in);
		String x=zz.nextLine();
		String y=x.replace("{", "").replace("}", "").replaceFirst(",", "").replaceAll("\\s","");
		int k=0;
		for(char ch='a';ch<='z';ch++)
		{
			if(y.contains(String.valueOf(ch)))
				k++;
		}
		System.out.println(k);
	}
}
