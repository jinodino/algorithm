package a_230530;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a1978 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int ans = 0;
		for (int i = 0; i < N; i++) {
			int number = Integer.parseInt(st.nextToken());
			boolean check = true;
			
			if (number == 0 || number == 1) continue;
			if (number == 2) {
				ans++;
				continue;
			}
			
			for (int k = 2; k < number; k++) {
				if (number % k == 0) {
					check = false;
					break;
				}
			}
			
			if (check) ans++;
		}
		
		System.out.println(ans);
	
	}

}
