package a_231004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a9465 {
	
	static int t, n;
	
	public static int dp[][];
	public static int arr[][];
	public static boolean[][] visited;
	
	public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());

        for (int c = 0; c < t; c++) {
        	n = Integer.parseInt(br.readLine());
        	arr = new int[2][n + 1];
    		dp = new int[2][n + 1];
        	for (int i = 0; i < 2; i++) {
        		StringTokenizer st = new StringTokenizer(br.readLine());
        		for (int j = 1; j <= n; j++) {
                	arr[i][j] = Integer.parseInt(st.nextToken());
        		}
        	}
        	dp[0][1] = arr[0][1];
			dp[1][1] = arr[1][1];
			for(int x = 2; x <= n; x++) {
				dp[0][x] = Math.max(dp[1][x-1], dp[1][x-2]) + arr[0][x];
				dp[1][x] = Math.max(dp[0][x-1], dp[0][x-2]) + arr[1][x];
			}
        }

    }
}
