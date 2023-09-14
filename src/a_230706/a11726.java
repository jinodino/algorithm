package a_230706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class a11726 {
	static int arr[];
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        
        int n = Integer.parseInt(br.readLine());
        arr = new int[n + 2];
        arr[1] = 1;
        arr[2] = 2;
        
        if (n > 2) {
            for (int i = 3; i <= n; i++) {
        	    arr[i] = dp(i) % 10007;
            }    
        } 

    	sb.append(arr[n]).append("\n");
                
        System.out.println(sb);
    }
    
    public static int dp(int b)
    {
    	if (arr[b] != 0) return arr[b]; 
    	return dp(b-2) + dp(b-1);
    }
}
