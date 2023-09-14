package a_230615;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a1012_a {
	// x
    private static int M;
    
    // y
    private static int N;
    
    private static int[][] area;
    
    private static boolean[][] visited;
    
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        
        // 케이스 수
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int bugCount = 0;
            area = new int[N][M];
            visited = new boolean[N][M];
            
            for (int j = 0; j < K; j++) {
            	st = new StringTokenizer(br.readLine());
            	int bx = Integer.parseInt(st.nextToken());
            	int by = Integer.parseInt(st.nextToken());

        		area[by][bx] = 1;
            }
            
            for (int a = 0 ; a < N; a++) {
            	for (int b = 0 ; b < M; b++) {
            		if (area[a][b] == 1 && !visited[a][b]) {
            			bugCount++;
            			visited[a][b] = true;
            			dfs(a, b);
            		}
            	}
            }
            
            sb.append(bugCount).append("\n");
        }
        
        System.out.println(sb);
    }
    

    private static void dfs(int y, int x)
    {
    	int ay, ax;
    	
    	for (int i = 0 ; i < 4; i++) {
    		ay = y + dy[i];
    		ax = x + dx[i];
    		
    		if (ay >= 0 && ay < N && ax >= 0 && ax < M) {
    			if (area[ay][ax] == 1 && !visited[ay][ax]) {
    				visited[ay][ax] = true;
    				dfs(ay, ax);
    			}
    		}
    	}
    }
}
