package a_230526;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a2920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[8];
		int check = 0;
		String ans = "mixed";
		
		arr[0] = Integer.parseInt(st.nextToken());
		if (arr[0] == 1) {
			check = 1;
		} else if (arr[0] == 8) {
			check = 2;
		}
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if (check == 1) {
				ans = "ascending";
				if (arr[i] - arr[i - 1] != 1) {
					ans = "mixed";
					break;
				}
			} else if (check == 2) {
				ans = "descending";
				if (arr[i - 1] - arr[i] != 1) {
					ans = "mixed";
					break;
				}
			}
		}
		
		System.out.println(ans);

	}
}
