/*
Police Recruits
The police department of your city has just started its journey. Initially, they don’t have any manpower. So, they started hiring new recruits in groups.
Meanwhile, crimes keeps occurring within the city. One member of the police force can investigate only one crime during his/her lifetime.
If there is no police officer free (isn't busy with crime) during the occurrence of a crime, it will go untreated.
Given the chronological order of crime occurrences and recruit hirings, find the number of crimes which will go untreated.
*/
import java.util.Scanner;
public class police {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        int input, sum = 0, neg = 0;
        for (int i = 0; i < testCases; i++) {
            input = scan.nextInt();
            if (input > 0) {
                sum+=input;
            } else if (input < 0) {
                if (sum > 0) {
                    sum--;
                } else {
                    neg++;
                }
            }
        }
        System.out.println(neg);
    }
}
