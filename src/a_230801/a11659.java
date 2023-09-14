package a_230801;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a11659 {
	static int n, m;

	public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        int arr[] = new int[n + 1];
        int sum[] = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1 ; i <= n ; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
    		sum[i] = sum[i - 1] + arr[i];
        }
        
        for (int i = 0 ; i < m ; i++) {
        	st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	
        	if (a == b) {
        		sb.append(arr[a]).append("\n");
        		continue;
        	}
        	
        	int ans = sum[b] - sum[a - 1];
        	
        	sb.append(ans).append("\n");
        }
        
        System.out.println(sb);
    }
	
}
