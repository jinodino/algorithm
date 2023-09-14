package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class poppin {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		// N은 인원 수, 탄산 내성(1< 2^n겹치지않음)
		int N = Integer.parseInt(st.nextToken()); 
		// M 이변의 수
		int M = Integer.parseInt(st.nextToken());
		// K 시은이의 탄산 내성
		int K = Integer.parseInt(st.nextToken());
		
		int logP =(int) (Math.log(N) / Math.log(2));
		
		if (N == K) { System.out.println(logP); return; }

		int[] arr = new int[N];
		arr[0] = K;
		for (int i = 1; i < N; i++) {
			if (K <= i) { 
				arr[i] = i+1;
			} else {
				arr[i] = i;
			}
		}
		
		int index = 0;
		int startLog = 0;
		int win = 0;
		while (true) {
			int log =(int) Math.pow(2, startLog);
			index += log;
			
			if (win == logP){
				break;
			} else if(K > arr[index]) {
				win++;
			} else if (K < arr[index]) {
				if (M > 0) {
					M--;
					win++;
				} else {
					break;
				}
			} 
			
			startLog++;		
		}
		
		System.out.println(win);
		
//		for (int i = 1; i <= logP; i++) {
//			if (K < (int) Math.pow(2, i)) {
//				index = i;
//				break;
//			}
//		}
		
		
		
//		Queue<Integer> q = new LinkedList<>();
//		// 첫 시작에 놓기 위함
//		q.add(K);
//		for (int i = 1; i <= N; i++) {
//			if (K == i) { continue; }
//			q.add(i);
//		}
//		
//		int count = 0;
//		int win = 0;
//		// 총 게임의 수 (N / 2) + 1
//		while (count < N-1) {
//			if(!q.contains(K)) { break; }
//			System.out.println("CC : " +  count);
//			int t1 = q.poll();
//			int t2 = q.poll();
//			 	
//			if(t1 == K && M != 0 && t1 < t2) {
//				q.add(t1);
//				M--;
//				win++;
//			} else if (t1 == K && t1 > t2) {
//				q.add(t1);
//				win++;
//			} else {
//				q.add(Math.max(t1, t2));
//			}
//			
//			count++;
//		}
//
//		System.out.println(win);	
	}
}
