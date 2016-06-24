import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by d.mishchanka on 23/06/2016.
 */
public class Task122A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int num = scan.nextInt();
        boolean ans = isLucky(num);

        for (int i = num / 2; i > 3; --i) {
            ans |= num % i == 0 && isLucky(i);
        }

        pw.println(ans ? "YES" : "NO");

        pw.close();
        scan.close();
    }

    public static boolean isLucky(int num) {
        boolean ans = true;
        while (num > 0) {
            ans &= num % 10 == 4 || num % 10 == 7;
            num /= 10;
        }
        return ans;
    }

}
