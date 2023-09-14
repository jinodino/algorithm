package a_230424;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class a14916 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		for (int i = 0 ; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		int count = 0;
		for (int i = N-2 ; i >= 0; i--) {
			if(arr[i] >= arr[i+1]) { 
				int diff = arr[i] - arr[i+1] + 1; 
				count += diff;
				arr[i] -= diff;
			}
		}
		
		System.out.println(count);
	}

}
