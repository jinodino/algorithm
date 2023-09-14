package a_230609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class a11866 {
	static BufferedReader br;
	static StringBuffer sb;
	static StringTokenizer st;
	static int N, K;
	static Queue<Integer> q;
	
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuffer();
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		q = new LinkedList<Integer>();
		
		for (int i = 1 ; i <= N; i++) {
			q.add(i);
		}

		sb.append("<");
		while (q.size() > 0) {
			int temp = 0;
			for (int i = 0; i < K; i++) {
				temp = q.poll();
				if (i < K - 1) q.add(temp);
			}
			
			if (q.size() > 0) sb.append(temp + ", ");
			else sb.append(temp);
		}
		sb.append(">");
		System.out.println(sb);
		
	}
}
