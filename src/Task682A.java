package com.mde.codeforces.tasks;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by d.mishchanka on 21/06/2016.
 */
// Not solved
public class Task682A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        long x = scan.nextLong(), y = scan.nextLong(), max = Math.max(x, y), ans = 0;
        y = Math.min(x, y);
        x = max;
        for (long i = x + 1; i <= x + y; ++i) {
            ans += i / 5;
        }

        pw.println(ans);

        pw.close();
        scan.close();
    }
}
