package a_230608;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class a10866 {
	static int N;
	static Deque<Integer> d;
	static StringTokenizer st;
	static StringBuffer sb;
	static int temp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuffer();
		N = Integer.parseInt(br.readLine());
		d = new LinkedList<Integer>();
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			
			if (command.equals("push_back")) {
				d.addLast(Integer.parseInt(st.nextToken()));
			} else if (command.equals("push_front")) {
				d.addFirst(Integer.parseInt(st.nextToken()));
			} else if (command.equals("pop_back")) {
				if (d.peekLast() == null) sb.append(-1).append("\n");
				else sb.append(d.pollLast()).append("\n");
			} else if (command.equals("pop_front")) {
				if (d.peekFirst() == null) sb.append(-1).append("\n");
				else sb.append(d.pollFirst()).append("\n");
			} else if (command.equals("size")) {
				sb.append(d.size()).append("\n");
			} else if (command.equals("empty")) {
				if (d.isEmpty()) sb.append(1).append("\n"); 
				else sb.append(0).append("\n");
			} else if (command.equals("front")) {
				if (!d.isEmpty()) sb.append(d.peekFirst()).append("\n"); 
				else sb.append(-1).append("\n");
			} else if (command.equals("back")) {
				if (!d.isEmpty()) sb.append(d.peekLast()).append("\n"); 
				else sb.append(-1).append("\n");
			}
		}
		
		System.out.println(sb);
	}
}
