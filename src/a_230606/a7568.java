package a_230606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a7568 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int N = Integer.parseInt(br.readLine());
		
		int arr[][] = new int[N][2];
		int rank[][] = new int[N][1];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			arr[i][0] = a;
			arr[i][1] = b;
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i == j) continue;
				if ((arr[i][0] < arr[j][0]) && (arr[i][1] < arr[j][1])) {
					rank[i][0]++;
				}
			}
			
		}
		
		for (int i = 0; i < N; i++) {
			sb.append(rank[i][0] + 1).append(" ");
		}
		
		System.out.println(sb);
	}
}
