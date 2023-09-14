package a_230726;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class a1697 {
	static int n, k;
	static int[] visited;
	static Queue<Integer> q;

	public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        visited = new int[100001];
        q = new LinkedList<Integer>();
        if (n == k) {
        	System.out.println(0);
        } else {
        	System.out.println(bfs(n));
        }
    }
    
    public static int bfs(int a)
    {
    	visited[a] = 1;
    	q.add(a);
    	int date = q.peek();
    	while (!q.isEmpty()) {
    		date = q.poll();
    		for (int i = 0 ; i < 3; i++) {
    			int index = 0;
    			if (i == 0) {
    				index = date - 1;
    			} else if(i == 1) {
    				index = date + 1;
    			} else {
    				index = date * 2;
    			}
    			
    			if (index == k) return visited[date];
    			if (index >= 0 && index <= 100000) {
    				if (visited[index] == 0) {
    					visited[index] = visited[date] + 1;
        				q.add(index);
    				}
    			}
    		}
    	}
    	
    	return visited[date];
    }
}
