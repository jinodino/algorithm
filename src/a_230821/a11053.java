package a_230821;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a11053 {
	
	static int arr[];
	static int dp[];
	
	public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        dp = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < n ; i++) {
        	int a = Integer.parseInt(st.nextToken());
        	
        	arr[i] = a;
        }
        
        for (int i = 0 ; i < n; i++) {
        	LIS(i);
        }
        
        int max = 0;
        for (int i = 0 ; i < n; i++) {
        	max = Math.max(max, dp[i]);
        }
        
        System.out.println(Arrays.toString(dp));
        System.out.println(max);
    }
	
	static int LIS(int b)
	{
		if (dp[b] == 0) {
			dp[b] = 1;
			
			for (int i = b - 1; i >= 0; i--) {
				if (arr[b] > arr[i]) {
					System.out.println(b + "@@" + arr[i]);	
					dp[b] = Math.max(dp[b], LIS(i) + 1);
				}
			}
		}
		
		return dp[b];
	}
}
