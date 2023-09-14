package a_230801;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class a10026 {
	static int n, m, h;
	static boolean[][][] visited;
	static int[][][] map;
	
	static int[] dz = {0, 0, 0, 0, 1, -1};
	static int[] dy = {-1, 0 ,1, 0, 0, 0};
	static int[] dx = {0, 1, 0, -1, 0, 0};
	
	static Queue<int[]> q;
	
	public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        visited = new boolean[h][m][n];
        map = new int[h][m][n];
        
        q = new LinkedList<int[]>();
        int zeroCnt = 0;
        
        for (int k = 0 ; k < h ; k++) {
        	for (int i = 0 ; i < m ; i++) {
            	st = new StringTokenizer(br.readLine());
            	for (int j = 0 ; j < n ; j++) {
            		map[k][i][j] = Integer.parseInt(st.nextToken());
            		if (map[k][i][j] == 1) q.add(new int[] {k, i, j});
            		else if (map[k][i][j] == 0) zeroCnt++;
                }
            }
        }
       
        if (q.size() > 0 && zeroCnt == 0) {
        	System.out.println(0);
        } else {
        	System.out.println(bfs());
        }
    }
	
	public static int bfs()
	{
		int date = 0;
		while (!q.isEmpty()) {
			int[] temp = q.poll();
			int z = temp[0];
			int y = temp[1];
			int x = temp[2];
			
			visited[z][y][x] = true;
			
			for (int i = 0 ; i < 6; i++) {
				int az = z + dz[i];
				int ay = y + dy[i];
				int ax = x + dx[i];
				
				if ((az >= 0 && ay >= 0 && ax >= 0) && (az < h && ay < m && ax < n)) {
					if (map[az][ay][ax] == 0 && !visited[az][ay][ax]) {
						int tmpDate = map[z][y][x] + 1;
						map[az][ay][ax] = tmpDate;
						q.add(new int[] {az, ay, ax});
						
						if (tmpDate > date) {
							date = tmpDate;
						}
					}
				}
			}
		}
		
		if (zeroCheck()) return date - 1;
		else return -1;
	}
	
	public static boolean zeroCheck() 
	{
		for (int k = 0 ; k < h ; k++) {
        	for (int i = 0 ; i < m ; i++) {
            	for (int j = 0 ; j < n ; j++) {
            		if (map[k][i][j] == 0) return false;
                }
            }
        }
		
		return true;
	}
}
