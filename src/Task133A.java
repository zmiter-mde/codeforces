import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by d.mishchanka on 23/06/2016.
 */
public class Task133A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int count = scan.nextInt(), all = 0;
        int[] arr = new int[count];
        for (int i = 0; i < count; ++i) {
            arr[i] = scan.nextInt();
            all += arr[i];
        }
        Arrays.sort(arr);
        int mine = 0, ind = 0;
        for (ind = arr.length - 1; ind >= 0; --ind) {
            mine += arr[ind];
            if (mine > all - mine) {
                break;
            }
        }

        pw.println(arr.length - ind);

        pw.close();
        scan.close();
    }
}
