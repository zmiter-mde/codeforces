import java.io.PrintWriter;
import java.util.Scanner;
/**
 * Created by d.mishchanka on 20/06/2016.
 */
public class Task50A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = scan.nextInt(), m = scan.nextInt();
        pw.println((n * m) / 2);

        pw.close();
        scan.close();
    }
}
