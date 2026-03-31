package algorithm;

import java.io.*;

public class a10844 {
	
	static BufferedReader br;
	static BufferedWriter bw;
	static long [][] arr;

	public static void main(String[] args) throws NumberFormatException, IOException {

		br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		arr = new long[101][10];

		for (int i = 1; i < 10; i++) {
			arr[1][i] = 1;
		}

		long sum = 0;
		for (int i = 2; i <= n; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 9) {
					arr[i][j] = arr[i-1][8] % 1000000000;
				} else if (j == 0) {
					arr[i][j] = arr[i-1][1] % 1000000000;
				}
				else {
					arr[i][j] = (arr[i-1][j-1] + arr[i-1][j+1]) % 1000000000;
				}
			}
		}

		for (int i = 0; i < 10 ; i ++) {
			sum += arr[n][i];
		}
		System.out.println(sum % 1000000000);

	}
}
