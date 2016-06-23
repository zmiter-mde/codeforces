import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by d.mishchanka on 21/06/2016.
 */
public class Task282A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int count = Integer.parseInt(scan.nextLine()), x = 0;

        for (int i = 0; i < count; ++i) {
            String line = scan.nextLine();
            int adding = line.indexOf('+') != -1 ? 1 : -1;
            x += adding;
        }

        pw.println(x);

        pw.close();
        scan.close();
    }

}
