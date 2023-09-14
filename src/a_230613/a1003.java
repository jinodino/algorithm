package a_230613;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a1003 {
	static int[][] dp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int T = Integer.parseInt(br.readLine());
		dp = new int[41][2];
		dp[0][0] = 1;
		dp[1][1] = 1;
		for (int i = 0 ; i < T ; i++) {
			int target = Integer.parseInt(br.readLine());
			for (int k = 2 ; k <= target ; k++) {
				fibonacci(k);

			}
			sb.append(dp[target][0] + " " + dp[target][1]).append("\n");
		}
		
		System.out.println(sb);
	}
	
	static public void fibonacci(int n) 
	{
		dp[n][0] = dp[n - 1][0] + dp[n - 2][0];
		dp[n][1] = dp[n - 1][1] + dp[n - 2][1];
	}
}
