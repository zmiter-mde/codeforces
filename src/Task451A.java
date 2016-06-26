import java.io.PrintWriter;
import java.util.Scanner;

public class Task451A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
	
		int n = scan.nextInt(), m = scan.nextInt();
		String ans = Math.min(n, m) % 2 == 0 ? "Malvika" : "Akshat";
		pw.println(ans);
		
		pw.close();
		scan.close();
	}
	
}
