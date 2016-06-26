import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task337A {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
	
		int n = scan.nextInt(), m = scan.nextInt();
		int[] a = new int[m];
		for (int i = 0; i < m; ++i) {
			a[i] = scan.nextInt();
		}
		
		Arrays.sort(a);
		
		int diff = 1000;
		
		for (int i = n - 1; i < m; ++i) {
			diff = Math.min(diff, Math.abs(a[i] - a[i - n + 1]));
		}
		
		pw.println(diff);
		
		pw.close();
		scan.close();
	}

}
