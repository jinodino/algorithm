package a_230731;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class a1746 {
	static int n, m;

	public static void main(String[] args) throws IOException
    {
		// HashSet의 contains()는 O(1), ArrayList의 contains()는 O(n)이다!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        PriorityQueue<String> pq = new PriorityQueue<>();
        
        HashSet<String> set = new HashSet<>(); 
        for (int i = 0 ; i < n ; i++) {
        	set.add(br.readLine());
        }
        
        for (int i = 0 ; i < m ; i++) {
        	String s = br.readLine();
        	if (set.contains(s)) {
        		pq.add(s);
        	}
        }
        
        sb.append(pq.size()).append("\n");
        while (!pq.isEmpty()) {
        	sb.append(pq.poll()).append("\n");
        }
        System.out.println(sb);
    }
	
}
