import java.io.PrintWriter;
import java.util.Scanner;

// Codeforces 4A
public class Task4A {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int n = scan.nextInt();
		
		boolean answer = false;
		
		if (n >= 4) {
			for (int i = 2; i < n; i += 2) {
				answer = answer || (n - i) % 2 == 0; 
			}
		}
	
		pw.println(answer ? "YES" : "NO");
		
		pw.close();
		scan.close();
	}

}
