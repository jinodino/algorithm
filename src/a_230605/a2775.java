package a_230605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a2775 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int T = Integer.parseInt(br.readLine());
		
		int arr[][] = new int[16][16];
		for (int i = 1; i <= 15; i++) {
			arr[i][1] = 1;
			arr[0][i] = i;
		}
		
		for (int x = 0; x < T; x++) {
			// 층
			int h = Integer.parseInt(br.readLine());
			// 호수
			int i = Integer.parseInt(br.readLine());
			

			for (int j = 1; j <= h; j++) {
				for (int s = 1; s <= i; s++) {
					if (arr[j][s] != 0) continue;
					int sum = 0;
					for (int q = 1; q <= s; q++) {
						sum += arr[j-1][q];
					}
					arr[j][s] = sum;
				}
			}
			sb.append(arr[h][i]).append("\n");		
		}
		
		System.out.println(sb);
	}
}
