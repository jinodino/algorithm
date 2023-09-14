package a_230531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class a2789 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		Integer arr[] = new Integer[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		int max = 0;
		for (int i = 0; i < N; i++) {
			int sum = arr[i];
			if (sum >= M) continue;
			for (int j = i + 1; j < N; j++) {
				if (sum + arr[j] >= M) continue;
				sum += arr[j];
				for (int k = j + 1; k < N; k++) {
					if (sum + arr[k] > M) continue;
					if (sum + arr[k] == M) {
						System.out.println(M);
						return;
					} else if (sum + arr[k] < M  && max <= sum + arr[k]) {
						max = sum + arr[k];
					}
				}
				sum -= arr[j];
			}
		}
		
		System.out.println(max);
	}

}
