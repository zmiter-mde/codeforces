import java.io.PrintWriter;
import java.util.Scanner;

public class Task472A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
	
		int n = scan.nextInt();
		
		boolean[] a = new boolean[n];
		int cur = 2;
		
		while (cur < n) {
			a[cur] = false;
			int ind = cur;
			while (ind + cur < n) {
				ind += cur;
				a[ind] = true;
			}
			do {
				++cur;
			} while (cur < n && a[cur]);
		}
		
		for (int i = 4; i < n; ++i) {
			if (a[i] && a[n - i]) {
				pw.println(i + " " + (n - i));
				break;
			}
		}
		
		pw.close();
		scan.close();
	}
	
}
