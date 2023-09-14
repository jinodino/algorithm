package a_230601;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a1085 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int arr[] = new int[N + 1];
		
		for (int i = 2; i <= N; i++) {
			arr[i] = i;
		}
		
		for (int i = 2; i <= N; i++) {
			for (int k = i + i; k <= N; k += i) {
				arr[k] = 0; 
			}
		}
		
		for (int i = M; i <= N; i++) {
			if (arr[i] != 0) System.out.println(arr[i]);
		}
	}
}
