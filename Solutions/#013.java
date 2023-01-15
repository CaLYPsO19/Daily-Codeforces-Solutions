/*
Bear and Big Brother
Bear Limak wants to become the largest of bears, or at least to become larger than his brother Bob.

Right now, Limak and Bob weigh a and b respectively. It's guaranteed that Limak's weight is smaller than or equal to his brother's weight.

Limak eats a lot and his weight is tripled after every year, while Bob's weight is doubled after every year.

After how many full years will Limak become strictly larger (strictly heavier) than Bob?
*/
import java.util.Scanner;
import java.util.stream.IntStream;

public class bear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int limak=sc.nextInt();
        int bob=sc.nextInt();
        int year=0;
        while(limak<=bob){
            limak=limak*3;
            bob=bob*2;
            year++;
        }
        System.out.println(year);
        
	}
}
