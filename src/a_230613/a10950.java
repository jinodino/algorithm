package a_230613;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a10950 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int T = Integer.parseInt(br.readLine());
	
		for (int i = 0 ; i < T ;i ++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sb.append(a + b).append("\n");
		}
		
		System.out.println(sb);
		
		int[][] a = new int[2][3];
		
		for (int i = 0 ; i < 2; i++) {
			for (int j = 0 ; j < 3; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}
