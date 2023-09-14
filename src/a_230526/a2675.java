package a_230526;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0 ; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			// 반복수
			int R = Integer.parseInt(st.nextToken());
			// 문자열
			String S = st.nextToken();
			
			for (int j = 0 ; j < S.length(); j++) {
				if (S.trim().equals("")) break;
				for (int c = 0; c < R; c++) {
					sb.append(S.charAt(j));
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
