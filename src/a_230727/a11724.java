package a_230727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a11724 {
	static int n, k, cnt;
	static int[][] map;
	static boolean[] visited;

	public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        cnt = 0;
        map = new int[n + 1][n + 1];
        visited = new boolean[n + 1];
        
        for (int i = 0; i < k; i++) {
        	st = new StringTokenizer(br.readLine());
    		int a = Integer.parseInt(st.nextToken());
    		int b = Integer.parseInt(st.nextToken());
    		map[a][b] = map[b][a] = 1;
        }
        
        // dfs탐색
        for (int i = 1; i <= n; i++) {
        	if (visited[i] == false) {
        		dfs(i);
        		cnt++;
        	}
        }
        
       
        System.out.println(cnt);
    }
	
	public static void dfs(int index) 
	{
		if (visited[index] == true) return;
		
		visited[index] = true;
		for (int i = 1 ; i <= n; i++) {
			if (map[index][i] == 1) {
				dfs(i);
			}
		}
	}
}
