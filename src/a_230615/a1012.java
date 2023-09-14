package a_230615;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a1012 {
	// 배추밭의 가로 길이(x)
    private static int M;
    
    // 배추밭의 세로 길이(y)
    private static int N;
    
    // 배추밭
    private static int[][] area;
    
    // 구역 방문 여부
    private static boolean[][] visited;
    
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    
    /**
     * 메인 함수
     *https://yubh1017.tistory.com/89
     * @param args: [String[]] 매개변수
     *
     * @throws IOException 데이터 입출력 예외
     */
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        
        // 케이스 수
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++)
        {
            String[] temp = br.readLine().split(" ");
            
            M = Integer.parseInt(temp[0]);
            
            N = Integer.parseInt(temp[1]);
            
            // 배추 갯수
            int K = Integer.parseInt(temp[2]);
            
            area = new int[N][M];
            
            visited = new boolean[N][M];
            
            // 필요한 배추흰지렁이 수
            int bugs = 0;
            
            for (int j = 0; j < K; j++)
            {
                temp = br.readLine().split(" ");
                
                int x = Integer.parseInt(temp[0]);
                int y = Integer.parseInt(temp[1]);
                
                area[y][x] = 1;
            }
            
            for (int a = 0; a < N; a++)
            {
                for (int b = 0; b < M; b++)
                {
                    // 방문하지 않은 구역에 배추가 있을 경우
                    if (area[a][b] == 1 && !visited[a][b])
                    {
                        bugs++;
                        visited[a][b] = true;
                        dfs(a, b);
                    }
                }
            }
            
            sb.append(bugs).append("\n");
        }
        
        System.out.println(sb);
    }
    

    private static void dfs(int y, int x)
    {
    	int nx, ny;
    	
    	for (int i = 0 ; i < 4 ; i++) {
    		ny = y + dy[i];
    		nx = x + dx[i];
    		
    		if (ny >= 0 && ny < N && nx >= 0 && nx < M) {
    			if (area[ny][nx] == 1 && !visited[ny][nx]) {
    				visited[ny][nx] = true;
    				dfs(ny, nx);
    			}
    		}
    	}
    }
}
