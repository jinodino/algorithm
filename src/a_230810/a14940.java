package a_230810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class a14940 {
	
	static int n, m;
	static int arr[][];
	static int distance[][];
	static boolean visitied[][];
	static Queue<int[]> q;
	static int[] dy = {-1, 0, 1, 0};
	static int[] dx = {0, 1, 0, -1};

	public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        arr = new int[n][m];
        distance = new int[n][m];
        visitied = new boolean[n][m];
        q = new LinkedList<int[]>();
        
        for (int i = 0 ; i < n ; i++) {
        	st = new StringTokenizer(br.readLine());
        	for (int j = 0 ; j < m ; j++) {
        		arr[i][j] = Integer.parseInt(st.nextToken());
        		if(arr[i][j] == 2) q.add(new int[] {i, j});
        	}
        }
        
        
        bfs();
        distanceCheck();
     
        for (int i = 0 ; i < n ; i++) {
        	for (int j = 0 ; j < m ; j++) {
        		sb.append(distance[i][j] + " ");
        	}
        	sb.append("\n");
        }
        
        System.out.println(sb);
    }
	
	static void bfs()
	{
		
		while (!q.isEmpty()) {
			int[] temp = q.poll();
			int y = temp[0];
			int x = temp[1];
			
			if (visitied[y][x]) continue;
			
			visitied[y][x] = true;
			
			for (int i = 0 ; i < 4; i++) {
				int ay = y + dy[i];
				int ax = x + dx[i];
				
				if ((ay >= 0 && ay < n) && (ax >= 0 && ax < m)) {
					if (arr[ay][ax] == 1 && !visitied[ay][ax]) {
						distance[ay][ax] = distance[y][x] + 1;
						q.add(new int[] {ay, ax});
					}
				}
			}
		}
	}
	
	static void distanceCheck()
	{
		for (int i = 0 ; i < n; i++) {
			for (int j = 0 ; j < m; j++) {
				if (arr[i][j] == 1 && !visitied[i][j]) {
					distance[i][j] = -1;
				}
			}
		}
	}
	
}
