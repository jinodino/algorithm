package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a2720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] insert = new int[N];
		
		
		for (int i = 0; i < N; i++) {
			insert[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < N; i++) {
			int[] coin = new int[4];
			while (insert[i] > 0) {
				int temp = 0;
				// 180
				if (insert[i] / 25 >= 1) {
					temp = (int) Math.floor(insert[i] / 25);
					insert[i] -= 25 * temp;
					coin[0] += temp;
				} else if (insert[i] / 10 >= 1) {
					temp = (int) Math.floor(insert[i] / 10);
					insert[i] -= 10 * temp;
					coin[1] += temp;
				} else if (insert[i] / 5 >= 1) {
					
					temp = (int) Math.floor(insert[i] / 5); 
					insert[i] -= 5 * temp;
					coin[2] += temp;
				} else {
					
					insert[i] -= 1;
					coin[3] += 1;
				}
			}
			System.out.println(coin[0] + " " + coin[1] + " " + coin[2] + " " + coin[3]);
		}
	}

}
