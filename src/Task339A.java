import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by d.mishchanka on 23/06/2016.
 */
public class Task339A {

    public static int ones = 0, twos = 0, threes = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        String line = scan.nextLine();

        for (int i = 0; i < line.length(); ++i) {
            increaseNumbersCount(line.charAt(i));
        }

        StringBuilder res = new StringBuilder("");
        res.append(outputNumbers(ones, "1"));
        res.append(outputNumbers(twos, "2"));
        res.append(outputNumbers(threes, "3"));

        int lastCharIndex = res.length() - 1;
        if (res.charAt(lastCharIndex) == '+') {
            res.deleteCharAt(lastCharIndex);
        }

        pw.println(res.toString());

        pw.close();
        scan.close();
    }

    public static void increaseNumbersCount(char c) {
        switch (c) {
            case '1' :
                ++ones;
                break;
            case '2' :
                ++twos;
                break;
            case '3' :
                ++threes;
                break;
            default:
                break;
        }
    }

    public static String outputNumbers(int count, String value) {
        StringBuilder res = new StringBuilder("");

        for (int i = 0; i < count; ++i) {
            res.append(value).append("+");
        }

        return res.toString();
    }

}
