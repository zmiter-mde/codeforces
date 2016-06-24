package com.mde.codeforces.tasks;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by d.mishchanka on 20/06/2016.
 */

public class Task118A {

    public static final String vowels = "aeiouy";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String line = scan.nextLine().toLowerCase();

        for (int i = 0; i < line.length(); ++i) {
            char c = line.charAt(i);
            if (vowels.indexOf(c) == -1) {
                pw.print("." + c);
            }
        }

        pw.close();
        scan.close();
    }
}
