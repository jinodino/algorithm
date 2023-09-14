package a_230606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class a10773 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Stack<Integer> s = new Stack<Integer>();
		
		for (int i = 0; i < N; i++) {
			int temp = Integer.parseInt(br.readLine());
			
			if (s.isEmpty() && temp == 0) continue;
			else if (!s.isEmpty() && temp == 0) s.pop();
			else if (temp != 0) s.add(temp);
		}
		
		int ans = 0;
		for (int a : s) {
			ans += a;
		}
		
		System.out.println(ans);
	}
}
