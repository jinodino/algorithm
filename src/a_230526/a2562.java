package a_230526;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a2562 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int max = 0;
		int index = 0;
		
		for (int i = 1 ; i <= 9; i++) {
			int N = Integer.parseInt(br.readLine());
			if (N > max) {
				max = N;
				index = i;
			}
		}

		System.out.println(max);
		System.out.println(index);
	
	}
}