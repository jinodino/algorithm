package a_230419;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a1080 {

	public static int[][] arr;
	public static int[][] answer;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		arr = new int[N][M];
		answer = new int[N][M];
		
		// 기본판
		for (int i = 0 ; i < N; i++) {
			String row = br.readLine();
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(row.substring(j, j+1)); 
			}
		}
		
		// 정답판
		for (int i = 0 ; i < N; i++) {
			String row = br.readLine();
			for (int j = 0; j < M; j++) {
				answer[i][j] = Integer.parseInt(row.substring(j, j+1)); 
			}
		}
		
		int count = 0;
		for (int i = 0 ; i < N - 2; i++) {
			for (int j = 0; j < M - 2; j++) {
				if (arr[i][j] != answer[i][j]) {
					change(i, j);
					count++;
				}
			}
		}
		
		for (int i = 0 ; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		for (int i = 0 ; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(answer[i][j]);
			}
			System.out.println();
		}
		
		
		
		for (int i = 0 ; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (arr[i][j] != answer[i][j]) {
					System.out.println(-1);
					return;
				}
			}
		}
		
		System.out.println(count);
	}
	
	public static void change(int x , int y) {
		for (int i = x ; i < x + 3; i++) {
			for (int j = y; j < y + 3; j++) {
				arr[i][j] = arr[i][j] == 1 ? 0 : 1;
			}
		}
	}

}
