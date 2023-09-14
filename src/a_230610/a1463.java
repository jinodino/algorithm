package a_230610;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class a1463 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int X = Integer.parseInt(br.readLine());
		int[] dp = new int[X + 1]; 
		
		
		int a, b, c;
		for (int i = 2; i <= X; i++) {
			a = b = c = Integer.MAX_VALUE;
			if (i % 3 == 0) a  = dp[i / 3] + 1;
			else if (i % 2 == 0) b =  dp[i] = dp[i / 2] + 1;
			
			c = dp[i - 1] + 1;
			
			dp[i] = Math.min(a, Math.min(b, c));
		}
		
		System.out.println(dp[X]);
		
		
	}
}
