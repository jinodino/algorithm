package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class a1715 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            q.add(Integer.parseInt(br.readLine()));
        }

        int sum = 0;
        while(q.size() > 1){
            int one = q.poll();
            int two = q.poll();
            sum += one+two;
            q.add(one+two);
        }
        
        if (n == 1) {
        	System.out.println(0);
        } else {
        	System.out.println(sum);
        }
	}
}
