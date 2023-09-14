package a_230714;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a2579 {
	static int n;
	
	static Integer dp[];
	static int arr[];
	
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());

        arr = new int[n + 1];
        dp = new Integer[n + 1];
        
        for (int i = 1 ; i <= n; i++) {
        	arr[i] = Integer.parseInt(br.readLine());
        }
        
    	dp[0] = arr[0];	
		dp[1] = arr[1];
		
		if(n >= 2) {
			dp[2] = arr[1] + arr[2];
		}
		
		System.out.println(find(n));
//    
    }
    
    public static int find(int a)
    {
    	if(dp[a] == null) {
			dp[a] = Math.max(find(a - 2), find(a - 3) + arr[a - 1]) + arr[a];
		}
		
		return dp[a];
    }
}
