package a_230425;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class a1700 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		List<Integer> list = new LinkedList<Integer>();
		List<Integer> insert = new LinkedList<Integer>();
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0 ; i < K; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		int count = 0;
		
		while (!list.isEmpty()) {
			int target = list.remove(0);
			
			if (N > 0) {
				if (!insert.contains(target)) {
					insert.add(target);
					N--;	
				}
			} else if (N == 0 && !insert.contains(target)) {
				boolean check = false;
				for (int i = 0; i < insert.size(); i++) {
					if (!list.contains(insert.get(i))) {
						count++;
						insert.remove(i);
						insert.add(target);
						check = true;
						break;
					}
				}
				
				if (!check) {
					int maxListIndex = -1;
					int maxinsertIndex = -1;
					for (int i = 0; i < insert.size(); i++) {
						if(list.indexOf(insert.get(i)) > maxListIndex){
							maxListIndex = list.indexOf(insert.get(i));
							maxinsertIndex = i;
						}
					}
					
					count++;
					insert.remove(maxinsertIndex);
					insert.add(target);
				}
			}
		}
		
		System.out.println(count);

	}

}
