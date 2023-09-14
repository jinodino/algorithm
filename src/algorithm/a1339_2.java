package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class a1339_2 {
	static BufferedReader br;
	static int n;
	static String str;
	static int[] alp;
	static int num, sum;

	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		alp = new int[26];
		for(int i = 0; i < n; i++) {
			str = br.readLine();
			for(int j = 0; j < str.length(); j++) {
				alp[str.charAt(j) - 'A'] += Math.pow(10, str.length() - j - 1);
			}
		}
		
		Arrays.sort(alp);
		
		num = 9;
		
		for(int i = 25; i >= 0; i--) {
			if(alp[i] == 0) {
				break;
			}
			sum += (alp[i] * num);
			num--;
		}
		
		System.out.println(sum);
	}
}
