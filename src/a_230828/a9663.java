package a_230828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a9663 {
	
	static int n;
	static int cnt;
	
	public static int[] arr;
	
	
	public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        arr = new int[15];
        
		dfs(0);
		
		System.out.println(cnt);
    }

	
	static void dfs(int depth)
	{
		if (depth == n) {
			cnt++;
			return;
		}
		
		for (int i = 0 ; i < n; i++) {
			arr[depth] = i;
			
			if (possibility(depth)) {
				dfs(depth + 1);
			}
		}
	}
	
	public static boolean possibility(int col) {
		
		for (int i = 0 ; i < col; i++) {
			
			// 같은 행인지 확인
			if (arr[col] == arr[i]) {
				return false;
			}
			
			// 대각선인지 확인
			if(Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
				return false;
			}
			
		}
		
		return true;
	}
}
