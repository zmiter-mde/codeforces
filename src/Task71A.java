import java.io.PrintWriter;
import java.util.Scanner;

// Codeforces 71A
public class Task71A {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		long count = scan.nextLong();
		scan.nextLine();
		
		for (int i = 0; i < count; ++i) {
			String word = scan.nextLine().trim();
			if (word.length() > 10) {
				int len = word.length();
				pw.println(String.valueOf(word.charAt(0)) + 
							(len - 2) + 
							String.valueOf(word.charAt(len - 1)));
			} else {
				pw.println(word);
			}
		}
		
		pw.close();
		scan.close();
	}

}
