package a_230607;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a1018 {
	static int N, M;
	static String[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new String[N][M];
		for (int i = 0; i < N; i++) {
			String word = br.readLine();
			for (int j = 0; j < M; j++) {
				arr[i][j] = word.substring(j, j + 1);
			}
		}
		
		
		int a = aa("W");
		int b = aa("B");
		
		System.out.println(Math.min(a, b));
	}
	
	static public int aa(String color)
	{
		int minDiff = Integer.MAX_VALUE;
		for (int k = 0 ; k <= N - 8; k++) {
			for (int s= 0 ; s <= M - 8; s++) {
				int mistake = 0;
				String target = color;
				for (int i = k; i < k + 8; i++) {
					for (int j = s; j < s + 8; j++) {
						if (target.equals(arr[i][j])) {
							target = target.equals("W") ? "B" : "W"; 
							mistake++; 
						} else {
							target = arr[i][j];
						}
					}
					
					if (target.equals("W")) target = "B";
					else target = "W";
				}
				if (mistake < minDiff) minDiff = mistake;
			}
		}
		
		return minDiff;
	}
}
