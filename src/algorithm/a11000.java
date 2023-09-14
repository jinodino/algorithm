package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class a11000 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		
		List<List<Integer>> l = new ArrayList<>();
		
		for (int i = 0 ; i < N; i ++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int t1 = Integer.parseInt(st.nextToken());
			int t2 = Integer.parseInt(st.nextToken());
			List<Integer> arrRowItems = new ArrayList<>();
			arrRowItems.add(t1);
			arrRowItems.add(t2);
			l.add(arrRowItems);
		}
	
		
		
		Collections.sort(l, new Comparator<List>() {
            @Override
            public int compare(List o1, List o2) {
                return (int) o1.get(0) != (int) o2.get(0) ? (int) o1.get(0) - (int) o2.get(0) : (int) o1.get(1) - (int) o2.get(1);
//                o1[0]!=o2[0] ? o1[0]-o2[0] : o1[1]-o2[1]
            }
        });
		System.out.println(l);
		int classRoom = 1;
		int targetTime = l.get(0).get(1);
		l.remove(0);	

		while (l.size() > 0) {
			Stack<Integer> s = new Stack<>();
			int size = l.size();
			for (int i = 0 ; i < size; i++) {
				if (targetTime <= l.get(i).get(0)) {	
					targetTime = l.get(i).get(1);
					s.push(i);
				}
			}
			targetTime = 0;
			while (!s.isEmpty()) {
				int temp = s.pop();
				l.remove(temp);
			}
			
			if (l.size() > 0) {
				classRoom++;
			}
		}

		System.out.println(classRoom);
		
	}

}
