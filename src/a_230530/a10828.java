package a_230530;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class a10828 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
	
		Stack<Integer> s = new Stack<>();
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			if (command.equals("push")) {
				int num = Integer.parseInt(st.nextToken());
				s.push(num);
			} else if (command.equals("pop")) {
				if (s.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(s.pop()).append("\n");	
				} 
			} else if (command.equals("top")) {
				if (s.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(s.peek()).append("\n");	
				} 
			} else if (command.equals("size")) { 
				sb.append(s.size()).append("\n");
			} else if (command.equals("empty")) {
				if (s.isEmpty()) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");	
				} 
			}
		}
		System.out.println(sb);
	}

}
