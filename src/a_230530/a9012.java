package a_230530;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a9012 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			String word = br.readLine();
			int left = 0;
			int right = 0;
			boolean pair = false;
			
			for (int k = 0; k < word.length(); k++) {
				char pick = word.charAt(k);
				if (k == 0 && pick == ')') break;
				if (pair && pick == ')') {
					pair = false;
					break;
				}
				if (pick == '(') {
					left++;
				} else if (pick == ')') {
					right++;
				}
				
				if (left == right) pair = true;
				else pair = false;
			}
			
			if (pair) sb.append("YES").append("\n");
			else sb.append("NO").append("\n");

		}
		
		System.out.println(sb);
	}

}
