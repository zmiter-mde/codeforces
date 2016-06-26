package com.mde.codeforces.tasks;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task158A {

    public static int[] a;

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = scan.nextInt(), k = scan.nextInt(), firstZeroIndex = 100, lastBreakingScoreIndex = k;

        a = new int[n + 1];

        for (int i = 1; i <= n; ++i) {
            a[i] = scan.nextInt();
            if (a[i] == 0) {
                firstZeroIndex = Math.min(firstZeroIndex, i);
            }
            if (i > k && a[i] == a[k]) {
                lastBreakingScoreIndex = i;
            }
        }

        if (firstZeroIndex <= k) {
            pw.println(firstZeroIndex - 1);
        } else {
            pw.println(lastBreakingScoreIndex);
        }

        pw.close();
        scan.close();
    }
}
