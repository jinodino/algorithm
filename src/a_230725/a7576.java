package a_230725;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class a7576 {
	static int n, m, date, zeroCnt;
	
	static int map[][];
	static Queue<int []> q;
	
	static int dy[] = {-1 , 0, 1, 0};
	static int dx[] = {0, 1, 0, -1};
	
	static boolean f = false;
	
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        date = 0;
        zeroCnt = 0;
        map = new int[m][n];
        q = new LinkedList<int []>();
        
        for (int i = 0; i < m; i++) {
        	st = new StringTokenizer(br.readLine());
        	for (int j = 0; j < n; j++) {
        		map[i][j] = Integer.parseInt(st.nextToken());
        		if (map[i][j] == 1) {
        			q.add(new int[]{i, j}); 
        		}
        		if (map[i][j] == 0) {
        			zeroCnt++;
        		}
        	}
        }
        
        if (zeroCnt == 0) {
        	sb.append(0);
        } else {
        	find();
        	if (zeroCheck()) {
        		sb.append(date - 1);	
        	} else {
        		sb.append(-1);
        	}
        }
        
        System.out.println(sb);
    }
    
    public static void find()
    {
    	while (!q.isEmpty()) {
    		int[] t = q.poll();
    		int y = t[0];
    		int x = t[1];
    		
    		for (int i = 0; i < 4; i++) {
    			int ay = y + dy[i];
    			int ax = x + dx[i];

    			if ((ay >= 0) && (ay < m) && (ax >= 0) && (ax < n)) {
    				if (map[ay][ax] == 0) {
    					map[ay][ax] = map[y][x] + 1;
    					if (map[ay][ax] > date)  {
    						date = map[ay][ax];
    					}
    					q.add(new int[]{ay, ax});
    				}
    			}
    		}
    	}
    }
    
    public static boolean zeroCheck() 
    {
    	for (int i = 0 ; i < m; i++) {
    		for (int j = 0 ; j < n; j++) {
    			if (map[i][j] == 0) return false;
    		}
    	}
    	return true;
    }
}
