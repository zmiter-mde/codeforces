package com.mde.codeforces.tasks;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by d.mishchanka on 23/06/2016.
 */
public class Task131A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String line = scan.nextLine();

        if (line.equals(line.toUpperCase())) {
            pw.println(line.toLowerCase());
        } else {
            char start = line.charAt(0);
            String ending = line.substring(1);
            if (Character.isLowerCase(start) && ending.equals(ending.toUpperCase())) {
                pw.println(Character.toUpperCase(line.charAt(0)) + ending.toLowerCase());
            } else {
                pw.println(line);
            }
        }

        pw.close();
        scan.close();
    }

}
