package a_230801;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class a1927 {
	static int n;

	public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        
        n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i = 0 ; i < n ; i++) {
        	int tmp = Integer.parseInt(br.readLine());
        	
        	if (tmp == 0) {
        		if (pq.isEmpty()) {
        			sb.append(tmp).append("\n");
        		} else {
        			sb.append(pq.poll()).append("\n");
        		}
        	} else {
        		pq.add(tmp);
        	}
        }
        
        System.out.println(sb);
    }
	
}
