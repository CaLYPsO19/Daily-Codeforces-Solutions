/*
Fox And Snake
Fox Ciel starts to learn programming. The first task is drawing a fox! However, that turns out to be too hard for a beginner, so she decides to draw a snake instead.

A snake is a pattern on a n by m table. Denote c-th cell of r-th row as (r, c). The tail of the snake is located at (1, 1), then it's body extends to (1, m), then goes down 2 rows to (3, m), then goes left to (3, 1) and so on.

Your task is to draw this snake for Fox Ciel: the empty cells should be represented as dot characters ('.') and the snake cells should be filled with number signs ('#').

Consider sample tests in order to understand the snake pattern.
*/
import java.util.Scanner;
public class fox {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
 
        int mark=0;
 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i%2==0)
                    System.out.print("#");
                else if(i%2==1 && mark==0){
                    if(j<m-1)
                        System.out.print(".");
                    else{
                        mark =1;
                        System.out.print("#");
                    }
                }
                else if(i%2==1 && mark==1){
                    if(j==0)
                        System.out.print("#");
                    else
                        System.out.print(".");
                    if(j==m-1)
                        mark=0;
                }
            }
            System.out.println("");
        }
    }   
}
