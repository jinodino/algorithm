package a_230605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a2609 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int gcd = gcd(a, b);
		System.out.println(gcd + " " + (a * b) / gcd);

	}
	
	static public int gcd(int a, int b)
	{
		if (a % b == 0) return b;
		else return gcd(b, a % b);
	}
}
