package a_230620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a1074_m {
	static int N, Cn, r, c, num, target;
	static boolean hasTarget;
	static int dy[] = {0, 0, 1, 1};
	static int dx[] = {0, 1, 0, 1};
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 크기
        N = Integer.parseInt(st.nextToken());
        // 행
        r = Integer.parseInt(st.nextToken());
        // 열
        c = Integer.parseInt(st.nextToken());
        
        Cn = N;
        num = 0;
        
        hasTarget = false;
        
        target = (int) Math.pow(2, --Cn);
        
        if (target == 1) {
        	for (int i = 0 ; i < 4; i++) {
    			int ay = dy[i];
    			int bx = dx[i];
    			num++;
    			if (ay == r && bx == c) {
    				hasTarget = true;
    				break;
    			}
        	}
        	
        	sb.append(--num);
        	
        	System.out.println(sb);
        	return;
        }
        
        int vit1[][] = {{0, 0}, {0, target}, {target, 0}, {target, target}};
        
        for (int i = 0 ; i < 4; i++) {
    		int y = vit1[i][0];
    		int x = vit1[i][1];
    		
    		division(y, x);
    		
    		if (hasTarget) break;
    		
    		Cn = N - 1;
    	}
        
        
        sb.append(--num);
        
        System.out.println(sb);
    }
    
    public static void division(int a, int b)
    {
    	// 각 스타트 포인트
    	int pow = (int) Math.pow(2, --Cn);
    	
    	if (hasTarget) return;
    	else if (pow == 1) {
    		for (int i = 0 ; i < 4; i++) {
    			int ay = a + dy[i];
    			int bx = b + dx[i];
    			num++;
    			if (ay == r && bx == c) {
    				hasTarget = true;
    				return;
    			}
        	}
    		return;
    	} 
    	
    	int vit2[][] = {{a, b}, {a, b + pow}, {a + pow, b}, {a + pow, b + pow}};
    
    	for (int i = 0 ; i < 4; i++) {
    		int y = vit2[i][0];
    		int x = vit2[i][1];
    		division(y, x);
    		if (hasTarget) return;
    		Cn++;
    	}
    }
}
