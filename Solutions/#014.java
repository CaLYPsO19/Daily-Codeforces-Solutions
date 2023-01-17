/*
Soldier and Bananas
A soldier wants to buy w bananas in the shop. He has to pay k dollars for the first banana, 2k dollars for the second one and so on (in other words, he has to pay i·k dollars for the i-th banana).

He has n dollars. How many dollars does he have to borrow from his friend soldier to buy w bananas?
*/
import java.util.Scanner;
public class soldier {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cost = scan.nextInt();
        int initialMoney = scan.nextInt();
        int noBananas = scan.nextInt();
 
        int sum=cost;
        for(int i=2;i<=noBananas;i++){
            sum+=i*cost;
        }
        if(sum<=initialMoney){
            System.out.println(0);
            System.exit(0);
        }
        System.out.println(sum-initialMoney);
    } 
}
