package a_230608;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a10845 {
	static int N;
	static int index = 0;
	static int popIndex = 0;
	static int[] arr;
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		N = Integer.parseInt(br.readLine());
		arr = new int[100000];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			
			if (command.equals("push")) {
				int num = Integer.parseInt(st.nextToken());
				arr[index] = num;
				index++;
			} else if (command.equals("pop")) {
				if (arr[popIndex] == 0) sb.append(-1).append("\n");
				else {
					sb.append(arr[popIndex]).append("\n");
					popIndex++;
				}
			} else if (command.equals("size")) {
				sb.append(index - popIndex).append("\n");
			} else if (command.equals("empty")) {
				if (arr[popIndex] == 0) sb.append(1).append("\n");
				else sb.append(0).append("\n");
			} else if (command.equals("front")) {
				// 이쪾부분 고쳐야
				if (arr[popIndex] == 0) sb.append(-1).append("\n");
				else sb.append(arr[popIndex]).append("\n");
			} else if (command.equals("back")) {
				if ((index != 0 && arr[index - 1] != 0) && index != popIndex) sb.append(arr[index - 1]).append("\n");
				else sb.append(-1).append("\n");
			}
		}
		
		System.out.println(sb);
	}

}
