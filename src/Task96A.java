import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by d.mishchanka on 21/06/2016.
 */
public class Task96A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String line = scan.nextLine();
        boolean ans = false;
        int inARow = 1;
        for (int i = 1; i < line.length(); ++i) {
            if (line.charAt(i) == line.charAt(i - 1)) {
                ++inARow;
            } else {
                inARow = 1;
            }
            if (inARow > 6) {
                ans = true;
            }
        }

        pw.println(ans ? "YES" : "NO");

        pw.close();
        scan.close();
    }

}
