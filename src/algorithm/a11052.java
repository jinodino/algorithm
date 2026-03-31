package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class a11052 {
	
	static BufferedReader br;
	static BufferedWriter bw;
	static int [] arr;

	public static void main(String[] args) throws NumberFormatException, IOException {

		br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		arr = new int[5001];

		Arrays.fill(arr, 9999);
		arr[0] = 0;
		for (int i = 3; i < n + 1; i++) {
            arr[i] = Math.min(arr[i], arr[i - 3] + 1);
			if (i >= 5) arr[i] = Math.min(arr[i], arr[i - 5] + 1);
		}

		System.out.println(arr[n] >= 9999 ? -1 : arr[n]);
	}
}
