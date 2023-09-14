package a_230526;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		double arr[] = new double[N];
		double max = 0;
		double sum = 0;
		double ans = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0 ; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (arr[i] > max) max = arr[i];
		}

		for (int i = 0 ; i < N; i++) {
			arr[i] = (arr[i] / max) * 100;
			sum += arr[i];
		}
		
		ans = sum / N;
		
		System.out.println(ans);
	
	}
}
