package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class a1744 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		List<Integer> l = new ArrayList<Integer>();
		List<Integer> lm = new ArrayList<Integer>();
		
		for (int i = 0; i < N; i++) {
			int temp = Integer.parseInt(br.readLine());
			
			if (temp > 0) {
				l.add(temp);
			} else {
				lm.add(temp);
			}
		}
		
		Collections.sort(l, Collections.reverseOrder());
		Collections.sort(lm);
		
		int sum = 0;
		int index = 0;
		
		while (index < l.size()) {
			
			if (index + 1 < l.size() && l.get(index) != 1 && l.get(index + 1) != 1) {
				sum += l.get(index) * l.get(index + 1);
				index++;
			} else {
				sum += l.get(index);
			}
			index++;
		}
		
		
		index = 0;
		while (index < lm.size()) {
			if (index + 1 < lm.size()) {
				sum += lm.get(index) * lm.get(index + 1);
				index++;
			} else {
				sum += lm.get(index);
			}
			index++;
		}
		
		System.out.println(sum);
	}

}
