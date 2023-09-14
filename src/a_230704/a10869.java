package a_230704;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a10869 {
	static int arr[];
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        
        
        int T = Integer.parseInt(br.readLine());
        arr = new int[11];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4; 
        
        for (int i = 4; i <= 10; i++) {
        	arr[i] = dp(i);
        }

        for (int i = 0; i < T; i++) {
        	int n = Integer.parseInt(br.readLine());
        	sb.append(arr[n]).append("\n");
        }
                
        System.out.println(sb);
    }
    
    public static int dp(int b)
    {
    	if (arr[b] != 0) return arr[b]; 
    	return dp(b-3) + dp(b-2) + dp(b-1);
    }
}
