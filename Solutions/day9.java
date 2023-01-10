/*
Helpful Maths
Xenia the beginner mathematician is a third year student at elementary school. She is now learning the addition operation.

The teacher has written down the sum of multiple numbers. Pupils should calculate the sum. To make the calculation easier, the sum only contains numbers 1, 2 and 3. Still, that isn't enough for Xenia. She is only beginning to count, so she can calculate a sum only if the summands follow in non-decreasing order. For example, she can't calculate sum 1+3+2+1 but she can calculate sums 1+1+2 and 3+3.

You've got the sum that was written on the board. Rearrange the summans and print the sum in such a way that Xenia can calculate the sum.
*/
import java.util.*;
import java.io.*;
public class helpful {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String first1 = in.next();
        first1 = first1.replace("+", "");
        char []arr = first1.toCharArray();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i == arr.length-1)
                continue;
            System.out.print("+");           
        }
        System.out.println();
    }
}
