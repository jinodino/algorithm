package a_230526;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a10818 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int min = 1000000;
		int max = -1000000;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0 ; i < N; i++) {
			int param = Integer.parseInt(st.nextToken());
			if (min > param) {
				min = param;
			}
			
			if (max < param) {
				max = param;
			}
		}
		
		System.out.println(min + " " + max);
	
	}
}