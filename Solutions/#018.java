/*
Tram
Linear Kingdom has exactly one tram line. It has n stops, numbered from 1 to n in the order of tram's movement. At the i-th stop ai passengers exit the tram, while bi passengers enter it. The tram is empty before it arrives at the first stop. Also, when the tram arrives at the last stop, all passengers exit so that it becomes empty.

Your task is to calculate the tram's minimum capacity such that the number of people inside the tram at any time never exceeds this capacity. Note that at each stop all exiting passengers exit before any entering passenger enters the tram.
*/
import java.util.*;
import java.io.*;

public class tram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // number of stops
		int enter, exit, currentCapacity, minCapacity;
		enter = exit = currentCapacity = minCapacity = 0;
		for (int i = 0; i < n; i++) {
			exit = sc.nextInt();
			enter = sc.nextInt();

			currentCapacity -= exit;
			currentCapacity += enter;

			if (currentCapacity > minCapacity) {
				minCapacity = currentCapacity;
			}
		}
		System.out.println(minCapacity);
	}
}
