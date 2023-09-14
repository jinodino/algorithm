package a_230609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a11050 {
	static BufferedReader br;
	static StringTokenizer st;
	static int a, b, result;
	
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		
		result = factorial(a) / (factorial(b) * factorial(a - b));

		System.out.println(result);
		
	}
	
	static public int factorial(int target)
	{
		int result = 1;
		for (int i = target; i >= 1; i--) {
			result *= i;
		}
		
		return result;
	}
}
