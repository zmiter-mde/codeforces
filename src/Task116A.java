import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by d.mishchanka on 21/06/2016.
 */
public class Task116A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int count = scan.nextInt(), ans = 0, cur = 0;
        for (int i = 0; i < count; ++i) {
            int out = scan.nextInt(), in = scan.nextInt();
            cur = cur - out + in;
            ans = Math.max(ans, cur);
        }
        pw.println(ans);

        pw.close();
        scan.close();
    }

}
