package a_231003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class a11725 {
	
	static int n;
	
	public static int[] ans;
	public static ArrayList<Integer> arr[];
	public static boolean[] visited;
	
	public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        ans = new int[n + 1];
        arr = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        
        for (int i = 0 ; i < n + 1; i++) {
        	arr[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < n - 1; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	
        	arr[a].add(b);
        	arr[b].add(a);
        }
        
        dfs(1);
        
        for (int i = 2 ; i <= n ; i++) {
        	System.out.println(ans[i]);
        }
    }
	
	static void dfs(int depth)
	{
		visited[depth] = true;
		for (int i : arr[depth]) {
			if (!visited[i]) {
				// i는 해당 노드, depth가 보무 노드 
				ans[i] = depth;
				dfs(i);
			}
		}
	}
	
}
