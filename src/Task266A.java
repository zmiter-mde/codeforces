import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by d.mishchanka on 23/06/2016.
 */
public class Task266A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int count = scan.nextInt(), ans = 0;
        scan.nextLine();
        String line = scan.nextLine();
        for (int i = 1; i < count; ++i) {
            ans += line.charAt(i) == line.charAt(i - 1) ? 1 : 0;
        }

        pw.println(ans);

        pw.close();
        scan.close();
    }

}
