package a_230420;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class a2437 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
		
		int N = Integer.parseInt(br.readLine());
		
		Integer[] arr = new Integer[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0 ; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
	
		int ans = 0;
		for (int i = 0; i < N; i++) {
			if (ans + 1 < arr[i]) {
                break;
            }

			ans += arr[i];
			System.out.println(arr[i]);
		}
		
		System.out.println(ans + 1);
	}
}
