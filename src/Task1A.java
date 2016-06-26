import java.io.PrintWriter;
import java.util.Scanner;

// Codeforces 1A
public class Task1A {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		long n = scan.nextLong(), m = scan.nextLong(), a = scan.nextLong();
		
		pw.println((long)(Math.ceil((double)n / a) * Math.ceil((double)m / a)));
		
		pw.close();
		scan.close();
	}

}
