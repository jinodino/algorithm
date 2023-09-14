package algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class dfs {

	static final int MAX_N = 10;
	static int N, E;
	static int[][] graph = new int[MAX_N][MAX_N];
	static boolean[] visited = new boolean[MAX_N];
	
	static void dfs(int node) {
		// TODO input type
		// 5 6
		// 0 1 0 2 1 3 1 4 2 4 3 4
		visited[node] = true;
		System.out.println(node + " ");
		
		for (int next = 0; next < N; next++) {
			if (!visited[next] && graph[node][next] != 0) {
				System.out.println(node + "@" + next);
				dfs(next);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		E = sc.nextInt();
		
		for (int i = 0; i < E; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			graph[u][v] = graph[v][u] = 1;  
		}
		
		System.out.println(Arrays.toString(visited));
		
		dfs(0);	
	}

}
