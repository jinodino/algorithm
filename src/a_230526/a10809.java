package a_230526;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 97 122
		String N = br.readLine();
		int arr[] = new int[26];
		// 초기화
		for (int i = 0 ; i < arr.length ; i++) {
			arr[i] = -1;
		}
		
		for (int i = 0; i < N.length(); i++) {
			if (arr[N.charAt(i) - 97] == -1) arr[N.charAt(i) - 97] = i;
			
		}
		
		for (int i = 0 ; i < arr.length ; i++) {
				System.out.print(arr[i] + " ");
		}
	}
}
