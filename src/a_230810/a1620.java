package a_230810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class a1620 {

	public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        String arr[] = new String[n + 1];
        for (int i = 1 ; i <= n ; i++) {
        	String key = br.readLine();
        	map.put(key, i);
        	arr[i] = key;
        }
        
        for (int i = 0 ; i < m ; i++) {
        	String target = br.readLine();
        	
        	char a = target.charAt(0);
        	
        	if (a >= 48 && a <= 57) {
        		sb.append(arr[Integer.parseInt(target)]).append("\n");
        	} else {
        		sb.append(map.get(target)).append("\n");
        	}
        }
 
        
        System.out.println(sb);
    }
	
}
