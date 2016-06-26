import java.io.PrintWriter;
import java.util.Scanner;

public class Task41A {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
	
		String s = scan.nextLine(), t = scan.nextLine();
		boolean ans = new StringBuilder(s).reverse().toString().equals(t);
		pw.println(ans ? "YES" : "NO");
		
		pw.close();
		scan.close();
	}

}
