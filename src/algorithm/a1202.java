package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class a1202 {
	
	static BufferedReader br;
	static int N, K;
	static int[] Carr;
	static int[][] Rarr;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); 
		K = Integer.parseInt(st.nextToken());

		Rarr = new int[N][2];
		for (int i = 0; i < N; i++) {	
			String str = br.readLine();
			String[] arr = str.split(" ");

			Rarr[i][0] = Integer.parseInt(arr[0]);
			Rarr[i][1] = Integer.parseInt(arr[1]);
		}
		
		Carr = new int[K];
		for (int i = 0; i < K; i++) {
			// 가방 무게
			Carr[i] = Integer.parseInt(br.readLine()); 
		}
		
		Arrays.sort(Rarr, (e1, e2) -> {
			return e1[0] - e2[0];
		});
		Arrays.sort(Carr);

		int sum = 0;
		int index = 0;
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		
		for (int i = 0; i < K; i++) {
			int temp = Carr[i]; 
			while (index < N) {
				if (Rarr[index][0] <= temp) {
					q.add(Rarr[index][1]);
					index++;
				} else {
					break;
				}
			}
			if(!q.isEmpty()) {
				sum += q.poll();
			}
		}

		System.out.println(sum);
	}
}
