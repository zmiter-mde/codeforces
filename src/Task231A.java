package com.mde.codeforces.tasks;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by d.mishchanka on 21/06/2016.
 */
public class Task231A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int count = scan.nextInt(), ans = 0;
        for (int i = 0; i < count; ++i) {
            ans += scan.nextInt() + scan.nextInt() + scan.nextInt() > 1 ? 1 : 0;
        }

        pw.println(ans);

        pw.close();
        scan.close();
    }

}
