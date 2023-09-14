package a_230609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a1259 {
	static BufferedReader br;
	static StringBuffer sb;
	static StringTokenizer st;
	static String a;
	static String b;
	
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuffer();
		
		while (true) {
			a = br.readLine();
			if (a.equals("0")) break;
			
			b = "";
			for (int i = a.length() - 1; i >= 0; i--) {
				b += a.substring(i, i + 1);
			}

			if (a.equals(b)) sb.append("yes").append("\n");
			else sb.append("no").append("\n");
		}
		
		System.out.println(sb);
		
	}
}
