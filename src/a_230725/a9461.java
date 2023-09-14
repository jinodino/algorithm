package a_230725;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a9461 {
	static int n;
	
	static long dp[];
	
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());
        
       
        
        for (int i = 0; i < T; i++) {
        	n = Integer.parseInt(br.readLine());
        	
            dp = new long[n + 1];
            
            if (n < 4) {
            	sb.append(1).append("\n");
            	continue;
            }
            
            dp[0] = 0;
            dp[1] = 1;
            dp[2] = 1;
            dp[3] = 1;
            
            sb.append(find(n)).append("\n");
        }
        
        System.out.println(sb);
    }
    
    public static long find(int a)
    {
    	if(dp[a] == 0) {
			dp[a] = find(a - 3) + find(a - 2);
		}
		
		return dp[a];
    }
}
