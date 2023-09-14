package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class a1049 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); 
		int M = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Integer> q1 = new PriorityQueue<>();
		PriorityQueue<Integer> q2 = new PriorityQueue<>();
		for (int i = 0 ; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			q1.add(Integer.parseInt(st.nextToken()));
			q2.add(Integer.parseInt(st.nextToken()));
		}
		
		int c6 = q1.poll(); //20
		int c1 = q2.poll(); //4
		int sum = 0;
		
		if (N > 6) {
			// 1개 가격 당이 좋은지 6개당이 좋은디 파악
			if (c6 > c1 * 6) {
				// 한개당이 좋을 경우
				sum = N * c1;
			} else {
				if (N % 6 == 0) {
					sum = (N / 6) * c6;
				} else {
					sum = (N / 6) * c6;
					if (c6 > (N % 6) * c1) {
						sum += (N % 6) * c1;
					} else {
						sum += c6;
					}
				}
			}
			System.out.println(sum);
		} else {
			if (c6 > c1 * N) {
				System.out.println(c1 * N);
			} else {
				System.out.println(c6);
			}
		}
		
	}
}
