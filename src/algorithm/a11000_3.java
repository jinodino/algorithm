package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class a11000_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		
		Queue<Integer> q = new LinkedList<>();

		for (int i = 0 ; i < N; i ++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int t1 = Integer.parseInt(st.nextToken());
			int t2 = Integer.parseInt(st.nextToken());
			arr[i][0] = t1;
			arr[i][1] = t2;
		}
		
//		Arrays.sort(arr, new Comparator<int[]>() {
//		    @Override
//		    public int compare(int[] o1, int[] o2) {
//		        return o1[0]!=o2[0] ? o1[0]-o2[0] : o1[1]-o2[1];
//		    }
//		});
	
		Arrays.sort(arr, ((x, y) -> x[0] != y[0] ? x[0] - y[0] : x[1] - y[1]));
		

		int classRoom = 0;
		int targetTime = 0;
		for (int i = 0 ; i < N; i++) {
			if (q.contains(i)) {
				continue;
			}
			
			targetTime = arr[i][1];
			classRoom++;
			q.add(i);

			for (int j = 0; j < N; j++) {
				if (q.contains(j)) {
					continue;
				}
				
				if (targetTime <= arr[j][0]) {	
					targetTime = arr[j][1];
					q.add(j);
				}
			}
		}
		
		System.out.println(classRoom);
		
	}

}
