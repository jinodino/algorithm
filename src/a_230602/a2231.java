package a_230602;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a2231 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String a = Integer.toString(N);
		
		boolean check = false;
		int ans = 0;
		for (int i = a.length() * 9; i >= 1; i--) {
			ans = N - i;
			String index = Integer.toString(ans);
			int temp = ans;
			if (ans < 1) continue;
			for (int k = 0 ; k < index.length(); k++) {
				temp += Integer.parseInt(index.substring(k, k + 1));
			}
			if (temp == N) {
				check = true;
				break;
			}
		}
		
		if (check) System.out.println(ans);
		else System.out.println(0);
	}
}
