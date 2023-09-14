package a_230608;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a4153 {
	static BufferedReader br;
	static StringBuffer sb;
	static StringTokenizer st;
	static int a, b, c;
	
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuffer();

		while (true) {
			String temp = br.readLine();
			if (temp.equals("0 0 0")) break;
			
			st = new StringTokenizer(temp);
			
			a= Integer.parseInt(st.nextToken());
			b= Integer.parseInt(st.nextToken());
			c= Integer.parseInt(st.nextToken());

			if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) sb.append("right").append("\n");
			else if (Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) sb.append("right").append("\n");
			else if (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) sb.append("right").append("\n");
			else sb.append("wrong").append("\n");
		}
		
		System.out.println(sb);
	}
}
