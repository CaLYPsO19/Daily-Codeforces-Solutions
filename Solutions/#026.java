/*
Magnets
Mad scientist Mike entertains himself by arranging rows of dominoes. He doesn't need dominoes, though: he uses rectangular magnets instead. Each magnet has two poles, positive (a "plus") and negative (a "minus"). If two magnets are put together at a close distance, then the like poles will repel each other and the opposite poles will attract each other.
Mike starts by laying one magnet horizontally on the table. During each following step Mike adds one more magnet horizontally to the right end of the row. Depending on how Mike puts the magnet on the table, it is either attracted to the previous one (forming a group of multiple magnets linked together) or repelled by it (then Mike lays this magnet at some distance to the right from the previous one). We assume that a sole magnet not linked to others forms a group of its own.
Mike arranged multiple magnets in a row. Determine the number of groups that the magnets formed.

*/
import java.io.*;
import java.util.*;

public class magnets {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(f.readLine());
    int groups = 1;
    String[] magnets = new String[n];
    for (int i = 0; i < n; i++) {
    	magnets[i] = f.readLine();
    	if (i > 0 && magnets[i].charAt(0) == magnets[i-1].charAt(1))
    		groups++;
    }
    System.out.println(groups);
  }
}
