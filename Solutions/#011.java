/*
Boy or Girl
Those days, many boys use beautiful girls' photos as avatars in forums. So it is pretty hard to tell the gender of a user at the first glance. Last year, our hero went to a forum and had a nice chat with a beauty (he thought so). After that they talked very often and eventually they became a couple in the network.

But yesterday, he came to see "her" in the real world and found out "she" is actually a very strong man! Our hero is very sad and he is too tired to love again now. So he came up with a way to recognize users' genders by their user names.

This is his method: if the number of distinct characters in one's user name is odd, then he is a male, otherwise she is a female. You are given the string that denotes the user name, please help our hero to determine the gender of this user by his method.
*/
import java.util.Scanner;
import java.util.Arrays;

public class boy
{
	public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String word = reader.next();
        int count = 1;
        String res="";
        char[] ch = word.toCharArray();
        Arrays.sort(ch);
        for(int i=1; i<ch.length; i++)
            if(ch[i-1]!=ch[i])
                ++count;
        if(count%2==0)
            res = "CHAT WITH HER!";
        else
            res = "IGNORE HIM!";
        System.out.println(res);
    }
}
