import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by d.mishchanka on 23/06/2016.
 */
public class Task281A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        StringBuilder line = new StringBuilder(scan.nextLine());
        line.setCharAt(0, Character.toUpperCase(line.charAt(0)));
        pw.println(line.toString());

        pw.close();
        scan.close();
    }

}
