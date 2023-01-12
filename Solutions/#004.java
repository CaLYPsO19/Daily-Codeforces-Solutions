/*
158A - Next Round
"Contestant who earns a score equal to or greater than the k-th place finisher's score will advance to the next round, as long as the contestant earns a positive score..." — an excerpt from contest rules.

A total of n participants took part in the contest (n ≥ k), and you already know their scores. Calculate how many participants will advance to the next round.
*/
import java.util.*;
import java.io.*;

public class Next_round {

	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] data = new int[n + 1];
		int minScore = 0;
		for (int i = 1; i <= n; i++) {
			int score = sc.nextInt();
			data[i] = score;
			if (i == k)
				minScore = score;
		}

		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			if (data[i] >= minScore && data[i] > 0)
				cnt++;
		}

		System.out.println(cnt);
	}
}
