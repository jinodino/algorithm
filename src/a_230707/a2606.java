package a_230707;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class a2606 {
	static int n, k;
	static int area[][];
	static boolean visited[][];
	static Queue<Integer> q;
	
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        
        // 컴퓨터 수
        n = Integer.parseInt(br.readLine());
        // 컴퓨터 쌍의 수
        k = Integer.parseInt(br.readLine());
        area = new int[n + 1][n + 1];
        visited = new boolean[n + 1][n + 1];
        q = new LinkedList<Integer>();
        
        for (int i = 0 ; i < k; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	
        	area[a][b] = area[b][a] = 1; 
        }
        
        q.add(1);
        dfs(1);
        
    	sb.append(q.size() - 1).append("\n");
                
        System.out.println(sb);
    }
    
    public static void dfs(int t)
    {
    	for (int i = 1; i <= n; i++) {
    		if (visited[t][i] == false && area[t][i] == 1 && q.contains(t)) {
    			visited[t][i] = true;
    			if (!q.contains(i)) q.add(i); 
    			dfs(i);
    		}
    	}
    }
}
