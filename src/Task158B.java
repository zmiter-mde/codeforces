import java.io.PrintWriter;
import java.util.Scanner;

// Codeforces 71A
public class Task158B {
	
	public static long[] s = new long[5];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
	
		long count = scan.nextLong();
		
		for (int i = 0; i < count; ++i) {
			++s[scan.nextInt()];
		}
		// Deal with fours
		long result = s[4];
		
		// Deal with threes and ones
		long threePlusOne = Math.min(s[3], s[1]);
		result += threePlusOne;
		s[3] -= threePlusOne;
		s[1] -= threePlusOne;
		
		// Deal with twos
		long twos = s[2] / 2;
		s[2] %= 2;
		result += twos;
		// Deal with threes if they are still present
		result += s[3];
		s[3] = 0;
		
		// Deal with two and ones if it is still present
		if (s[2] == 1) {
			++result;
			s[1] -= 2;
		}
		
		// Deal with ones if they are still present
		if (s[1] > 0) {
			result += (s[1] / 4) + (s[1] % 4 > 0 ? 1 : 0);
		}
		
		pw.println(result);
		
		pw.close();
		scan.close();
	}

}
