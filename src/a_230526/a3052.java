package a_230526;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a3052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[] = new int[10];
		
		for (int i = 0 ; i < 10; i++) {
			arr[i] = -1;
		}
		
		int N = Integer.parseInt(br.readLine());
		arr[0] = N % 42;
		for (int i = 1 ; i < 10; i++) {
			N = Integer.parseInt(br.readLine());
			int left = N % 42;
			boolean check = true;
			for (int j = 0 ; j < i; j++) {
				if (arr[j] == left) check = false;
			}
			
			if (check) arr[i] = left;
		}
		
		int ans = 0;
		for (int i = 0 ; i < 10; i++) {
			if (arr[i] != -1) ans++; 
		}

		System.out.println(ans);
	}
}
