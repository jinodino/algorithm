package a_230712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class a2718 {
	static int n, m, cnt;
	static int area[][], visited[][];
	static int ay[] = {-1, 0, 1, 0};
	static int ax[] = {0, 1, 0 ,-1};
	static Queue<Integer> q;
	
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 컴퓨터 수
        n = Integer.parseInt(st.nextToken());
        // 컴퓨터 쌍의 수
        m = Integer.parseInt(st.nextToken());
        area = new int[n][m];
        visited = new int[n][m];
        cnt = 1;
        q = new LinkedList<Integer>();
        
        for (int i = 0 ; i < n; i++) {
        	String line = br.readLine();
        	for (int j = 0; j < m; j++) {
        		area[i][j] = Integer.parseInt(line.substring(j, j + 1));
        	}
        }
        
        graph(0, 0, 1);
        visited[0][0] = cnt;
        
        while (!q.isEmpty()) {
        	int roop = q.size() / 2;
        
        	cnt++;
        	
        	while (roop > 0) {
        		int dy = q.poll();
            	int dx = q.poll();
        		graph(dy, dx, cnt);
        		roop--;
        	}
        }
        
//        for (int i = 0 ; i < n; i++) {
//        	for (int j = 0; j < m; j++) {
//        		System.out.print(visited[i][j] + " ");
//        	}
//        	System.out.println();
//        }
//  
        System.out.println(visited[n - 1][m - 1]);
    }
    
    public static void graph(int a, int b, int ccnt)
    {
    	if (area[a][b] == 0) {
    		visited[a][b] = 0;
    		return;
    	} else if (area[a][b] == 1 && visited[a][b] != 0) {
    		return;
    	}
    	
    	visited[a][b] = ccnt;
    	
    	for (int i = 0; i < 4; i++) {
    		int dy = ay[i] + a;
    		int dx = ax[i] + b;
    		
    		if ((dy >= 0 && dy < n) && (dx >= 0 && dx < m)) {
    			q.add(dy);
    			q.add(dx);
//    			graph(dy, dx, ccnt + 1);
    		}
    	}
    }
}
