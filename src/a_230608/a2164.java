package a_230608;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class a2164 {
	static int N;
	static int index = 0;
	static int popIndex = 0;
	static Queue<Integer> q;
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		q = new LinkedList<Integer>();
		
		for (int i = 0; i < N; i++) {
			q.add(i + 1);
		}
		
		int i = 0;
		while (true) {
			if (q.size() == 1) break;
			if (i % 2 == 0) {
				q.poll();
			} else {
				int temp = q.poll();
				q.add(temp);
			}
			i++;
		}

		System.out.println(q.poll());
	}
}
