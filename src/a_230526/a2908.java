package a_230526;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String A = st.nextToken();
		String B = st.nextToken();
		
		String reverse = "";
		for (int i = A.length() - 1 ; i >= 0; i--) {
			reverse = reverse + A.charAt(i);
		}
		A = reverse;
		
		reverse = "";
		for (int i = B.length() - 1 ; i >= 0; i--) {
			reverse = reverse + B.charAt(i);
		}
		B = reverse;
	
		System.out.println(Integer.parseInt(A) > Integer.parseInt(B) ? Integer.parseInt(A) : Integer.parseInt(B));
	}
}
