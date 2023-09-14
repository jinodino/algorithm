package a_230424;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a1213 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine();
		
		int[] alp = new int[26];
		for (int i = 0; i < N.length(); i++) {
			alp[N.charAt(i) - 'A']++;
		}
		
		int odd = 0;
		char center = 0;
		for (int i = 0; i < alp.length; i++) {
			if (alp[i] % 2 != 0) {
				odd++;
				center = (char) (i + 'A'); 
			}
		}
		
		if (odd > 1 || (odd == 1 && N.length() % 2 == 0)) {
			System.out.println("I'm Sorry Hansoo");
			return;
		}
		
		StringBuffer result = new StringBuffer();
		
		for (int i = 0; i < alp.length; i++) {
			if (alp[i] == 0) continue;
			for (int j = 0; j < alp[i] / 2; j++) {
				result.append((char) (i + 'A'));
			}
		}
		
		
		StringBuffer temp = new StringBuffer(result);

		if (odd == 1) result.append(center);
		result.append(temp.reverse());

		System.out.println(result);
		
	}

}
