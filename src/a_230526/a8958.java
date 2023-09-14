package a_230526;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0 ; i < N; i++) {
			String line = br.readLine();
			int point = 1;
			int sum = 0;
			for (int j = 0 ; j < line.length(); j++) {
				if (line.charAt(j) == 'X') {
					point = 1;
				} else {
					sum += point;
					point++;
				}
				
			}
			sb.append(sum).append('\n');
		}

		System.out.println(sb);
	}
}
