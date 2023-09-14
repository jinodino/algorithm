package a_230526;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a10952 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean flag = true;
		StringBuilder sb = new StringBuilder();
		while (flag) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if (A + B == 0) {
				flag = false;
				break;
			}
			sb.append(A+B).append("\n");
		}
		
		System.out.println(sb);
	}
}