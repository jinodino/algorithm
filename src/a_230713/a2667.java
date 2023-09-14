package a_230713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class a2667 {
	static int n, cnt, indCnt;
	static int area[][];
	static boolean visited[][];
	static int ay[] = {-1, 0, 1, 0};
	static int ax[] = {0, 1, 0 ,-1};
	static PriorityQueue<Integer> q;
	
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        
        // 컴퓨터 수
        n = Integer.parseInt(st.nextToken());
        
        area = new int[n][n];
        visited = new boolean[n][n];
        cnt = indCnt = 0;
        q = new PriorityQueue<Integer>();
        
        for (int i = 0 ; i < n; i++) {
        	String line = br.readLine();
        	for (int j = 0; j < n; j++) {
        		
        		area[i][j] = Integer.parseInt(line.substring(j, j + 1));
        	}
        }
        
        for (int i = 0 ; i < n; i++) {
        	for (int j = 0; j < n; j++) {
        		if (area[i][j] == 1 && !visited[i][j]) {
        			cnt++;
        		}
        		dfs(i, j);
        		
        		if (indCnt > 0) {
        			q.add(indCnt);
        			indCnt = 0;
        		}
        	}
        }

        sb.append(cnt).append("\n");
        while(!q.isEmpty()) {
        	sb.append(q.poll()).append("\n");
        }
        System.out.println(sb);
    }
    
    public static void dfs(int a, int b)
    {
    	if (area[a][b] == 0) {
    		return;
    	} else if (area[a][b] == 1 && visited[a][b]) {
    		return;
    	}
    	
    	visited[a][b] = true;
    	indCnt++;
    	for (int i = 0; i < 4; i++) {
    		int dy = ay[i] + a;
    		int dx = ax[i] + b;
    		
    		if ((dy >= 0 && dy < n) && (dx >= 0 && dx < n) 
    				&& (area[dy][dx] == 1 && !visited[dy][dx])) {
    			
    			dfs(dy, dx);
    		}
    	}
    }
}
