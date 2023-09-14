package a_230607;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a10814 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int N = Integer.parseInt(br.readLine());
		
		String arr[][] = new String[N][2];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		
		Arrays.sort(arr, (o1, o2) -> {
			return Integer.parseInt(o1[0])  - Integer.parseInt(o2[0]);
		});
		
		for (String[] arr2 : arr) {
			sb.append(arr2[0] + " " + arr2[1]).append("\n");
		}
		
		System.out.println(sb);
	}
}
