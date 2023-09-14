package a_230830;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class a14502 {
	
static int n, m, wall;
	
	public static int[][] arr;
	public static boolean[][] visited;
	public static Map<Integer, int[]> map;
	public static Queue<int[]> q;
	
	public static int[] dy = {-1, 0, 1, 0};
	public static int[] dx = {0, 1, 0, -1};
	
	
	
	
	public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        map = new HashMap<Integer, int[]>();
        
        int zeroIndex = 0;
        
        for (int i = 0 ; i < n ; i++) {
        	st = new StringTokenizer(br.readLine());
        	for (int j = 0 ; j < m ; j++) {
        		arr[i][j] = Integer.parseInt(st.nextToken());
        		if (arr[i][j] == 0) map.put(zeroIndex++, new int[] {i, j});
        		
        	}
        }
        
        int size = map.size();
        int max = 0;
        for (int i = 0 ; i < size - 2 ; i++) {
        	for (int j = i + 1 ; j < size - 1; j++) {
        		for (int k = j + 1 ; k < size ; k++) {
        			int[] a = map.get(i);
        			int[] b = map.get(j);
        			int[] c = map.get(k);
        			
        			max = Math.max(max, wall(a, b, c));
        		}
        	}
        }
        
        System.out.println(max);
        // 1. 빈칸을 다 찾아서 리스트에 넣는다.
        // 2. 빈칸 3개를 쳤을 시 감염시키고 남은 빈칸을 배열에 넣는다.
        // 3. 그걸 끝까지 다 끝내면 가장 높은 수의 값을 출력한다 
    }

	
	static int wall(int[] ta, int[] tb, int[] tc)
	{
		arr[ta[0]][ta[1]] = 1;
		arr[tb[0]][tb[1]] = 1;
		arr[tc[0]][tc[1]] = 1;

		int ans = infection();
		
		arr[ta[0]][ta[1]] = 0;
		arr[tb[0]][tb[1]] = 0;
		arr[tc[0]][tc[1]] = 0;
		
		return ans;
	}
	
	static int infection()
	{
		visited = new boolean[n][m];
		int[][] copy = new int[n][m]; 
		q = new LinkedList<int[]>();
		
		for (int i = 0 ; i < n ; i++) {
			copy[i] = arr[i].clone();
        }
		
		for (int i = 0 ; i < n ; i++) {
        	for (int j = 0 ; j < m ; j++) {
        		if (copy[i][j] == 2) q.add(new int[] {i, j});
        	}
        }
		
		while (!q.isEmpty()) {
			int[] a = q.poll();
			visited[a[0]][a[1]] = true;
			
			for (int i = 0 ; i < 4; i++) {
				int ay = a[0] + dy[i];
				int ax = a[1] + dx[i];
				
				if (((ay >= 0) && (ay < n)) && ((ax >= 0) && (ax < m))) {
					if (!visited[ay][ax] && copy[ay][ax] == 0) {
						copy[ay][ax] = 2;
						q.add(new int[] {ay, ax});
					}
				}
			}
		}
		
		return checkTwo(copy);
	}
	
	static int checkTwo(int[][] copyArr)
	{
		int cnt = 0;
		
		for (int i = 0 ; i < n; i++) {
			for (int j = 0 ; j < m; j++) {
				if (copyArr[i][j] == 0) cnt++;
			}
		}
		
		return cnt;
	}
}
