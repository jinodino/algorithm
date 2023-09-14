package a_230824;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a15650 {
	
	static int n;
	static int m;
	
	public static int[] arr;
	public static boolean[] visit;
	
	public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
		visit = new boolean[n];
		arr = new int[m];
		
		dfs(0, 0);
		
    }

	
	static void dfs(int depth, int index)
	{
		if (depth == m) {
			for (int i = 0 ; i < m ; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
 
		for (int i = index; i < n; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;
				dfs(depth + 1, i + 1);
				visit[i] = false;
			}
		}
	}
}
