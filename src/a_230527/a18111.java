package a_230527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a18111 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 열
		int N = Integer.parseInt(st.nextToken());
		// 행
		int M = Integer.parseInt(st.nextToken());
		// 인벤토리 박스
		int B = Integer.parseInt(st.nextToken());
		// 전체
		int time = Integer.MAX_VALUE;
		// 높이
		int height = 0;
		
		Integer arr[] = new Integer[N * M];
		int index = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				arr[index] = Integer.parseInt(st.nextToken());
				max = Math.max(max, arr[index]);
				min = Math.min(min, arr[index]);
				index++;
			}
		}
		
		for (int i = max; i >= min; i--) {
			int t = 0;
			int item = B;
			for (int k = 0 ; k < N * M; k++) {
				// 층수가 원하는 층수보다 높을 시 
				if (arr[k] > i) {
					item += (arr[k] - i);
					t += 2 * (arr[k] - i);
				}
				// 층수가 원하는 층수보다 낮을 시 
				else if (arr[k] < i) {
					item -= (i - arr[k]);
					t += i - arr[k];
				}
			}
			
			if (item >= 0 && time > t) {
				time = t;
				height = i;
			}
		}
		
		System.out.println(time + " " + height);
	}
}
