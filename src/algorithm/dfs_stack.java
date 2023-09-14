package algorithm;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class dfs_stack {
	
	static final int MAX_N = 10;
	static int N, E;
	static int[][] graph = new int[MAX_N][MAX_N];
	
	static void dfs(int node) {
		// TODO input type
		// 5 6
		// 0 1 0 2 1 3 1 4 2 4 3 4
		boolean[] visited = new boolean[MAX_N];
		
		Stack<Integer> mystack = new Stack<>();
		mystack.push(node);
		
		while(!mystack.empty()) {
			int curr = mystack.pop();
			
			if(visited[curr]) continue;
			
			visited[curr] = true;
			System.out.println(curr + " ");
			
			for (int next = 0; next < N; next++) {
				if (!visited[next] && graph[curr][next] != 0) {
					mystack.push(next);
				}
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
		
		dfs(0);	
	}

}
