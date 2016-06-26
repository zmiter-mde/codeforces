package com.mde.codeforces.tasks;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by d.mishchanka on 23/06/2016.
 */
public class Task236A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        StringBuilder abc = new StringBuilder("abcdefghijklmnopqrstuvwxyz");

        String line = scan.nextLine();

        for (int i = 0; i < line.length(); ++i) {
            int ind = abc.indexOf(String.valueOf(line.charAt(i)));
            if (ind != -1) {
                abc.deleteCharAt(ind);
            }
        }

        pw.println(abc.length() % 2 == 1 ? "IGNORE HIM!" : "CHAT WITH HER!");

        pw.close();
        scan.close();
    }

}
