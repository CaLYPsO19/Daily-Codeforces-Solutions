/*
Amusing Joke
So, the New Year holidays are over. Santa Claus and his colleagues can take a rest and have guests at last. When two "New Year and Christmas Men" meet, thear assistants cut out of cardboard the letters from the guest's name and the host's name in honor of this event. Then the hung the letters above the main entrance. One night, when everyone went to bed, someone took all the letters of our characters' names. Then he may have shuffled the letters and put them in one pile in front of the door.

The next morning it was impossible to find the culprit who had made the disorder. But everybody wondered whether it is possible to restore the names of the host and his guests from the letters lying at the door? That is, we need to verify that there are no extra letters, and that nobody will need to cut more letters.

Help the "New Year and Christmas Men" and their friends to cope with this problem. You are given both inscriptions that hung over the front door the previous night, and a pile of letters that were found at the front door next morning.
*/
import java.util.Scanner;

public class joke
{
    public static void main(String[] args)
    {
        Scanner z = new Scanner(System.in);
        String s = z.nextLine().toLowerCase();
        String n = z.nextLine().toLowerCase();
        String p = z.nextLine().toLowerCase();
        String sn = s+n;
        if(sn.length() == p.length()){
            boolean flag = false;
            for(char aa='a';aa<='z';aa++){
                if(sn.contains(String.valueOf(aa))){
                    sn = sn.replaceAll(String.valueOf(aa), "");
                    int x = sn.length();
                    p = p.replaceAll(String.valueOf(aa), "");
                    int y = p.length();
                    if(x != y){
                        flag = true;
                        break;
                    }                    
                }
            }
            if(!flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }else{
            System.out.println("NO");
        }
        z.close();
    }
}
