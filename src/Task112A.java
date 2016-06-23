import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by d.mishchanka on 21/06/2016.
 */
public class Task112A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String f = scan.nextLine().toLowerCase(),
               s = scan.nextLine().toLowerCase();
        boolean equal = true;
        for (int i = 0; i < f.length(); ++i) {
            if (f.charAt(i) < s.charAt(i)) {
                pw.println(-1);
                equal = false;
                break;
            } else if (s.charAt(i) < f.charAt(i)) {
                pw.println(1);
                equal = false;
                break;
            }
        }
        if (equal) {
            pw.println(0);
        }

        pw.close();
        scan.close();
    }

}
