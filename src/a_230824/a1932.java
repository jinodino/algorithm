package a_230824;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a1932 {
	
	static int arr[][];
	static int dp[][];

	public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        arr = new int[n + 1][n];
        dp = new int[n + 1][n];
        
        int index = 0;
        for (int i = 1; i <= n; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for (int j = 0 ; j <= index ; j++) {
        		arr[i][j] = Integer.parseInt(st.nextToken());
        	}
        	index++;
        }
        
        dp[1][0] = arr[1][0];
        int ans = dp[1][0];
        for (int i = 2; i <= n; i++) {
        	ans = Math.max(ans, dpp(i));
        }
        
        
//        for (int i = 1; i <= n; i++) {
//        	System.out.println(Arrays.toString(dp[i]));
//        }
        
        
        
        
        System.out.println(ans);
    }
	
	static int dpp(int a) {
		int max = 0;
		if (dp[a][0] == 0) {
			for (int i = 0 ; i < a ; i++) {
				if ((i + 1) % 2 == 0) {
//					System.out.println(a + "@@" + i + "@@"+ dp[a - 1][i - 1] + "@@" +arr[a][i]);
//					dp[a][i] = arr[a][i] + Math.max(dp[a - 1][i - 1], dp[a - 1][i]);
					dp[a][i] = arr[a][i] + Math.max(dp[a - 1][i - 1], dp[a - 1][i]);
				} else if (i == 0){
					dp[a][i] = arr[a][i] + dp[a - 1][i];
				} else {
					dp[a][i] = arr[a][i] + Math.max(dp[a - 1][i - 1], dp[a - 1][i]);
				}
				
				max = Math.max(max, dp[a][i]);
			}
		}
		
		return max;
	}
}
