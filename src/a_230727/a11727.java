package a_230727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a11727 {
	static int n;
	static int[] dp;

	public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        
        dp = new int[1001];
        
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 3;
        
        System.out.println(find(n));
    }
	
	public static int find(int a) 
	{
		if (dp[a] == 0) {
			dp[a] =  ((find(a - 2) * 2) + find(a - 1)) % 10007;
		}
		
		return dp[a];
	}
}
