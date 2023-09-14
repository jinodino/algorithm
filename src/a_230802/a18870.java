package a_230802;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class a18870 {
	static int n, m;

	public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[n];
        int stored[] = new int[n];
        for (int i = 0 ; i < n ; i++) {
        	int tmp = Integer.parseInt(st.nextToken());
        	arr[i] = tmp;
        	stored[i] = tmp;
        }
        
        
        int rank[] = new int[n];
        Arrays.sort(stored);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        int rankt = 0;
        for (int i = 0 ; i < n ; i++) {
        	if (i > 0) {
        		if (stored[i] > stored[i - 1]) rankt++;
        	}
        	map.put(stored[i], rankt);
        }
        
        for (int i = 0 ; i < n ; i++) {
        	rank[i] = map.get(arr[i]);
        	sb.append(rank[i] + " ");
        }
        
        System.out.println(sb);
    }
	
}
