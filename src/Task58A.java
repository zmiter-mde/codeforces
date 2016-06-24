import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by d.mishchanka on 23/06/2016.
 */
public class Task58A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String hello = "hello";
        int cur = 0;

        String line = scan.nextLine();

        for (int i = 0; i < line.length(); ++i) {
            if (cur < hello.length() && line.charAt(i) == hello.charAt(cur)) {
                ++cur;
            }
        }

        pw.println(cur == hello.length() ? "YES" : "NO");

        pw.close();
        scan.close();
    }

}
