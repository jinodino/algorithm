package a_230830;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a15652 {
	
	static int n, m, pivot;
	
	public static int[] arr;
	
	
	public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        pivot = 0;
        
		dfs(0);
    }

	
	static void dfs(int depth)
	{
		if (depth == m) {
			for (int val : arr) {
				System.out.print(val + " ");
			}
			
			System.out.println();
			return;
		}
		
		for (int i = 0 ; i < n; i++) {
			if (i >= pivot) {
				arr[depth] = i + 1;
				dfs(depth + 1);
				pivot = i + 1;
			}
		}
	}
	
}
