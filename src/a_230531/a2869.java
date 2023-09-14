package a_230531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a2869 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 올라갈 높이
		int A = Integer.parseInt(st.nextToken());
		// 내려갈 높이
		int B = Integer.parseInt(st.nextToken());
		// 높이
		int V = Integer.parseInt(st.nextToken());
		
		int date = (V - B) / (A - B);
		
		if ((V - B) % (A - B) != 0) date++; 

		System.out.println(date);
	}
}
