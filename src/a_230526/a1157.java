package a_230526;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine().toUpperCase();
		int count[] = new int[26];
		int max = 0;
		char ans = '?';
		
		for (int i = 0; i < N.length(); i++) {
			count[N.charAt(i) - 65]++;
		}

		for (int i = 0; i < count.length; i++) {
			if (count[i] == 0) continue;
			
			if (count[i] > max) {
				max = count[i];
				ans = (char) (i + 65);
			} else if (count[i] == max) {
				ans = '?';
			}
		}
		
		System.out.println(ans);
	}
}
